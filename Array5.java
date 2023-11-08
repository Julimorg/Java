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
public class Array5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input limit numbers: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum = 0;
//        Solution 1
        for(int i = 0;i<n;i++)
        {
            sum = (a[0]+a[n-1]);
        }
//        Solution 2  no need put the sum in loop
        sum = a[0] + a[n-1];
        System.out.print("The sum of the first array " + a[0] + " and the last array " + a[n-1] + " is: " +sum);
    }
}
