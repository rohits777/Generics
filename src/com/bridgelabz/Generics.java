package com.bridgelabz;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Welcome to the Generics Program");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value :: ");
        a = sc.nextInt();
        System.out.print("Enter b value :: ");
        b = sc.nextInt();
        System.out.print("Enter c value :: ");
        c = sc.nextInt();

        if (a > b && a > c){
            System.out.println(a+" is bigger");
        } else if (b > a && b > c) {
            System.out.println(b+ " is bigger");
        }else {
            System.out.println(c+ " is bigger");
        }
    }
}