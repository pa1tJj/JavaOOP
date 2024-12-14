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
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void show() {
        System.out.printf("|Dog|%-10s|%-10s|%.1f|%.1f|\n", 
                name, yob, weight, run());
    }
    //phần tham gia gắn vào DeathRacer
    @Override
    public double runToDead() {
        return run() * 5;
    }
    @Override
    public void showHowToDead() {
        System.out.printf("|Dog-Racer|%-10s|%-10s|%.1f|%.1f|\n", 
                name, yob, weight, runToDead());
    }
    
}
