package com.bridgelabz;

import java.util.Scanner;

public class Generics {
    public static <T extends Comparable<T>> void bigger(T...input){
        T max = input[0];
        for (T t : input){
            if (t.compareTo(max) > 0){
                max = t;
            }
        }

        System.out.println("Maximum value is :: " +max);
    }
    public static void main(String[] args) {
        bigger(10,20,33,14,26);
        bigger(11.6,25.5,31.5,31.3);
        bigger("Mango","Banana","Apple");
    }
}