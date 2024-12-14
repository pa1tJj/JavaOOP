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
public class MayTinh extends PhongHoc{
    private int soLuongMayTinh;

    public MayTinh() {
    }

    public int getSoLuongMayTinh() {
        return soLuongMayTinh;
    }

    public void setSoLuongMayTinh(int soLuongMayTinh) {
        this.soLuongMayTinh = soLuongMayTinh;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap so luong may tinh:");
        soLuongMayTinh = sc.nextInt();
    }
    
    @Override
    public void in() {
        super.in();
        System.out.print("\nso luong may tinh:" + soLuongMayTinh);
    }
    
    @Override
    public boolean kiemTraPhongHoc() {
        return getDienTich() / 1.5 == soLuongMayTinh && super.kiemTraPhongHoc();
    }
}

