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
public class Function2 {
    public static int[] Evennum(int a[])
    {
        for(int i = 0; i<a.length;i++)
        {
            if(a[i] % 2  == 0)
            {
                System.out.println( "Even number is : " +a[i    ]);
            }
        }
        return a;
    }
    public static int[] Oddnum(int a[])
    {
          for(int i = 0; i<a.length;i++)
        {
            if(a[i] % 2  != 0)
            {
                System.out.println("Odd number is : "+a[i]);
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input limit number : ");
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i = 0 ;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        Evennum(b);
        Oddnum(b);
        
    }
}
