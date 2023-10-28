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
public class CompareString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        if (a.equals(b))
        {
            System.out.println("a is equal to b ");
        }else
        {
            System.out.println(" a is not equal to b ");
        }
    }
}
