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
public class SanhSu extends HangHoa{
    private String nhaSanXuat;
    private String ngayNhapKho;

    public SanhSu() {
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(String ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap nha san xuat:");
        nhaSanXuat = sc.nextLine();
        System.out.println("nhap ngay nhap kho:");
        ngayNhapKho = sc.nextLine();
    }
    
    @Override
    public void in() {
        super.in();
        System.out.print("\nnha san xuat:" + nhaSanXuat);
        System.out.print("\nngay nhap kho:" + ngayNhapKho);
    }
}
