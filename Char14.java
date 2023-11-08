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
public class Char14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input yout text: ");
        String s = sc.nextLine();
        for(char c = '0' ; c <= '9'; c++)
        {
            s = s.replace(c + "","");
        }
        System.out.print("After change: " +s);
    }
}
