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
public class FindMinMaxAvrin3Numbers{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        {
            if ( a <= c)
            {
//                      c > b > a
                if( a <= b && b <= c)
                {
                    System.out.println("The max is : " + c);
                    System.out.println("The avr is : " + b);
                    System.out.println("The min is : " + a);   
                }
                else
                {
//                       c > a > b
                    if( a >= b && b <= c  )
                    {
                     System.out.println("The max is : " + c);
                    System.out.println("The avr is : " + a);
                    System.out.println("The min is : " + b);      
                    }
//                  b > c > a
                    else
                    {
                     System.out.println("The max is : " + b);
                    System.out.println("The avr is : " + c);
                    System.out.println("The min is : " + a);      
                    }  
                }
            }
            else
            {
//                  a > b > c
                if( b >= c  && a >= b)
                {
                    System.out.println("The max is : " + a);
                    System.out.println("The avr is : " + b);
                    System.out.println("The min is : " + c);
                }
                else 
                {
//                    a > c > b
                    if( c >= b && a >= b)
                  {
                    System.out.println("The max is : " + a);
                    System.out.println("The avr is : " + c);
                    System.out.println("The min is : " + b);
                }
                    else
//              b > a > c
                 {
                    System.out.println("The max is : " + b);
                    System.out.println("The avr is : " + a);
                    System.out.println("The min is : " + c);
                }
              }
                    
            }
                
    }
}
}
