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
public class HoaDon {
    private String maHoaDon;
    private String ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;
    
    public static final Scanner sc = new Scanner(System.in);
    public HoaDon() {
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void nhap() {
        System.out.print("nhap ma hoa don:");
        sc.nextLine();
        maHoaDon = sc.nextLine();
        System.out.print("nhap ngay hoa don:");
        ngayHoaDon = sc.nextLine();
        System.out.print("nhap ten khach hang:");
        tenKhachHang = sc.nextLine();
        System.out.print("nhap ma phong:");
        maPhong = sc.nextLine();
        System.out.print("nhap don gia:");
        donGia = sc.nextDouble();
    }
    
    public void in() {
        System.out.printf("|%10s|%10s|%10s|%10s|%.2f|", maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
    }
    
    public boolean kiemTra(HoaDon x) {
        if(x.maHoaDon.equalsIgnoreCase(this.maHoaDon)) {
            return true;
        }
        return false;
    }
    

}
