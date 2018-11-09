package com.example.lak.endsemapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Lak on 02-09-2018.
 */

public class AdaTopics {
    public ArrayList<String> listDataHeader;
    public HashMap<String, List<String>> listDataChild;

    public void prepareList()
    {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Basics of Algorithm and Mathematics");
        listDataHeader.add("Analysis of Algorithm");
        listDataHeader.add("Divide and Conquer Algorithm");
        listDataHeader.add("Dynamic Programming");
        listDataHeader.add("Greedy Algorithm");
        listDataHeader.add("Exploring Graphs");
        listDataHeader.add("Backtracking and Branch and Bround");
        listDataHeader.add("String Matching");
        listDataHeader.add("Introduction to NP-Completeness");

        List <String> chapter1=new ArrayList<>();
        chapter1.add("What is algorithm?");
        chapter1.add("Mathematics for Algorithm sets");
        chapter1.add("Functions and relations");
        chapter1.add("Vectors and Matrices");
        chapter1.add("Linear Inequaltiies and Linear equations");

        List<String >chapter2=new ArrayList<>();
        chapter2.add("The Efficient Algorithm");
        chapter2.add("Average,Best&Worst Case Analysis");
        chapter2.add("Amortized Analysis");
        chapter2.add("Asymptotic Notations");
        chapter2.add("Analyzing control statement");
        chapter2.add("Loop Variant and the correctness of algorithm");
        chapter2.add("BubbleSort");
        chapter2.add("Selection Sort");
        chapter2.add("Insertion Sort");
        chapter2.add("Shell Sort");
        chapter2.add("Heap Sort");
        chapter2.add("Bucket Sort");
        chapter2.add("Radix Sort");
        chapter2.add("Counting Sort");

        List<String> chapter3=new ArrayList<>();
        chapter3.add("Introduction");
        chapter3.add("Recurrence and different methods to solve recurrence");
        chapter3.add("Multiplying large Integers Problem");
        chapter3.add("Problem Solving using divide and conquer algorithm - Binary Search");
        chapter3.add("Max-Min problem");
        chapter3.add("Merge Sort");
        chapter3.add("Quick Sort");
        chapter3.add(" Matrix Multiplication");
        chapter3.add(" Exponential");

        List<String> chapter4=new ArrayList<>();
        chapter4.add("Introduction");
        chapter4.add("The Principle of Optimality");
        chapter4.add("Calculating the Binomial Coefficient");
        chapter4.add("Making Change Problem");
        chapter4.add("Assembly Line-Scheduling");
        chapter4.add("Knapsack problem");
        chapter4.add("All Points Shortest path");
        chapter4.add("Matrix chain multiplication");
        chapter4.add("Longest Common Subsequence");

        List<String> chapter5=new ArrayList<>();
        chapter5.add("General Characteristics of greedy algorithms");
        chapter5.add("Activity selection problem");
        chapter5.add("Elements of Greedy Strategy");
        chapter5.add("Kruskal’s algorithm");
        chapter5.add("Prim’s algorithm");
        chapter5.add("Shortest paths");
        chapter5.add("The Knapsack Problem");
        chapter5.add("Job Scheduling Problem");
        chapter5.add("Huffman code");


        List<String> chapter6=new ArrayList<>();
        chapter6.add("An introduction using graphs and games");
        chapter6.add("Undirected Graph");
        chapter6.add("Directed Graph");
        chapter6.add("Traversing Graphs");
        chapter6.add("Depth First Search");
        chapter6.add("Breath First Search");
        chapter6.add("Topological sort");
        chapter6.add("Connected components");

        List<String> chapter7=new ArrayList<>();
        chapter7.add("Introduction");
        chapter7.add("The Eight queens problem");
        chapter7.add("Knapsack problem");
        chapter7.add("Travelling Salesman problem");
        chapter7.add("Minimax principle");


        List<String> chapter8=new ArrayList<>();
        chapter8.add("Introduction");
        chapter8.add("The naive string matching algorithm");
        chapter8.add("The Rabin-Karp algorithm");
        chapter8.add("String Matching with finite automata");
        chapter8.add("The Knuth-Morris-Pratt algorithm");

        List<String> chapter9=new ArrayList<>();
        chapter9.add("The class P and NP");
        chapter9.add("Polynomial reduction");
        chapter9.add("NP- Completeness Problem");
        chapter9.add("Travelling Salesman problem");
        chapter9.add("Hamiltonian problem");
        chapter9.add("Approximation algorithms");

        //70


        listDataChild.put(listDataHeader.get(0),chapter1);
        listDataChild.put(listDataHeader.get(1),chapter2);
        listDataChild.put(listDataHeader.get(2),chapter3);
        listDataChild.put(listDataHeader.get(3),chapter4);
        listDataChild.put(listDataHeader.get(4),chapter5);
        listDataChild.put(listDataHeader.get(5),chapter6);
        listDataChild.put(listDataHeader.get(6),chapter7);
        listDataChild.put(listDataHeader.get(7),chapter8);
        listDataChild.put(listDataHeader.get(8),chapter9);

    }
}
