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
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoftwareHouse sh = new SoftwareHouse();
        while (true) {
            System.out.println("-----------------MENU----------------");
            System.out.println("1.nhap thong tin nhan vien");
            System.out.println("2.hien thi danh sach nhan vien");
            System.out.println("3.tong tien phai tra cho nhan vien");
            System.out.println("4.sap xep nhan vien theo ten");
            System.out.println("5.hien thi danh sach lap trinh vien");
            System.out.println("6.cap nhat phong ban");
            System.out.println("7.xoa mot nhan vien theo ma so");
            System.out.println("chon menu:");
            int c = sc.nextInt();
            switch (c) {
                case 1 ->
                    sh.nhapDanhSachNhanVien();
                case 2 ->
                    sh.hienThiDanhSachNhanVien();
                case 3 ->
                    sh.tongTien();
                case 4 ->
                    sh.sapXepNhanVienTheoTen();
                case 5 ->
                    sh.hienThiDanhSachLapTrinhVien();
                case 6 -> {
                    sc.nextLine();
                    System.out.print("nhap ma nguoi quan ly can cap nhat phong ban:");
                    String maNhanVienCapNhap = sc.nextLine();
                    System.out.print("nhap phong ban moi:");
                    String phongBanMoi = sc.nextLine();
                    if(sh.capNhatPhongBan(maNhanVienCapNhap, phongBanMoi) == true) {
                        System.out.println("cap nhat thanh cong");
                    }else {
                        System.out.println("cap nhat khong thanh cong");
                    }
                    
                }
                case 7 -> {
                    sc.nextLine();
                    String maNhanVienCanXoa;
                    System.out.print("nhap ma nhan vien can xoa:");
                    maNhanVienCanXoa = sc.nextLine();
                    if(sh.xoaNhanVienTheoMaSo(maNhanVienCanXoa) == true) {
                        System.out.println("xoa thanh cong");
                    }else {
                        System.out.println("xoa khong thanh cong");
                    }                    
                }
            }
        }
    }
}
