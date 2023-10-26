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
public class Ifelse {
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in); 
           int a = sc.nextInt();
           if( a % 2 == 0)
           {
               System.out.println("a: " + a + " is even number");
           }else
                   {
                       System.out.println( "a: " + a + " a is odd number");
                   }
//      the second way to write if else  ==> if if
//         if( a % 2 == 0)
//           {
//               System.out.println("a: " + a + " is even number");
//           }if ( a % 2 != 0)
//                   {
//                       System.out.println( "a: " + a + " a is odd number");
//                   }

    
               
    }
}
