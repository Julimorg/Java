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
public class Array10 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
                for(int i = 0; i<10;i++)
                {
                    a[i] = sc.nextInt();
                }
                for(int i = 0; i< 10;i++)
                {
                    System.out.print(" " + a[i]);
                }
	}
}
