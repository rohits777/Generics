package com.bridgelabz;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to the Generics Program");
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value :: ");
        a = sc.nextFloat();
        System.out.print("Enter b value :: ");
        b = sc.nextFloat();
        System.out.print("Enter c value :: ");
        c = sc.nextFloat();

        if (a > b && a > c){
            System.out.println(a+" is bigger");
        } else if (b > a && b > c) {
            System.out.println(b+ " is bigger");
        }else {
            System.out.println(c+ " is bigger");
        }
    }
}