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
public class ThiNghiem extends PhongHoc{
    private String chuyenNghanh;
    private int sucChua;
    private String bonRua;

    public ThiNghiem() {
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getBonRua() {
        return bonRua;
    }

    public void setBonRua(String bonRua) {
        this.bonRua = bonRua;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("nhap chuyen nghanh:");
        chuyenNghanh = sc.nextLine();
        System.out.print("nhap suc chua:");
        sucChua = sc.nextInt();
        System.out.print("bon rua: 1.co / 2.khong:");
        int c = sc.nextInt();
        switch(c) {
            case 1 -> {
                bonRua = "Co";
            }
            case 2 -> {
                bonRua = "Khong";
            }
        }
    }
    
    @Override
    public void in() {
        super.in();
        System.out.print("\nchuyen nghanh:" + chuyenNghanh);
        System.out.print("\nsuc chua:" + sucChua);
        System.out.print("\nbon rua:" + bonRua);
    }
    
    @Override
    public boolean kiemTraPhongHoc() {
        return bonRua.equalsIgnoreCase("co") && super.kiemTraPhongHoc();
    }
}
