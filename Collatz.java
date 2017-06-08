package com.company;

public class Main {

    public static void main(String[] args) {
        collatzProblem(11);
    }


    public static int collatzProblem(int n){

        n = (n%2 == 0) ? n/2 : n*3 +1;

        System.out.println(n);
        return n == 1? n : collatzProblem(n) ;
    }
}
