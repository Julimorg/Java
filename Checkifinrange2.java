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
public class Checkifinrange2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if ( a <= 0 || a >= 10)
            {
                System.out.println("The score is not valid");
            }
            else
            {
                 System.out.println("The score is valid");
            }
	}
}
