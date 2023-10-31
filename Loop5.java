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
public class Loop5 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int sum = 0;
              for(int i=1;i<=a;i++)
              {
                  if( i % 2 !=0)
                  {
                   sum = sum + i;
                  }
              }
               System.out.println(sum);
	}
}
