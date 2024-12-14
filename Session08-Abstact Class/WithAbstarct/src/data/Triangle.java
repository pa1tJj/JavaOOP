/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c, String owner, String color, String borderColor) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public void in() {
        System.out.printf("|Traingle |%10s|%10s|%10s|%.1f|%.1f|%.1f|%.1f|%.1f|\n", owner , color, borderColor, a, b , c, getPerimeter(), getArea());
    }
}
