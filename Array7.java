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
public class Array7 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Input the  limit number :");
		int n = sc.nextInt();
		int[] a= new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
                System.out.println("Input the number you want to find is : ");
		int k = sc.nextInt();
                int count = 0;
		for(int i = 0;i<n;i++)
                {
                    if ( a[i] == k )
                    {
                        count++;
                    }
                }
                System.out.println(" count the same num is :" +count);
	}
}
