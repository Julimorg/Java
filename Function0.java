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
public class Function0 {
        public static void show()
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0;  i<n;  i++ )
            { 
                System.out.print(i + " ");
            }
            System.out.println();
        }
        public static void main(String[] args)
        {
            show();
        }
}
