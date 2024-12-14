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
        DanhSachHoaDon ds = new DanhSachHoaDon();
        while(true) {
            System.out.println("----------------------Menu---------------------");
            System.out.println("1.nhap thong tin");
            System.out.println("2.in thong tin");
            System.out.println("3.them hoa don");
            System.out.println("4.thong ke so luong hoa don");
            System.out.println("5.tong thanh tien hoa don");
            int c;
            System.out.println("chon menu:");
            c = Integer.parseInt(sc.nextLine());
            switch(c) {
                case 1 -> ds.nhapDanhSach();
                case 2 -> ds.inDanhSach();
                case 3 -> ds.themHoaDon();
                case 4 -> ds.thongKeSoLuong();
                case 5 -> ds.tongTien();
            }
        }
    }
}

