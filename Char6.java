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
public class Char6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        char s = sc.next().charAt(0);
        int a = -1;
        for(int i = 0;i<c.length();i++)
        {  
            if(c.charAt(i) == s)
            {
                a = i ;
                break;
            }
            
        }
        System.out.print(a);
    }
}
