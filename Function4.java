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
public class Function4 {
    public static void text(String a[])
    {
        for(int i = 0 ; i < a.length;i++)
                {
                    if(a[i].length() > 3)
                    {
                        System.out.print(" " +a[i]);
                    }
                }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b[] = new String[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.next();
		}
		text(b);
    }
}
