/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Customer extends Person{
    private String tenCongTy;
    private double triGiaHoaDon;

    public Customer() {
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    @Override
    public String toString() {
        return "Customer{" + "tenCongTy=" + tenCongTy + ", triGiaHoaDon=" + triGiaHoaDon + '}';
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("nhap dia chi:");
        diaChi = sc.nextLine();
        System.out.println("nhap ten cong ty:");
        tenCongTy = sc.nextLine();
        System.out.println("nhap tri gia hoa don:");
        triGiaHoaDon = sc.nextDouble();
    }

    @Override
    public void in() {
        System.out.printf("|%-10s|%-10s|%-10s|%.2f|\n", hoTen, diaChi, tenCongTy, triGiaHoaDon);
    }
    
    
}

