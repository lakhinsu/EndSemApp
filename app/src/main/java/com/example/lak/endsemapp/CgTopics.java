package com.example.lak.endsemapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lak on 02-09-2018.
 */

public class CgTopics {
    public ArrayList<String> listDataHeader;
    public HashMap<String, List<String>> listDataChild;

    public void prepareList()
    {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Basics of Computer Graphics");
        listDataHeader.add("Graphics Primitives");
        listDataHeader.add("2D transformation and viewing");
        listDataHeader.add("3D concepts and object representation");
        listDataHeader.add("3D transformation and viewing");
        listDataHeader.add("Advance topics");


        List<String> chapter1=new ArrayList<>();
        chapter1.add("Basic of Computer Graphics");
        chapter1.add("Applications of computer graphics");
        chapter1.add("Display devices");
        chapter1.add("Random and Raster scan systems");
        chapter1.add("Graphics input devices");
        chapter1.add("Graphics software and standards");

        List<String> chapter2=new ArrayList<>();
        chapter2.add("Points");
        chapter2.add("lines");
        chapter2.add("circles and ellipses as primitives");
        chapter2.add("scan conversion algorithms for primitives");
        chapter2.add("Fill area primitives including scan-line polygon filling");
        chapter2.add("inside-outside test");
        chapter2.add("boundary and flood-fill");
        chapter2.add("character generation");
        chapter2.add("line attributes");
        chapter2.add("area-fill attributes");
        chapter2.add("character attributers");

        List<String> chapter3=new ArrayList<>();
        chapter3.add("translation");
        chapter3.add("rotation");
        chapter3.add("matrix representation");
        chapter3.add("homogeneous coordinates");
        chapter3.add("composite transformations");
        chapter3.add("reflection and shearing");
        chapter3.add("viewing pipeline and coordinates system");
        chapter3.add("window-to-viewport transformation");
        chapter3.add("clipping including point clipping");
        chapter3.add("cohen-sutherland");
        chapter3.add("liang- bersky");
        chapter3.add("NLN");
        chapter3.add("Polygon Clipping");


        List<String> chapter4=new ArrayList<>();
        chapter4.add("3D display methods");
        chapter4.add("polygon surfaces");
        chapter4.add("tables");
        chapter4.add("equations");
        chapter4.add("meshes");
        chapter4.add("curved lies and surfaces");
        chapter4.add("quadric surfaces");
        chapter4.add("spline representation");
        chapter4.add("cubic spline interpolation methods");
        chapter4.add("Bazier curves and surfaces");
        chapter4.add("B-spline curves and surfaces ");

        List<String > chapter5=new ArrayList<>();
        chapter5.add("3D scaling");
        chapter5.add("rotation and translation");
        chapter5.add("composite transformation");
        chapter5.add("viewing pipeline and coordinates");
        chapter5.add("parallel and perspective transformation");
        chapter5.add("Parallel Projection Transformations");
        chapter5.add("Perspective Projections Transformations");

        List<String > chapter6=new ArrayList<>();
        chapter6.add("visible surface detection concepts");
        chapter6.add("back-face detection");
        chapter6.add("depth buffer method");
        chapter6.add("illumination");
        chapter6.add("light sources");
        chapter6.add("ambient method");
        chapter6.add("Diffuse method");
        chapter6.add("reflection method");
        chapter6.add("specular method");
        chapter6.add("Properties of Light");
        chapter6.add("XYZ");
        chapter6.add("RGB");
        chapter6.add("YIQ");
        chapter6.add("CMY");

        //62

        listDataChild.put(listDataHeader.get(0),chapter1);
        listDataChild.put(listDataHeader.get(1),chapter2);
        listDataChild.put(listDataHeader.get(2),chapter3);
        listDataChild.put(listDataHeader.get(3),chapter4);
        listDataChild.put(listDataHeader.get(4),chapter5);
        listDataChild.put(listDataHeader.get(5),chapter6);











    }
}
