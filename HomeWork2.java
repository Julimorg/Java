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
public class HomeWork2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
                int c = a;
                  a = b;
                  b = c;
//                  Logic :
//              c = a 
//             value a -> c  ,  c == 3
//             a = b
//             value b -> a ,  a == 4
//            b = c
//            value c -> b , b == 3
		System.out.println("after swapping, a = " + a + ", b = " + b);
	}
}
