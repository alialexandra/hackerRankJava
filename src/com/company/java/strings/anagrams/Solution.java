package com.company.java.strings.anagrams;

import java.util.Arrays;

public class Solution {

    public static boolean areAnagrams(String str1, String str2) {
        // Convert the strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert strings to character arrays, sort them, and compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
