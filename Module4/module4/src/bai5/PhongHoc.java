/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public abstract class PhongHoc {
    private String maPhongHoc;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public PhongHoc() {
    }

    public String getMaPhongHoc() {
        return maPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        this.maPhongHoc = maPhongHoc;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma phong:");
        maPhongHoc = sc.nextLine();
        System.out.print("nhap day nha:");
        dayNha = sc.nextLine();
        System.out.print("nhap dien tich:");
        dienTich = sc.nextDouble();
        System.out.print("nhap so bong den:");
        soBongDen = sc.nextInt();
    }
    
    public void in() {
        System.out.print("\nma phong:" + maPhongHoc);
        System.out.print("\nday nha:" + dayNha);
        System.out.print("\ndien tich:" + dienTich);
        System.out.print("\nso bong den:" + soBongDen);
    }
    
    public boolean kiemTraPhongHoc() {
        return dienTich >= 10 && soBongDen >= 1;
    }
}

