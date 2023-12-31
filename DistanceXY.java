/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author acer
 */
class Point{
    double x1,x2;
    double y1,y2;
    public void Point()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input X1 and Y1");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Input X2 and Y2");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
    }
    public double distance()
    {
        double dis = sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)); 
        return dis;
    }   
    public void check()
    {
         System.out.println(" the distance between 2 x and y : " + distance());
    }
}
public class DistanceXY {
    public static void main(String[] args)
    {
        Point p =  new Point();
        p.Point();
        p.check();
    }
}
