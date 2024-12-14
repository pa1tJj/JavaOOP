/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public class Square extends Retangcle{

    public Square(double a, double b, String owner, String color, String borderColor) {
        super(a, b, owner, color, borderColor);
    }

    
    @Override
    public void in() {
        System.out.printf("|Square   |%10s|%10s|%.1f|%.1f|\n", color, borderColor, a, getArea());
    }
}
