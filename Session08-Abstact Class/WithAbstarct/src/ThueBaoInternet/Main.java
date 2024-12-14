/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThueBaoInternet;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachThueBao danhSachThueBao = new DanhSachThueBao();
        while(true) {
            System.out.print("\n1.them thong tin thue bao DialUp");
            System.out.print("\n2.them thong tin thue bao ADSL");
            System.out.print("\n3.them thong tin thue bao T1");
            System.out.print("\n4.hien thi danh sach thue bao");
            System.out.print("\n5.tong tien cuoc tung loai thue bao");
            System.out.print("\n6.tong tien cuoc tat ca cac thue bao");
            System.out.print("\n7.thong tin thue bao ADSL co cuoc lon nhat");
            System.out.print("\nchon menu:");
            int c = sc.nextInt();
            switch(c) {
                case 1 -> {
                    System.out.println("nhap so phut truy cap:");
                    ThueBao dialup = new DialUp(sc.nextInt());
                    danhSachThueBao.themThueBao(dialup);
                }
                case 2 -> {
                    System.out.println("nhap so MB truy cap:");
                    ThueBao adsl = new ADSL(sc.nextInt());
                    danhSachThueBao.themThueBao(adsl);
                }
                case 3 -> {
                    ThueBao t1 = new T1();
                    danhSachThueBao.themThueBao(t1);
                }
                case 4 -> danhSachThueBao.hienThiDanhSach();
                case 5 -> danhSachThueBao.tongTienCuocTungLoai();
                case 6 -> danhSachThueBao.tongTienCuocThueBao();
                case 7 -> danhSachThueBao.thueBaoADSLCuocLonNhat();
            }
        }
    }
}
