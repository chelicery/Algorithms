package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        System.out.println("podaj dlugosc ciagu fibonacciego");
        String sizeOfFibonacci = input.nextLine();
        int sizeOfFibonacciInt = Integer.parseInt(sizeOfFibonacci);

        int[] fibonacci = new int[sizeOfFibonacciInt];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for(int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];

        }

        for(int num : fibonacci){
            System.out.println(num);
        }

    }
}
