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
public class Loop12 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//                Solution 1
		int a=sc.nextInt(), b = sc.nextInt(), fc = 1;
                for(int i = 1 ; i <= b ;i++)
                {
                    fc = fc * a;
                }
                System.out.print(fc);
//       Solution 2
//                int answer = 1;
//		while (b > 0) {
//			answer *= a;
//			b--;
//		}
//		System.out.print(answer);
//	}
//    Solution 3
//                int answer = 1;
//		for (; b > 0; b--) {
//			answer *= a;
//		}
//		System.out.print(answer);
//	}
                
	}
}

