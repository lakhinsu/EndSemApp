package com.example.lak.endsemapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class PdfViewer extends AppCompatActivity implements OnPageChangeListener,OnLoadCompleteListener {

    PDFView pdfView;
    Integer pageNumber = 0;
    String pdfFileName;
    Boolean nighMode;
    String filename;

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras=getIntent().getExtras();

        filename=extras.getString("PaperName").toString();

        filename+=".pdf";
        if(savedInstanceState !=null){
            CharSequence savedText = savedInstanceState.getCharSequence("pagenum");
            String pn=""+savedText;
            pageNumber=Integer.parseInt(pn);
        }


        pdfView= (PDFView)findViewById(R.id.pdfView);
        displayFromAsset(filename);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putCharSequence("pagenum",""+pageNumber);
    }

    public void displayFromAsset(String assetFileName) {
        pdfFileName = assetFileName;
        sharedpreferences = getSharedPreferences(SettingActivity.MyPREFERENCES, MODE_PRIVATE);

        String NM=sharedpreferences.getString(SettingActivity.NightMode,"");

        if(NM.equals("true")){
            nighMode=true;
        }
        else
            nighMode=false;

        pdfView.fromAsset(pdfFileName)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))

                .pageFitPolicy(FitPolicy.WIDTH)

                .nightMode(nighMode)

                .load();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));
    }

    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");

    }

    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            //Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menubutton,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.settings:
                Intent I=new Intent(this,SettingActivity.class);
                startActivityForResult(I,86);
        }
        return true;
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode==86 && resultCode==RESULT_OK && data!=null)
        {
            /*fileUri=data.getData();
            Toast.makeText(getApplicationContext(),data.getData().toString(),Toast.LENGTH_SHORT).show();
            tempFile=data.getData().getLastPathSegment();
            f1.setText(" "+data.getData().toString());*/

            //this is point
            displayFromAsset(filename);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"PLease Select a file !",Toast.LENGTH_SHORT).show();
        }
    }


}
