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
public class Programmer extends Employee{
    private String ngonNguLapTrinh;

    public Programmer() {
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap ngon ngu lap trinh:");
        ngonNguLapTrinh = sc.nextLine();
    }
    
    @Override
    public void in() {
        super.in();
        System.out.printf("|%10s|\n", ngonNguLapTrinh);
    }
    
    @Override
    public double luongHangThang() {
        if(ngonNguLapTrinh.equalsIgnoreCase("java")) {
            return getLuongCoBan() + 0.2 * getLuongCoBan();
        }else{
            return getLuongCoBan();
        }
    }
}

