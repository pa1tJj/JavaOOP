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
public class Student extends Person {

    private double diem1;
    private double diem2;
    private double diem3;

    public Student() {
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return "Student{" + "diem1=" + diem1 + ", diem2=" + diem2 + ", diem3=" + diem3 + '}';
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("nhap dia chi:");
        diaChi = sc.nextLine();
        System.out.println("nhap diem 1:");
        diem1 = sc.nextDouble();
        System.out.println("nhap diem 2:");
        diem2 = sc.nextDouble();
        System.out.println("nhap diem 3:");
        diem3 = sc.nextDouble();
    }

    @Override
    public void in() {
        System.out.printf("|%-10s|%-10s|%.2f|%.2f|%.2f|\n", hoTen,diaChi ,diem1, diem2, diem3);
    }
    
    public double tinhDiemTrungBinh() {
        return (diem1 + diem2 + diem3)/3;
    } 
}

