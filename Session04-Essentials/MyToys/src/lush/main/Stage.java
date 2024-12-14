/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lush.main;

import lush.util.MyToys;

/**
 *
 * @author Admin
 */
public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
//        int n=MyToys.getInteger();
//        System.out.println("N= " + (n+5));
        int m = MyToys.getInteger("Nhap m:");
        System.out.println("M:" + m);
    }
}
