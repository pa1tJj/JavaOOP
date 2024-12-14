/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingracever2;

import data.*;

/**
 *
 * @author Admin
 */
public class AmazingRaceVer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runToDead();
    }
    public static void runToDead() {
        Dog d1 = new Dog("faie", 2020, 50.0);// chấm full hàm của con, đủ code hàm cha
        Pet d2 = new Dog("eif", 1950, 20.0);// chấm full hàm cha, khai cha, chạy k sợ vì đa hình hàm con qua mặt
        DeathRacer d3 = new Dog("ifhfr", 1901, 20);//chấm chỉ xổ full 2 hàm runToDead(), showToDead()- chạy tốt vì obj con qua mặt, có đủ override làm rồi, đa hình tiếp, ép con trỏ đc vì new Dog
        Motor m1 = new Motor("ỉeger", "150.0cm3", "29g1-74263");
        DeathRacer m2 = new Motor("fuerh", "200cm3", "36G1-23244");
        m2.runToDead();
        //DeathRacer racer[] = {d1, d2, d3, m1, m2}// lỗi d2 k phải DeathRacer vì Pet k implement(tham gia) DeathRacer
        DeathRacer racer[] = {d1, (Dog)d2/*ép kiểu */, d3, m1, m2};
        //racer[0] = new Dog(...)
        //racer[1] = new Motor(...)
        // tooàn bộ là DaethRacer, đa hình là đa hình trên runToDead(), showHowToDaed()
       // con tự lo, Motor chạy theo Motor, Dog theo Dog
        System.out.println("in ra");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}

