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
class Triangle{
    int x;
    int y;
    int z;
    public void getinfomation()
    {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }
    public void Checktriangel()
    {
        // Check for equilateral triangle
    if (x == y && y == z )
        System.out.println("Equilateral Triangle");
 
    // Check for isosceles triangle
    else if (x == y || y == z || z == x )
        System.out.println("Isosceles Triangle");
 
    // Otherwise scalene triangle
    else
        System.out.println("Scalene Triangle");
    }
    public void display()
    {
        Checktriangel();
      
    }
}
public class TriangleVerification {
  public static void main(String[] args)
  {
        Triangle d = new Triangle();
        d.getinfomation();
        d.display();
  }
}
