package com.company.java.strings.javaregex;

import java.util.regex.Pattern;
import java.util.Scanner;
/**
 * characters. For example:
 * [] - Character class.
 * * - Zero or more occurrences.
 * + - One or more occurrences.
 * ^ - Start of a line.
 * $ - End of a line.
 * */
public class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    private String ipV4 = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    public String pattern = Pattern.compile(ipV4).toString();
}