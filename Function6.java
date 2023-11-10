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
public class Function6 {
    public static  double circum(double a)
    {
       double  cir = (double) (2 * a * 3.14);
       return cir;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
//                Làm tròn chữ số thập phân thứ 2
                String res = String.format("%.2f", circum(r));
		System.out.print(res);
	}
}
