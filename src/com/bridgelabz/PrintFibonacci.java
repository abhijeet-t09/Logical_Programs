package com.bridgelabz;

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;

        System.out.print("Enter Limit: ");
        int limit = sc.nextInt();

        for(int i = 0; i < limit; i++){
            System.out.print(num1 + ", ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
