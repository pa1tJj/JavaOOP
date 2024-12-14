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
//Motor mua về chạy đi học, hàm run(), nhưng trên đường có thằng nẹt bô, nóng người mình
//kéo  tay ga mạnh hơn bốc đầu, vọt xe, tốc độ điên hơn bình thường, lúc này ngoài việc là
// motor thông thường, ta còn là báo thủ, phải là báo thủ mới có tốc độ cao
// gia nhập hội đua, bố mày là đua thủ dẫn đến k dùng extends mà dùng 1 member của IMPLEMENTS --> tham gia việc đua 
// tức là IMPLEMENTS ALL ABSTRACT METHODS
public class Motor implements DeathRacer {
    public static final double MAX_SPEED = 180;
    private String model;
    private String volume;
    private String vin;

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    
    public double run() {
        return new Random().nextDouble() *MAX_SPEED;
    }
    
    public void show() {
        System.out.printf("|%-10s|%-10s|%-10s|%-15s|%5.1f|\n",
                "MOTOR", model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        return run() * 3;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-10s|%-10s|%-15s|%5.1f|\n",
                "MOTOR-RACER", model, volume, vin, runToDead());
    }
}
