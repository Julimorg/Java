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
public class Function3 {
    public static int[] Div(int a[]){
      for(int i = 0 ;i<a.length;i++)
      {
          if( a[i] % 3  == 0 && a[i] % 5 != 0)
          {
            System.out.print(" " + a[i]);
          }
      }
      return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the limit: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Div(a);
    }
}
