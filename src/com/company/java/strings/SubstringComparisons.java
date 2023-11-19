package com.company.java.strings;
import java.util.Scanner;

public class SubstringComparisons {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            int stringSize = s.length();
            smallest = s.substring(0, k);
            for (int i = 0; i <= stringSize - k; i++) {
                final String substring = s.substring(i, k + i);
                if(substring.compareTo(smallest) < 0) {
                    smallest = substring;
                }
                if(substring.compareTo(largest) > 0) {
                    largest = substring;
                }
            }


            // smallest = java.util.Collections.min(listSubstr);
            // largest = java.util.Collections.max(listSubstr);
            return smallest + "\n" + largest;


        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}
