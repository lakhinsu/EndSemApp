package com.example.lak.endsemapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lak on 02-09-2018.
 */

public class JavaTopics {

    public ArrayList<String> listDataHeader;
    public HashMap<String, List<String>> listDataChild;

    public void prepareList() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();


        listDataHeader.add("Basics of Java");
        listDataHeader.add("Array and String");
        listDataHeader.add("Classes, Objects and Methods");
        listDataHeader.add("Inheritance and Interfaces");
        listDataHeader.add("Package");
        listDataHeader.add("Exception Handling");
        listDataHeader.add("Multithreaded Programming");
        listDataHeader.add("IO Programming");
        listDataHeader.add("Collection Classes");
        listDataHeader.add("Networking with java.net");
        listDataHeader.add("Introduction to Object orientation");
        listDataHeader.add("Class Modeling");
        listDataHeader.add("Advanced class Modeling");
        listDataHeader.add("State modeling");
        listDataHeader.add("Interaction Modeling");

        List<String> chapter1=new ArrayList<>();
        chapter1.add("Features of Java");
        chapter1.add("Byte Code and Java Virtual Machine");
        chapter1.add("JDK");
        chapter1.add("Data types");
        chapter1.add("Operator");
        chapter1.add("Control Statements");

        List<String> chapter2=new ArrayList<>();
        chapter2.add("Single and Multidimensional Array");
        chapter2.add("String class");
        chapter2.add("StringBuffer class");
        chapter2.add("Operations on string");
        chapter2.add("Command line argument");
        chapter2.add("Use of Wrapper Class");

        List<String> chapter3=new ArrayList<>();
        chapter3.add("Class");
        chapter3.add("Object");
        chapter3.add("Object reference");
        chapter3.add("Constructor");
        chapter3.add("Constructor Overloading");
        chapter3.add("Method Overloading");
        chapter3.add("Recursion");
        chapter3.add("Passing and Returning object form Method");
        chapter3.add("New operator");
        chapter3.add("This and static keyword");
        chapter3.add("finalize() method");
        chapter3.add("Access control");
        chapter3.add("modifiers");
        chapter3.add("Nested class");
        chapter3.add("Inner class");
        chapter3.add("Anonymous inner class");
        chapter3.add("Abstract class");

        List<String> chapter4=new ArrayList<>();
        chapter4.add("Use of Inheritance");
        chapter4.add("Inheriting Data members and Methods");
        chapter4.add("constructor in inheritance");
        chapter4.add("Multilevel Inheritance – method overriding Handle multilevel constructors – super keyword,Stop ");
        chapter4.add("Inheritance - Final keywords, Creation and Implementation of an interface");
        chapter4.add("Interface reference");
        chapter4.add("instanceof operator");
        chapter4.add("Interface inheritance");
        chapter4.add(" Dynamic method dispatch");
        chapter4.add("Understanding of Java Object Class");
        chapter4.add("Comparison between Abstract Class and interface");
        chapter4.add("Understanding of System.out.println – statements");

        List<String> chapter5=new ArrayList<>();
        chapter5.add("Use of Package");
        chapter5.add("CLASSPATH");
        chapter5.add("Import statement");
        chapter5.add("Static import");
        chapter5.add(" Access control");

        List<String> chapter6=new ArrayList<>();
        chapter6.add("Exception and Error");
        chapter6.add("Use of try");
        chapter6.add("Catch");
        chapter6.add("throw");
        chapter6.add("throws and finally");
        chapter6.add("Built in Exception");
        chapter6.add("Custom exception");
        chapter6.add("Throwable Class");

        List<String> chapter7=new ArrayList<>();
        chapter7.add("Use of Multithread programming,");
        chapter7.add("Thread class and Runnable interface");
        chapter7.add("Thread priority");
        chapter7.add("Thread synchronization");
        chapter7.add("Thread communication");
        chapter7.add("Deadlock");

        List<String> chapter8=new ArrayList<>();
        chapter8.add("Introduction to Stream");
        chapter8.add("Byte Stream");
        chapter8.add("Character stream");
        chapter8.add("Readers and Writers");
        chapter8.add("File Class");
        chapter8.add("File InputStream");
        chapter8.add("File Output Stream");
        chapter8.add("InputStreamReader");
        chapter8.add("OutputStreamWriter");
        chapter8.add("FileReader");
        chapter8.add("FileWriter");
        chapter8.add("Buffered Reader");

        List<String> chapter9=new ArrayList<>();
        chapter9.add("List");
        chapter9.add("AbstractList");
        chapter9.add("ArrayList");
        chapter9.add("LinkedList");
        chapter9.add("Enumeration");
        chapter9.add("Vector");
        chapter9.add("Properties");
        chapter9.add("Introuduction to Java.util package");

        List<String> chapter10=new ArrayList<>();
        chapter10.add("InetAddress class");
        chapter10.add("Socket class");
        chapter10.add("DatagramSocket class");
        chapter10.add("DatagramPacket class");

        List<String> chapter11=new ArrayList<>();
        chapter11.add("Introduction to Object orientation");
        chapter11.add("Modeling as a Design Technique Modeling Concepts");
        chapter11.add("abstraction");
        chapter11.add("The three models");
        chapter11.add("Class Model");
        chapter11.add("State model and Interaction model");

        List<String> chapter12=new ArrayList<>();
        chapter12.add("Object and class concepts");
        chapter12.add("link and association");
        chapter12.add("Generalization and Inheritance ");


        List<String> chapter13=new ArrayList<>();
        chapter13.add("Advanced Object and class concepts");
        chapter13.add("Association Ends");
        chapter13.add("N-ary associations");
        chapter13.add("aggregation");
        chapter13.add("aggregation");
        chapter13.add("multiple inheritance");
        chapter13.add("Metadata");
        chapter13.add("Constraints");
        chapter13.add("Derived data");
        chapter13.add("Packages");

        List<String> chapter14=new ArrayList<>();
        chapter14.add("Events");
        chapter14.add("States");
        chapter14.add("Transition and conditions");
        chapter14.add("state diagram");
        chapter14.add(" state diagram behavior");

        List<String> chapter15=new ArrayList<>();
        chapter15.add("Use case models");
        chapter15.add("Sequence models");
        chapter15.add("Activity Models");

        //111

        listDataChild.put(listDataHeader.get(0),chapter1);
        listDataChild.put(listDataHeader.get(1),chapter2);
        listDataChild.put(listDataHeader.get(2),chapter3);
        listDataChild.put(listDataHeader.get(3),chapter4);
        listDataChild.put(listDataHeader.get(4),chapter5);
        listDataChild.put(listDataHeader.get(5),chapter6);
        listDataChild.put(listDataHeader.get(6),chapter7);
        listDataChild.put(listDataHeader.get(7),chapter8);
        listDataChild.put(listDataHeader.get(8),chapter9);
        listDataChild.put(listDataHeader.get(9),chapter10);
        listDataChild.put(listDataHeader.get(10),chapter11);
        listDataChild.put(listDataHeader.get(11),chapter12);
        listDataChild.put(listDataHeader.get(12),chapter13);
        listDataChild.put(listDataHeader.get(13),chapter14);
        listDataChild.put(listDataHeader.get(14),chapter15);
    }
}
