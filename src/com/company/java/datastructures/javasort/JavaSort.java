package com.company.java.datastructures.javasort;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        while(testCases>0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // sa inceapa sortarea
        // putem sa implementam un comparator sau sa folosim streams
        // mult mai simplus si gg ez at the same time

        Comparator<Student> comparator = Comparator.
                comparing(Student :: getCgpa).reversed().
                thenComparing(Student:: getFname).
                thenComparing(Student:: getId);
        studentList.sort(comparator);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}


