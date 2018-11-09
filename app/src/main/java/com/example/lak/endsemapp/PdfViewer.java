package com.example.lak.endsemapp;

import android.app.usage.UsageEvents;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
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

    SharedPreferences sharedPreferences2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pdf_viewer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        hideSystemUI();


        Bundle extras=getIntent().getExtras();

        filename=extras.getString("PaperName").toString();

        filename+=".pdf";
        if(savedInstanceState !=null){
            CharSequence savedText = savedInstanceState.getCharSequence("pagenum");
            String pn=""+savedText;
            pageNumber=Integer.parseInt(pn);
        }

        sharedPreferences2=getSharedPreferences("PAGES", Context.MODE_PRIVATE);

        if(sharedPreferences2.contains(filename)){
            String NM=sharedPreferences2.getString(filename,"");
            pageNumber=Integer.parseInt(NM);
            Log.d("SavingPages","Read"+filename+" "+pageNumber);
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
        hideSystemUI();
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
            //Toast.makeText(getApplicationContext(),"PLease Select a file !",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sharedPreferences2=getSharedPreferences("PAGES", Context.MODE_PRIVATE);
        SharedPreferences.Editor data= sharedPreferences2.edit();
        data.putString(filename,""+pageNumber);
        data.commit();
        Log.d("SavingPages","Written"+filename+" "+pageNumber);
    }
    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

}
