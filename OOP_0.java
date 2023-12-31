/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author acer
 */
class Student {
    String name;
    int age;
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age) ;
    }
    
}
public class OOP_0 {
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.name = "Tran Kien Phong";
        student1.age =24;
       student1.display();
    }
}
