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
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPhongHoc ql = new QuanLyPhongHoc();
        while (true) {
            System.out.print("\n--------------------MENU-------------------------");
            System.out.print("\n1.them mot phong hoc vao danh sach");
            System.out.print("\n2.tim kiem theo ma phong");
            System.out.print("\n3.in danh sach cac phong hoc");
            System.out.print("\n4.in danh sach cac phong dat chuan");
            System.out.print("\n5.sap xep danh sach tang dan theo day nha");
            System.out.print("\n6.sap xep danh sach giam dan theo dien tich");
            System.out.print("\n7.sap xep danh sach tang dan theo so bong den");
            System.out.print("\n8.cap nhat so luong may tinh");
            System.out.print("\n9.xoa mot phong hoc");
            System.out.print("\n10.tong so phong hoc");
            System.out.print("\n11.danh sach phong may tinh co 60 may");
            System.out.print("\nchon menu:");
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1 ->
                    ql.themPhongHoc();
                case 2 -> {
                    String maPhongTimKiem;
                    System.out.println("nhap ma phong hoc can tim kiem:");
                    maPhongTimKiem = sc.nextLine();
                    ql.timKiemTheoMaPhong(maPhongTimKiem);
                }
                case 3 ->
                    ql.inDanhSach();
                case 4 ->
                    ql.inDanhSachSachPhongHocDatChuan();
                case 5 ->
                    ql.sapXepDanhSachTangDanTheoDayNha();
                case 6 ->
                    ql.sapXepDanhSachGiamDanTheoDienTich();
                case 7 ->
                    ql.sapXepDanhSachTangDanTheoSoBongDen();
                case 8 -> {
                    System.out.print("nhap so luong moi:");
                    int soLuongMoi = Integer.parseInt(sc.nextLine());
                    System.out.print("nhap ma may tinh can cap nhat so luong:");
                    String maMayCanTim = sc.nextLine();
                    ql.capNhatSoLuongMayTinh(maMayCanTim, soLuongMoi);
                }
                case 9 -> {
                    String maPhongCanXoa;
                    System.out.println("ban co chan chan muon xoa khong");
                    System.out.println("1.co");
                    System.out.println("2.khong");
                    int chon = sc.nextInt();
                    sc.nextLine();
                    switch(chon) {
                        case 1 -> {
                            System.out.print("nhap ma phong can xoa:");
                            maPhongCanXoa = sc.nextLine();
                            ql.xoaMotPhongHoc(maPhongCanXoa);
                        }
                        case 2 -> {}
                    }
                    
                }
                case 10 ->
                    ql.tongSoPhongHoc();
                case 11 ->
                    ql.danhSachCacPhongCo60May();
            }
        }
    }
}

