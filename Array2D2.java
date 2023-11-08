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
public class Array2D2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Input n : ");
		int n = sc.nextInt();
                System.out.print("Input m: ");
                int m = sc.nextInt();
                int a[][] = new int[n][m];
                for(int i = 0;i<n;i++)
                {
                    for (int j = 0 ; j<m;j++)
                    {
                        a[i][j]=sc.nextInt();
                    }
                }
                int sum = 0;
                for(int i = 0; i<n;i++)
                {
                    for(int j = 0;j<m;j++)
                    {
                       if( a[i][j] % 5 == 0)
                       {
                           sum +=a[i][j];
                       }
                    }
                }
                System.out.print("The sum of all number divided by 5 is : " +sum);
	}
}
