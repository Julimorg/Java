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
public class Findmaxin3num {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                if ( a >= b && a >= c)
                {
                    System.out.println(" The max is : " + a);
                }else
                {
                    if ( b >= c)
                {
                    System.out.println("The max is : " + b);
                }else
                {
                    System.out.println(" The max is : " + c);
                }
                }
	}
}
