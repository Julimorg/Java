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
public class Ifelse2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//      The first solution
        if ( n > 0)
        {
            System.out.println("n is a positive number");
        } 
        if ( n <  0)
        {
            System.out.println("n is a negative number");
        }
        if ( n == 0)
        {
            System.out.println("n is equal to 0");
        }
//          The Second solutions
            if( n > 0)
            {
                System.out.println(" n is postive number");
            }else if ( n < 0)
            {
                System.out.println(" n is negative number");
            }else
            {
                System.out.println(" n is equal to 0");
            }
//          The third solution
            if( n > 0)
            {
                System.out.println(" n is positive number");
            }else{
            if ( n < 0)
            {
                System.out.println(" n is negative number");
            }else
            {
                System.out.println(" n is equal to 0");
            }
            }
            
	}
    
}
