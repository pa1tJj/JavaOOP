/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    public abstract void in();
    
}
