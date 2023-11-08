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
public class Loop19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt();
//        do while  - Loop
        int i = a;
        if ( a != 0)
        {
            do{
                if( n % i == 0)
                {
                    System.out.print(" " + i);
                }
                i++;
                
            }while(i<=n);
        }
        else
        {
            System.out.println(" Wrong valid cause " + n + " can not divide " + a);
        }
              
//            While - loop     
//        int i = a;
//        if( a != 0)
//        {
//        while (i<= n)
//        {
//            if( n % i == 0)
//            {
//                System.out.print(" " + i);
//            }
//            i++;
//        }
//        }
//        else
//        {
//         System.out.println(" Wrong valid cause " + n + " divide " + a);
//        }

//        For -  Loop
//        if( a !=0)
//        {
//        for (int i = a;i<=n;i++)
//        {
//            if( n % i == 0)
//            {
//                System.out.print(" " + i);
//            }
//        }
//        }
//        else
//        {
//            System.out.println(" Wrong valid cause " + n + " divide " + a);
//        }
        
    }
}
