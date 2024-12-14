/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai05;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HangThucPham {

    String maHang, tenHang;
    String ngaySX, ngayHetHan;
    double donGia;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, String ngaySX, String ngayHetHan, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.donGia = donGia;
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

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HangThucPham{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", ngaySX=" + ngaySX + ", ngayHetHan=" + ngayHetHan + ", donGia=" + donGia + '}';
    }

    public void nhap(HangThucPham h[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            h[i] = new HangThucPham();
            System.out.println("nhap ma hang:");
            h[i].maHang = sc.nextLine();
            System.out.println("nhap ten hang:");
            h[i].tenHang = sc.nextLine();
            System.out.println("nhap ngay san xuat:");
            h[i].ngaySX = sc.nextLine();
            System.out.println("nhap ngay het han:");
            h[i].ngayHetHan = sc.nextLine();
            System.out.println("nhap don gia:");
            h[i].donGia = Double.parseDouble(sc.nextLine());
        }

    }

    public void in(HangThucPham h[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("ma hang:" + h[i].maHang);
            System.out.println("ten hang:" + h[i].tenHang);
            System.out.println("ngay san xuat:" + h[i].ngaySX);
            System.out.println("ngay het han:" + h[i].ngayHetHan);
            System.out.println("don gia:" + h[i].donGia);
            System.out.print("han su dung:" + h[i].donGia);
            h[i].hanSuDung();
        }

    }
    
    public void outPut(HangThucPham h[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "ma hang", 
            "ten hang", "ngay het han", "ngay san xuat", "don gia", "han su dung");
            System.out.printf("|%15s|%15s|%15s|%15s|%4.2f|\n", h[i].maHang, 
            h[i].tenHang, h[i].ngayHetHan, h[i].ngaySX, h[i].donGia );
        }
    }
    public boolean kiemTraHanSuDung() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lcal = LocalDate.parse(ngayHetHan, dtf);
        return lcal.isBefore(LocalDate.now());
    }

    public void hanSuDung() {
        if (kiemTraHanSuDung() == true) {
            System.out.println("het han su dung");
        } else {
            System.out.println("con han su dung");
        }
    }
}
