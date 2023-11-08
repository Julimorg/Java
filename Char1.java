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
public class Char1 {
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        String  s = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(s.charAt(k-1));
    }
}
