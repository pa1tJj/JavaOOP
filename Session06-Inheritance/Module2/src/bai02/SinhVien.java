/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai02;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    String maSV, hoTen;
    double diemLT, diemTH;
    
    public SinhVien(){
        
    }
    
    public SinhVien(String maSV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    } 

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    
    public double diemTB() {
        return (diemLT +diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + '}';
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap  ma sinh vien:");
        maSV = sc.nextLine();
        System.out.println("nhap ho ten sinh vien:");
        hoTen = sc.nextLine();
        System.out.println("nhap diem ly thuyet:");;
        diemLT = sc.nextDouble();
        System.out.println("nhap diem thuc hanh:");
        diemTH = sc.nextDouble();
    }
    
    public void in() {
        System.out.printf("|%10s|%25s|%4.2f|%4.2f|%4.2f|\n", maSV, hoTen, diemLT, diemTH, diemTB());
    }
}
