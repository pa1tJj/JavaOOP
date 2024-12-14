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
public class Administrator extends Employee{
    private String phongBan;

    public Administrator() {
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap the department:");
        phongBan = sc.nextLine();
    }
    
    @Override
    public void in() {
        super.in();
        System.out.printf("|%10s|\n", phongBan);
    }
    
    @Override
    public double luongHangThang() {
        return getLuongCoBan() + 0.4 * getLuongCoBan();
    }
}

