package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(CheckPrime(num)){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }

    static boolean CheckPrime(int num){
        if(num <= 1)
            return false;

        for(int i = 2; i < num ; i++)
        {
            if((num % i) == 0)
                return  false;
        }
        return true;
    }
}
