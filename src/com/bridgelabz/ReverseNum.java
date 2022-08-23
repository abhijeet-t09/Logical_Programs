package com.bridgelabz;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int rev = 0;

        while(num != 0) {

            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: "+rev);
    }
}
