package com.company.java.datastructures.javadequeue;


import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();



        int n = in.nextInt();
        int m = in.nextInt();

        // if you let a simple array it will
        // double the list length whenever it is out of space
        List<Integer> initialList = new ArrayList<>(n);

        int maxUnique = 0;
        // first sttempt
        // basic
        // fill the list
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if(deque.size() == m) {
                if(set.size() > maxUnique) {
                    maxUnique = set.size();
                }

                int firstNum = deque.removeFirst();
                // if the dequeue doesnt contain the number after removal
                // this means it was a unique number
                // so we must removed it from the set also
                if(!deque.contains(firstNum)) {
                    set.remove(firstNum);
                }
            }

        }
        System.out.println(maxUnique);
    }
}