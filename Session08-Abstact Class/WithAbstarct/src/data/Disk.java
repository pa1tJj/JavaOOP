/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public class Disk extends Shape{
    private String smile;
    private double radius;
    public static final double PI = 3.1415;

    public Disk(String smile, double radius, String owner, String color, String borderColor) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Disk.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }
    @Override
    public void in() {
        System.out.printf("|Disk     |%10s|%10s|%10s||%.1f|%.1f|%.1f|\n", owner, color, borderColor, radius, getPerimeter(), getArea());   
    }
}
