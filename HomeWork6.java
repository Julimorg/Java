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
public class HomeWork6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
//        First solution
        if( a == 0 )
        {
            if( b == 0)
            {
                 System.out.println("a is equal to 0 or b is equal to 0");
            }
            else
            {
                System.out.println(" a is not equal to 0 and b is not equal to 0");
            }
        } 
        else
        {
            if( b == 0)
            {
                 System.out.println("a is equal to 0 or b is equal to 0");
            }
            else
            {
                System.out.println(" a is not equal to 0 and b is not equal to 0");
            }
        
//        Second Solution
 System.out.println(
         (sc.nextInt() == 0 || sc.nextInt() == 0) ? "a is equal to 0 or b is equal to 0" : "a is not equal to 0 and b is not equal to 0");
    }   
//    Third soluion
    if( a== 0 || b==0)
    {
        System.out.println("a is equal to 0 or b is equal to 0");
            }
            else
            {
                System.out.println(" a is not equal to 0 and b is not equal to 0");
            }
}
}