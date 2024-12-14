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
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachHangHoa ds = new DanhSachHangHoa();
        while(true) {
            System.out.print("\n----------------MENU-------------------");
            System.out.print("\n1.them hang hoa vao danh sach");
            System.out.print("\n2.in toan bo danh sach hang hoa");
            System.out.print("\n3.in tung loai hang hoa");
            System.out.print("\n4.tim kiem hang hoa theo ma hang");
            System.out.print("\n5.sap xep hang hoa theo ten");
            System.out.print("\n6.sap xep hang hoa theo so luong ton");
            System.out.print("\n7.cac loai thuc pham kho ban");
            int c;
            System.out.print("\nchon menu:");
            c = sc.nextInt();
            switch(c) {
                case 1 -> ds.nhapDanhSach();
                case 2 -> ds.inDanhSach();
                case 3 -> ds.inTungLoai();
                case 4 -> {
                    String maTimKiem;
                    sc.nextLine();
                    System.out.println("nhap ma tim kiem:");
                    maTimKiem = sc.nextLine();
                    ds.timKiemTheoMa(maTimKiem);
                }
                case 5 -> ds.sapXepTheoTenTangDan();
                case 6 -> ds.sapXepTheoSoLuongTonGiamDan();
                case 7 -> ds.hangThucPhamKhoBan();
            }
        }
    }
}

