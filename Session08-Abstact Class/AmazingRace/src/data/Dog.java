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
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        //Random r = new Random();
        return new Random().nextDouble() * MAX_SPEED;// anonymous object:là obj k đặt tên, gọi xong dùng luôn rồi bị xóa khỏi vùng ram luôn
    }

    @Override
    public void show() {
        System.out.printf("|Dog|%-10s|%-10s|%.1f|%.1f|\n", 
                name, yob, weight, run());
    }
    
}
