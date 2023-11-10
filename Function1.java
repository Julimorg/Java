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
public class Function1 {
    
    public static int Sum(int a[])
    {
        int sum  = 0;
        for(int i = 0 ;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println(" the sum is : " +sum);
        return sum;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number : ");
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i=0 ;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        System.out.println("Sum of the array is : " + Sum(b) );          
    }
}
