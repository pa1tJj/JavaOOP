/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class HangHoa implements Hang{
    private String maHang;
    private String tenHang;
    private int soLuongTon;
    private double donGia;

    public HangHoa() {
        this.tenHang = "xxx";
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hang:");
        maHang = sc.nextLine();
        System.out.println("nhap ten hang:");
        tenHang = sc.nextLine();
        do {            
            System.out.println("nhap so luong ton:");
            soLuongTon = sc.nextInt();
        } while (getSoLuongTon() < 0);
        do {            
            System.out.println("nhap don gia:");
            donGia = sc.nextDouble();
        } while (getDonGia() < 0);
    }
    
    @Override 
    public void in() {
        System.out.print("\nma hang:" + maHang);
        System.out.print("\nten hang:" + tenHang);
        System.out.print("\nso luong ton:" + soLuongTon);
        System.out.print("\ndon gia:" + donGia);
    }
}

