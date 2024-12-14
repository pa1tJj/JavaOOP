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
public class Employee extends Person{
    private int heSoLuong;

    public Employee() {
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "Employee{" + "heSoLuong=" + heSoLuong + '}';
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("nhap dia chi:");
        diaChi = sc.nextLine();
        System.out.println("nhap he so luong:");
        heSoLuong = sc.nextInt();
    }
    
    @Override
    public void in() {
        System.out.printf("|%-10s|%-10s|%4d|\n", hoTen, diaChi, heSoLuong);
    }
}

