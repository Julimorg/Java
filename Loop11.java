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
public class Loop11 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), n = 0;
//                For loop
                for(int i = 1; i<=num;i++)
                {
                    if(num % i == 0)
                    {
                        n++;
                    }                   
                }
                              System.out.print(n);
//              While loop
                int i = 1;
                 while( i <= n )
                 {
                     if ( num % i == 0)
                     {
                         n++;
                     }
                     i++;
                 }
                 System.out.print(n);
	}
}

