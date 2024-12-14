/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    protected double length;

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidtyh() {
        return width;
    }

    public void setWidtyh(double widtyh) {
        this.width = widtyh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
     @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", widtyh=" + width + ", length=" + length + '}';
    }
    
    public void paint() {
        System.out.printf("|RETANGLE|%-15s|%-10s|%4.1f|%4.1f|\n",owner, color, width, length);
    }
}
