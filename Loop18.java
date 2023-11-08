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
public class Loop18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt(), sum = 0;
//         Do While - loop
            int i = 0;
            do{
                if(i % 2 == 0)
                {
                    sum+=i;
                }
                i++;
            }while(i<=a);
        System.out.println("the sum is :  " + sum);
//         While - loop
//         int i = 0;
//         while (i<=a)
//         {
//             if( i % 2 == 0)
//             {
//                 sum+=i;
//             }
//             i++;
//         }
//         System.out.println(" the sum is : " + sum);
//         For - loop
//         for(int i = 0; i<=a ;i++)
//         {
//             if( i % 2 == 0)
//             {
//                 sum+=i;
//                
//             }
//         }
//         System.out.println("the sum is: " + sum);

}
}
