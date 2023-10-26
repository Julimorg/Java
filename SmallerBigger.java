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
public class SmallerBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if ( a >= b)
        {
            System.out.println(" a is greater than or equal to b");
        }
        if( a <= b)
        {
            System.out.println(" a is smaller than b ");
        }
        if ( a == b)
        {
            System.out.println(" a is equal to b ");
        }
        }
    }

