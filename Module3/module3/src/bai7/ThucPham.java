/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class ThucPham extends HangHoa{
    private String nhaCungCap;
    private String ngaySanXuat;
    private String ngayHetHan;
    public static final Scanner sc = new Scanner(System.in);

    public ThucPham() {
    }

    public ThucPham(String nhaCungCap, String ngaySanXuat, String ngayHetHan) {
        this.nhaCungCap = nhaCungCap;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap nha cung cap:");
        nhaCungCap = sc.nextLine();
        System.out.println("nhap ngay san xuat:");
        ngaySanXuat = sc.nextLine();
        System.out.println("nhap ngay het han:");
        ngayHetHan = sc.nextLine();
    }
    
    @Override 
    public void in() {
        super.in();
        System.out.print("\nnha cung cap:" + nhaCungCap);
        System.out.print("\nngay san xuat:" + ngaySanXuat);
        System.out.print("\nngay het han:" + ngayHetHan);
    }
    
    public boolean kiemTraNgayHetHan() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lcal = LocalDate.parse(ngayHetHan, dtf);
        return lcal.isBefore(LocalDate.now());
    }
}

