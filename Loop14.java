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
public class Loop14 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt(), b = num.nextInt();
		for (int i = 1; i<= n; i++) {
			if (i == b) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}
