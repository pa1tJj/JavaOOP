/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soDu;
    private final double tiLe = 0.035;

    public Account(long soTaiKhoan, String tenTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
    }

    public Account() {
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void nhap(Account a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = new Account();
            System.out.println("nhap so tai khoan:");
            a[i].soTaiKhoan = sc.nextLong();
            sc.nextLine();
            System.out.println("nhap ten tai khoan:");
            a[i].tenTaiKhoan = sc.nextLine();
            System.out.println("nhap so du:");
            a[i].soDu = sc.nextDouble();
        }
    }
    
    public void in(Account a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("so tai khoan:" + a[i].soTaiKhoan);
            System.out.println("ten tai khoan:" + a[i].tenTaiKhoan);
            System.out.println("so du:" + a[i].soDu);
        }
    }
    @Override
    public String toString() {
        Locale lc = new Locale("vi", "vn");
        return "Account{" + "soTaiKhoan=" + soTaiKhoan + ", tenTaiKhoan=" + tenTaiKhoan + ", soDu=" + soDu + ", tiLe=" + tiLe + '}';
    }
    
    public void themTien(double tienThem) {
        soDu += tienThem;
    }
    
    public void rutTien(double soTienRut) {
         soDu -= soTienRut;
    }
    
    public double tinhTienLai() {
        return soDu + soDu*tiLe;
    }
    
    public void chuyenTien(Account a[], int n, long soTaiKhoanNhan, long soTaiKhoanChuyen, double soTien) {
        for (int i = 0; i < n; i++) {
            if(a[i].soTaiKhoan == soTaiKhoanNhan) {
                a[i].soDu = a[i].soDu + soTien;
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i].soTaiKhoan == soTaiKhoanChuyen) {
                a[i].soDu = a[i].soDu - soTien;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong:");
        n = Integer.parseInt(sc.nextLine());
        Account x = new Account();
        Account a[] = new Account[n];
        while (true) {
            System.out.println("-------------MENU--------------");
            System.out.println("1.nhap thong tin tai khoan");
            System.out.println("2.in thong tin tai khoan");
            System.out.println("3.nhap so tien gui");
            System.out.println("4.nhap so tien rut");
            System.out.println("5.chuyen tien giua 2 tai khoan");
            System.out.println("chon menu:");
            int c;
            c = sc.nextInt();
            switch (c) {
                case 1 -> 
                    x.nhap(a, n);
                case 2 ->
                    x.in(a, n);
                case 3 -> {
                    double tienGui;
                    long sotaiKhoanNguoiGui;
                    System.out.println("nhap so tai khoan nguoi gui:");
                    sotaiKhoanNguoiGui = sc.nextLong();
                    System.out.println("nhap so tien gui:");
                    tienGui = sc.nextDouble();
                    for (int i = 0; i < n; i++) {
                        if (a[i].getSoTaiKhoan() == sotaiKhoanNguoiGui) {
                            a[i].themTien(tienGui);
                        }
                    }
                }
                case 4 -> {
                    double soTienRut;
                    long soTaiKhoanRutTien;
                    System.out.println("nhap so tai khoan can rut tien:");
                    soTaiKhoanRutTien = sc.nextLong();
                    System.out.println("nhap so tien can rut:");
                    soTienRut = sc.nextDouble();
                    for (int i = 0; i < n; i++) {
                        if (a[i].getSoTaiKhoan() == soTaiKhoanRutTien) {
                            a[i].rutTien(soTienRut);
                        }
                    }
                }
                case 5 -> {
                    long sotaiKhoanNhan, soTaiKhoanChuyen;
                    double soTien;
                    System.out.println("nhap so tai khoan chuyen tien:");
                    soTaiKhoanChuyen = sc.nextLong();
                    System.out.println("nhap so tien can chuyen:");
                    soTien = sc.nextDouble();
                    System.out.println("nhap so tai khoan nhan:");
                    sotaiKhoanNhan = sc.nextLong();
                    x.chuyenTien(a, n, sotaiKhoanNhan, soTaiKhoanChuyen, soTien);
                }
            }
        }
    }
}
