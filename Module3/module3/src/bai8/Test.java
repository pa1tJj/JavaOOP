/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Test {
    public static void main(String[] args) {
        Management m = new Management();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("\n1.them mot nguoi");
            System.out.print("\n2.xoa mot nguoi");
            System.out.print("\n3.sap xep theo ho ten");
            System.out.print("\n4.in danh sach");
            int c;
            System.out.print("\nchon menu:");
            c = sc.nextInt();
            switch(c) {
                case 1 -> {
                    System.out.println("1.them student");
                    System.out.println("2.them employee");
                    System.out.println("3.them customer");
                    System.out.println("chon nguoi can them:");
                    int chon;
                    chon = sc.nextInt();
                    switch(chon) {
                        case 1 -> {
                            Person p = new Student();
                            m.themMotNguoi(p);
                        }
                        case 2 -> {
                            Person p = new Employee();
                            m.themMotNguoi(p);
                        }
                        case 3 -> {
                            Person p = new Customer();
                            m.themMotNguoi(p);
                        }
                    }
                }
                case 2 -> {
                    String tenXoa;
                    sc.nextLine();
                    System.out.println("nhap ten nguoi muon xoa:");
                    tenXoa = sc.nextLine();
                    m.xoaMotNguoiTheoTen(tenXoa);
                }
                case 3 -> m.sapXepTheoHoTen();
                case 4 -> m.hienThiDanhSach();
            }
        }
    }
}

