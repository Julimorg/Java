/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author acer
 */
class Student3{
    String name;
    int age;
    public Student3(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class OOP_4 {
    public static void main(String[] args) {
		Student3 s1 = new Student3("Long", 24);
		Student3 s2 = new Student3("Kien", 29);
		s1.display();
		s2.display();
	}
}
