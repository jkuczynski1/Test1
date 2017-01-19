package com.example.jjk.test2;

import java.util.ArrayList;

/**
 * Created by jjk on 1/18/2017.
 */

class Main {

    public static void main(String[] args) {
        System.out.println("Hi world.");
        System.out.println("I can count to 5.");
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(0); numList.add(1);numList.add(2);numList.add(3);numList.add(4);numList.add(5);
        for (int aa: numList
             ) {
            System.out.println(aa+"...");
        }
        System.out.println("Done!");
    }
}