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
public class IncreaseDecrease {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                if( a <= b && b <= c )
                {
                    if( b>=c || a>=b )
                    {
                         System.out.println("neither increasing nor decreasing order");
                    }
                    else
                    {
                       System.out.println("increasing");
                    }                         
                }
                else
                {
                     if( b<=c || a<=b )
                    {
                         System.out.println("neither increasing nor decreasing order");
                    }
                     else
                  System.out.println("decreasing");
                }
               
	}
}
