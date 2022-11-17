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
        printMax(max);
    }
    public static <T> void printMax(T max){
        System.out.println("Maximum value is :: " + max);
    }
    public static void main(String[] args) {
        System.out.println("--Welcome to generics Program --");
        bigger(17,20,33,44,27);
        bigger(16.6,22.5,35.5,35.3);
        bigger("Mango","Banana","Apple");
    }
}