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
public class InputSection {
        public static void main(String[] args)
        {
                 	Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        System.out.println(
            "In 15 years, age of " + a + " will be " + (b + 15)
        );
         
        }
}
