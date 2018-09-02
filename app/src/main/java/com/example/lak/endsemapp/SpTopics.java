package com.example.lak.endsemapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lak on 02-09-2018.
 */

public class SpTopics {
    public ArrayList<String> listDataHeader;
    public HashMap<String, List<String>> listDataChild;

    public void prepareList() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Overview of System Software");
        listDataHeader.add("Overview of Language Processors");
        listDataHeader.add("Assemblers");
        listDataHeader.add("Macro and Macro Processors");
        listDataHeader.add("Linkers and Loaders");
        listDataHeader.add("Scanning and Parsing");
        listDataHeader.add("Compilers");
        listDataHeader.add("Interpreters & Debuggers");

        List<String> chapter1=new ArrayList<>();
        chapter1.add("Introduction");
        chapter1.add("Software");
        chapter1.add("Software Hierarchy");
        chapter1.add("Systems Programming");
        chapter1.add("Machine Structure");
        chapter1.add("Interfaces");
        chapter1.add("Address Space");
        chapter1.add("Computer Languages");
        chapter1.add("Tools");
        chapter1.add("Life Cycle of a Source Program");
        chapter1.add("Different Views on the Meaning of a Program");
        chapter1.add("System Software Development");
        chapter1.add("Recent Trends in SoftwareDevelopment");
        chapter1.add("Levels of System Software");

        List<String> chapter2=new ArrayList<>();
        chapter2.add("Programming Languages and Language Processors");
        chapter2.add("Language Processing Activities");
        chapter2.add("Program Execution");
        chapter2.add("Fundamental of Language Processing");
        chapter2.add("Symbol Tables Data Structures for Language Processing: Search Data structures");
        chapter2.add("Allocation Data Structures");

        List<String> chapter3=new ArrayList<>();
        chapter3.add("Elements of Assembly Language Programming");
        chapter3.add("Design of the Assembler, Assembler Design Criteria");
        chapter3.add("One-Pass Assemblers");
        chapter3.add("Two-Pass Assemblers");
        chapter3.add("Single pass Assembler for Intel x86  Algorithm of Single Pass Assembler");
        chapter3.add("Multi-Pass Assemblers");
        chapter3.add("Advanced Assembly Process");
        chapter3.add("Variants of Assemblers Design of two pass assembler");

        List<String> chapter4=new ArrayList<>();
        chapter4.add("Introduction");
        chapter4.add("Macro Definition and Call");
        chapter4.add("Macro Expansion");
        chapter4.add("Nested Macro alls");
        chapter4.add("Advanced Macro Facilities");
        chapter4.add("Design of a Macro Pre-processor");
        chapter4.add("design of a Macro Assembler");
        chapter4.add("Functions of a Macro Processor");
        chapter4.add("Basic Tasks of a Macro Processor");
        chapter4.add("Design Issues of Macro Processors");
        chapter4.add("Features");
        chapter4.add("Macro Processor Design Options");
        chapter4.add("Two-Pass Macro Processors");
        chapter4.add("One-Pass Macro Processors");

        List<String> chapter5=new ArrayList<>();
        chapter5.add("Introduction");
        chapter5.add("Relocation of Linking Concept, Design of a Linker");
        chapter5.add("Self-Relocating Programs");
        chapter5.add("Linking in MSDOS");
        chapter5.add("Linking of Overlay Structured Programs");
        chapter5.add("Dynamic Linking, Loaders");
        chapter5.add("Different Loading Schemes");
        chapter5.add("Sequential and Direct Loaders");
        chapter5.add("Compile-and-Go Loaders");
        chapter5.add("General Loader Schemes");
        chapter5.add("Absolute Loaders");
        chapter5.add("Relocating Loaders");
        chapter5.add("Practical Relocating Loaders");
        chapter5.add("Linking Loaders");
        chapter5.add("Relocating Linking Loaders");
        chapter5.add("Linkers v/s Loaders");

        List<String> chapter6=new ArrayList<>();
        chapter6.add("Programming Language Grammars");
        chapter6.add("Classification of Grammar");
        chapter6.add("Ambiguity in Grammatic Specification");
        chapter6.add("Scanning");
        chapter6.add("Parsing");
        chapter6.add("Top Down Parsing");
        chapter6.add("Bottom up Parsing");
        chapter6.add("Language Processor Development Tools");
        chapter6.add("LEX");
        chapter6.add("YACC");

        List<String> chapter7=new ArrayList<>();
        chapter7.add("Causes of Large Semantic Gap");
        chapter7.add("Binding and Binding Times");
        chapter7.add("Data Structure used in Compiling");
        chapter7.add("Scope Rules");
        chapter7.add("Memory Allocation");
        chapter7.add("Compilation of Expression");
        chapter7.add("Compilation of Control Structure");
        chapter7.add("Code Optimization");

        List<String> chapter8=new ArrayList<>();
        chapter8.add("Benefits of Interpretation");
        chapter8.add("Overview of Interpretation");
        chapter8.add("The Java Language Environment");
        chapter8.add("Java Virtual Machine");
        chapter8.add("Types of Errors");
        chapter8.add("Debugging Procedures");
        chapter8.add("Classification of Debuggers");
        chapter8.add("Dynamic/Interactive Debugger");

        listDataChild.put(listDataHeader.get(0),chapter1);
        listDataChild.put(listDataHeader.get(1),chapter2);
        listDataChild.put(listDataHeader.get(2),chapter3);
        listDataChild.put(listDataHeader.get(3),chapter4);
        listDataChild.put(listDataHeader.get(4),chapter5);
        listDataChild.put(listDataHeader.get(5),chapter6);
        listDataChild.put(listDataHeader.get(6),chapter7);
        listDataChild.put(listDataHeader.get(7),chapter8);










    }
}