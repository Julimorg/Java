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
class Student2{
     Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    public Student2()
    {
      name = sc.nextLine();
      age = sc.nextInt();
    }
    public void Display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age:  " + age);
    }
}
public class OOP_3{
    public static void main(String[] args)
    {
        Student2 s = new Student2();
        s.Display();
    }
}
