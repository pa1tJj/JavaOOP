/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Sach {
    private String maSach;
    private String ngayNhap;
    private int soLuong;
    private String nhaXuatBan;
    private double donGia;

    public Sach(String maSach, String ngayNhap, int soLuong, String nhaXuatBan, double donGia) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    
    
    public void in() {
        System.out.printf("|%10s|%10s|%.2f|%4d|%10s|", maSach, ngayNhap,
                donGia, soLuong, nhaXuatBan);
    }

}
