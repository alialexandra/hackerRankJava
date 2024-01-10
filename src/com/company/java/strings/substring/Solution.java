package com.company.java.strings.substring;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        // prima varianta
        System.out.println(S.substring(start, end));

        StringBuilder sb = new StringBuilder();

        for(int i = start; i < end; i++) {
            sb.append(S.charAt(i));
        }

        System.out.println(sb);

        IntStream streamString = S.chars().map(c ->(char)c);

    }

}
