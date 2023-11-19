package com.company.java.datastructures.javabitset;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        while(m > 0) {

            String operation = in.next();
            int a = in.nextInt();
            int b = in.nextInt();

            switch(operation) {
                case "AND":
                    if(a == 1) {
                        b1.and(b2);
                    }
                    else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if(a == 1) {
                        b1.or(b2);
                    }
                    else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if(a == 1) {
                        b1.xor(b2);
                    }
                    else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if(a == 1) {
                        b1.flip(b);
                    }
                    else {
                        b2.flip(b);
                    }
                    break;
                case "SET":
                    if(a == 1) {
                        b1.set(b);
                    }
                    else {
                        b2.set(b);
                    }
                    break;
                default:
                    break;

            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());

            m--;

        }
        in.close();



    }
}