/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Vehicle {

    String tenChuXe, loaiXe;
    double triGia, dungTich;

    public Vehicle(String tenChuXe, String loaiXe, double triGia, double dungTich) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGia = triGia;
        this.dungTich = dungTich;
    }

    public Vehicle() {
    }

    public double tinhThue() {
        if (dungTich < 100) {
            return 0.01 * triGia;
        } else if (dungTich >= 00 && dungTich <= 200) {
            return 0.03 * triGia;
        }else {
            return 0.05 * triGia;
        }
    }
    
    public void nhap(Vehicle v[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            v[i] = new Vehicle();
            System.out.println("nhap thong tin thu:" + (i+1));
            System.out.println("nhap ten chu xe:");
            v[i].tenChuXe = sc.nextLine();
            System.out.println("nhap loai xe:");
            v[i].loaiXe = sc.nextLine();
            System.out.println("nhap tri gia:");
            v[i].triGia = sc.nextDouble();
            System.out.println("nhap dung tich:");
            v[i].dungTich = sc.nextDouble();
        }
    }
    
    public void in(Vehicle v[], int n) {
        System.out.printf("|%20s|%10s|%10s|%10s|%10s|\n", "ten chu xe", "loai xe", "tri gia", "dung tich", "thue");
        for (int i = 0; i < n; i++) {
            System.out.printf("|%20s|%10s|%5.2f|%5.2f|%5.2f|\n", v[i].tenChuXe, v[i].loaiXe, v[i].triGia, v[i].dungTich, v[i].tinhThue());
        }
    }
}
