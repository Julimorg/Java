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
public class Checkifinrange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
    
        if( p >= 10 && p <= 100 )
        {
            System.out.println(p + "is in the range [10,100]");
        }
   else
        {
            System.out.println(p + "is out the range [10,100]");
        }
}
}

