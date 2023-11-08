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
public class Java10 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Input the limit number:  ");
		int n = sc.nextInt();
                int a[] = new int[n];
                for(int i = 0;i<n;i++)
                {
                    a[i] = sc.nextInt();
                }
                for (int i = 0;i<n;i++)
                {
                 for(int j = i+1 ;j<n;j++)
                 {
                    if( a[i] > a[j])
                    {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                    else
                    {
                        int temp  = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                 } 
                }
                System.out.print("The increasing is: ");
               for(int i = 0;i<n;i++)
               {
                   System.out.println(" " + a[i]);
               }   
	}
}
