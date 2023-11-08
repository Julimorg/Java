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
public class Char3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        for(int i = 0;i<k.length() ; i++)
        {
            System.out.print(k.charAt(i));
        }
    }
}
