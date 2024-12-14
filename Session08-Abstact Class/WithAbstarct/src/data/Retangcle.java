/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public class Retangcle extends Shape{
    protected double a, b;

    public Retangcle(double a, double b, String owner, String color, String borderColor) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
    
    @Override
    public void in() {
        System.out.printf("|Retangcle|%10s|%10s|%10s|%.1f|%.1f|%.2f|%.2f\n", owner, color, borderColor, a, b, getPerimeter(), getArea());
    }
    
}
