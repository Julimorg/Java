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
class Rectangle
{
    double length;
    double width;
    public void getInformation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the lenght");
        length = sc.nextDouble();
        System.out.println("Input the width");
        width = sc.nextDouble();
    }
    
    public double getArea()
    {
        double area;
        area = length * width;
        return area;
    }
    public double getPerimeter()
    {
        double  peri;
        peri = ( length + width ) * 2;
        return peri;
    }
    public void Display()
    {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
public class OOP_2 {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.getInformation();
        r.Display();
    }
}
