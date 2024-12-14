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
public class LyThuyet extends PhongHoc{
    private String mayChieu;

    public LyThuyet() {
    }

    public String getMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(String mayChieu) {
        this.mayChieu = mayChieu;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("kiem tra may chieu:");
        System.out.print("\n1.co / 2.khong:");
        int c = sc.nextInt();
        switch(c) {
            case 1 -> mayChieu = "Co";
            case 2 -> mayChieu = "khong";
        }
    }
    
    @Override
    public void in() {
        super.in();
        System.out.print("\nmay chieu:" + mayChieu);
    }
    
    @Override
    public boolean kiemTraPhongHoc() {
        return mayChieu.equalsIgnoreCase("co") && super.kiemTraPhongHoc();
    }
}

