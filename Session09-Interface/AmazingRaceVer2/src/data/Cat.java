/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Cat extends Pet{
    public static final double MAX_SPEED = 40;
    private String ribbon;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
         Random r = new Random();
         double speed = r.nextDouble() * MAX_SPEED;
         return speed;
    }

    @Override
    public void show() {
        System.out.printf("|Cat|%-10s|%-10s|%4.1f|%4.1f|\n", 
                name, yob, weight, run());
    }
}
