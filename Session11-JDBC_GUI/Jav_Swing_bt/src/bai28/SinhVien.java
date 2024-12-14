/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai28;

/**
 *
 * @author PHAN ANH TUAN
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String maLop;
    private double diemLyThuyet;
    private double diemThucHanh;
    private String kq;
    public SinhVien() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        if(diemLyThuyet >= 0 && diemLyThuyet <= 10) {
            this.diemLyThuyet = diemLyThuyet;
        }
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        if(diemThucHanh >= 0 && diemThucHanh <= 10) {
            this.diemThucHanh = diemThucHanh;
        }
    }
    
    public double diemTB() {
        return (diemLyThuyet + diemThucHanh) / 2;
    }
    
    public String getketQua() {
        return kq = (diemTB() >= 5) ? "đậu" : "rớt";
    }

    public void setKq(String kq) {
        this.kq = kq;
    }
    
   
}
