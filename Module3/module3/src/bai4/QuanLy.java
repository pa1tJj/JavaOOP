/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class QuanLy {
    private ArrayList<GiaoDich> ql;
    public Scanner sc = new Scanner(System.in);
    
    public QuanLy(){
        ql = new ArrayList<>();
    }
    
//    GiaoDich taoGiaoDich(String loaiGiaoDich) {
//        GiaoDich g = new GiaoDich();
//        sc.nextLine();
//        System.out.println("nhap ma giao:");
//        g.setMaGiaoDich(sc.nextLine());
//        System.out.println("nhap ngay giao dich:");
//        g.setNgayGiaoDich(sc.nextLine());
//        System.out.println("nhap don gia:");
//        g.setDonGia(sc.nextDouble());
//        System.out.println("nhap dien tich:");
//        g.setDienTich(sc.nextDouble());
//        if(loaiGiaoDich.equalsIgnoreCase("Nha")) {
//            Nha nha = (Nha)g;
//            System.out.println("nhap dia chi:");
//            nha.setDiaChi(sc.nextLine());
//            System.out.println("nhap loai nha:");
//            String s;
//            s = sc.nextLine();
//            switch(s) {
//                case "cao cap" -> nha.setLoaiNha(s);
//                case "thuong" -> nha.setLoaiNha(s);
//            }
//        }else if(loaiGiaoDich.equalsIgnoreCase("Dat")) {
//            Dat dat = (Dat)g;
//            System.out.println("nhap loai dat:");
//            char c;
//            c = sc.next().charAt(0);
//            switch(c) {
//                case 'A' -> dat.setLoaiDat(c);
//                case 'B' -> dat.setLoaiDat(c);
//                case 'C' -> dat.setLoaiDat(c);
//            }
//        }
////        return g;
//    }
    Dat taoDatMoi(){
        Dat d = new Dat();      
        sc.nextLine();
        System.out.println("nhap ma giao:");
        d.setMaGiaoDich(sc.nextLine());
        System.out.println("nhap ngay giao dich:");
        d.setNgayGiaoDich(sc.nextLine());
        System.out.println("nhap don gia:");
        d.setDonGia(sc.nextDouble());
        System.out.println("nhap dien tich:");
        d.setDienTich(sc.nextDouble());
        System.out.println("nhap loai dat:");
        char x;
        x = sc.next().charAt(0);
        switch(x) {
            case 'A' -> d.setLoaiDat(x);
            case 'B' -> d.setLoaiDat(x);
            case 'C' -> d.setLoaiDat(x);
        }
        return d;
    }
    
    Nha taoNhaMoi() {
        Nha nha = new Nha();
        sc.nextLine();
        System.out.println("nhap ma giao:");
        nha.setMaGiaoDich(sc.nextLine());
        System.out.println("nhap ngay giao dich:");
        nha.setNgayGiaoDich(sc.nextLine());
        System.out.println("nhap don gia:");
        nha.setDonGia(sc.nextDouble());
        System.out.println("nhap dien tich:");
        nha.setDienTich(sc.nextDouble());
        sc.nextLine();
        System.out.println("nhap dia chi:");
        nha.setDiaChi(sc.nextLine());
        System.out.println("nhap loai nha:");
        String s;
        s = sc.nextLine();
        switch(s) {
            case "cao cap" -> nha.setLoaiNha(s);
            case "thuong" -> nha.setLoaiNha(s);
        }
        return nha;
    }
    
    public void nhapGiaoDich() {
        int c;
        do {            
            System.out.println("1.nhap thong tin dat");
            System.out.println("2.nhap thong tin nha");
            System.out.println("0.thoat");
            System.out.println("chon giao dich can nhap thong tin:");
            c = sc.nextInt();
            switch(c) {
                case 1 -> ql.add(taoDatMoi());
                case 2 -> ql.add(taoNhaMoi());
                case 0 -> {
                }
            }
        } while (c != 0);
    }
    
    public void tongSoLuong() {
        int demNha = 0; 
        int demDat = 0;
        for (GiaoDich giaoDich : ql) {
            if(giaoDich instanceof Dat) {
                demDat ++;
            }else if(giaoDich instanceof Nha) {
                demNha ++;
            }
        }
        System.out.println("so luong giao dich nha:" + demNha);
        System.out.println("so luong giao dich dat:" + demDat);
    }
    
    public double thanhTien(GiaoDich giaoDich) {
        double tien = 0;
        if(giaoDich instanceof Dat) {
            Dat dat = (Dat)giaoDich;
            if(dat.getLoaiDat() == 'A') {
                tien = dat.getDienTich() * dat.getDonGia() * 1.5;
            }else {
                tien = dat.getDienTich() * dat.getDonGia();
            }
        }
        if(giaoDich instanceof Nha) {
            Nha nha = (Nha)giaoDich;
            if(nha.getLoaiNha().equalsIgnoreCase("cao cap")) {
                tien = nha.getDienTich() * nha.getDonGia();
            }else{
                tien = nha.getDienTich() * nha.getDonGia() * 0.9;
            }
        }
        return tien;
    }
    public double trungBinhThanhTienGiaoDichDat() {
        int dem = 0;
        double sum = 0;
        for (GiaoDich giaoDich : ql) {
            if(giaoDich instanceof Dat) {
                Dat d = (Dat)giaoDich;
                dem ++;
                sum += thanhTien(d);
            }
        }
        return sum/dem;
    }
    
    public void inGiaoDich92023() {
        for (GiaoDich giaoDich : ql) {
            if(giaoDich.getNgayGiaoDich().substring(3).equalsIgnoreCase("09/2013")) {
                inThongTin(giaoDich);
            }
        }
    }
    public void inThongTin(GiaoDich g) {
        System.out.print("\nma giao dich:" + g.getMaGiaoDich());
        System.out.print("\nngay giao dich:" + g.getNgayGiaoDich());
        System.out.print("\ndon gia:" + g.getDonGia());
        
        System.out.print("\ndien tich:" + g.getDienTich());
        if(g instanceof Dat) {
            Dat d = (Dat)g;
            System.out.print("\nloai dat:" + d.getLoaiDat());
            System.out.print("\nthanh tien:" + thanhTien(d));
        }else if(g instanceof Nha) {
            Nha nha = (Nha)g;
            System.out.print("\ndia chi:" + nha.getDiaChi());
            System.out.print("\nloai nha:" + nha.getLoaiNha());
            System.out.print("\nthanh tien:" + thanhTien(nha));
        }
    }
    
    public void xuatDanhSachGiaoDich() {
        for (GiaoDich giaoDich : ql) {
            inThongTin(giaoDich);
        }
    }
    
    public void Menu() {
        while(true) {
            System.out.println();
            System.out.print("\n----------------MENU-----------------");
            System.out.print("\n1.nhap thong tin giao dich");
            System.out.print("\n2.in thong tin giao dich");
            System.out.print("\n3.tong so luong tung loai");
            System.out.print("\n4.trung binh thanh tien giao dich dat");
            System.out.print("\n5.cac giao dich thang 9/2013");
            int c;
            System.out.print("\nchon:");
            c = sc.nextInt();
            switch(c) {
                case 1:
                    nhapGiaoDich();
                    break;
                case 2:
                    xuatDanhSachGiaoDich();
                    break;
                case 3:
                    tongSoLuong();
                    break;
                case 4:System.out.println(trungBinhThanhTienGiaoDichDat());
                    break;
                case 5:
                    inGiaoDich92023();
                    break;
            }
        }
    }
}

