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
public class XvectorYvector {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ( x >= 0)
        {
           if( y >=0)
           {
             System.out.println("this point lies in the First quadrant");
           }
           else
           {
               System.out.println("This point lies in the Fourth quadrant");
           }
        }
        else
        {
            if( y <= 0)
            {
                System.out.println("This point lies in the Third quadrant");
            }
            else
            {
              System.out.println("This point lies in the Second quadrant");
            }
        }
    }
}
