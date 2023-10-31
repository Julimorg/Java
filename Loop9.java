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
public class Loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a = sc.nextInt(), b = sc.nextInt();
//        Solution 1
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print((i * 5) + j + " ");
                            
			}
			System.out.println();
		}
//      Solution 2
                for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(" " + count);
                                count+=1;
                            
			}
			System.out.println();
		}
	}
}
