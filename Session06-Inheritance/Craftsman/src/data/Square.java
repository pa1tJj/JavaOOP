/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle{
    private double edge;
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }
    
    @Override
    public void paint() {
        System.out.printf("|RETANGLE|%-15s|%-10s|%4.1f|%4.1f|\n",owner, color, width, getArea());
    }
}
