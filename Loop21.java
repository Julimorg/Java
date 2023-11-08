/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Loop21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);     
        long  n = sc.nextLong();
//        Count digits in number
        int count = String.valueOf(n).length();
//        Find the last digit
         int a = (int) (n % 10);
//      Reversed the digits        
         long rev =0;
         int temp = (int)(n);
         while( temp != 0)
         {
             rev = rev * 10 + temp % 10;
             temp = temp / 10;
         }
//        Find the first digits
         while( n >= 10)
         {
             n = n/10;
         }
         
         System.out.println("The digits are:  " + count);
         System.out.println("The last digit is: " + a );
         System.out.println("The first digits is: " + n);
         System.out.println("Sum of first digit: " + n + " and last digit: " + a +" is: "+ (a+n) );
         System.out.println("Reverse of the interger is : " + rev);
    }
}
