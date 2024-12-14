/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public abstract class Employee {
    private String maNhanVien;
    private String tenNhanVien;
    private double luongCoBan;

    public Employee() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma nhan vien:");
        maNhanVien = sc.nextLine();
        System.out.print("nhap ten nhan vien:");
        tenNhanVien = sc.nextLine();
        System.out.print("nhap luong co ban:");
        luongCoBan = sc.nextDouble();
    }
    
    public void in() {
        System.out.printf("|%10s|%10s|%.1f", maNhanVien, tenNhanVien, luongCoBan);
    }
    
    public double luongHangThang() {
        return luongCoBan;
    }
}

