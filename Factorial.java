package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.println("Podaj n");
        String nString = input.nextLine();
        int n = Integer.parseInt(nString);

            while(n<=0){
                System.out.println("n musi byc większe od 0\npodaj n");
                nString = input.nextLine();
                n = Integer.parseInt(nString);
            }
            int i = 0;
            int factorial = 1;

            while(i!=n){
                i++;
                factorial = factorial * i;
            }

        System.out.println("Silnia " + n + " = " + factorial);


    }


}
