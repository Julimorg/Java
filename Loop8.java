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
public class Loop8 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
                if ( n > 0)
                {
                    for(int i = 1 ; i<=n;i++)
                    {
                        if( n % i == 0)
                        {
                            System.out.print(i +  " ");
                        }
                    }
                }
                else
                {
                    System.out.println("Wrong valid");
                }
	}
}
