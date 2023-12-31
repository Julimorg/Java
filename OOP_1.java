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
class Student{
    String name;
    int age;
   public void Display()
   {
       Scanner sc = new Scanner(System.in);
       name = sc.nextLine();
       age = sc.nextInt();
   }
   public void getInformation()
   {

       System.out.println("Name : " + name);
       System.out.println("Age : " + age);
   }
}
public class OOP_1 {
    
    public static void main(String[] args)
    {
        Student student = new Student();
        System.out.println("Input your information: ");
        student.Display();  
        student.getInformation();
    }
    
}
