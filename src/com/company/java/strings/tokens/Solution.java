package com.company.java.strings.tokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String regex = "[\\s!.,?_'@]+";
        String[] splitStrings = s.split(regex);

        // Filter out empty strings
        List<String> tokens = Arrays.stream(splitStrings)
                .filter(str -> !str.isEmpty())
                .collect(java.util.stream.Collectors.toList());

        System.out.println(tokens.size());
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

