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
public class Array8 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the limit number: ");
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i = 0;i<n;i++)
                        {
                            a[i] = sc.nextInt();
                        }
                int sum = 0;
                for(int i=0 ;i<n;i++)
                {
                    if( a[i]>0 && a[i] % 2 !=0)
                    {
                     sum+=a[i];   
                    }
                }
                System.out.print(" Sum of the odd number is : " + sum);
	}
}
