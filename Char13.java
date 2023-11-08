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
public class Char13 {
    public static void main(String[] args) {
        String s  = "X31nCh341";
	for(char c = '0'; c <= '9'; c++) {
			s = s.replace(c + "" , "");
		}
		System.out.println(s);
//		for(char c = 'a'; c <= 'z'; c++) {
//			System.out.print(c);
//		}
}
}
