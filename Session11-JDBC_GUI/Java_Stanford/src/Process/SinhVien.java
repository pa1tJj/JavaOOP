/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import java.util.Date;

/**
 *
 * @author PHAN ANH TUAN
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private String dienThoai;
    private String diaChi;
    private String email;
    private int gioiTinh;
    private String maKhoa;
    private Date ngaySinh;

    public SinhVien() {
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public SinhVien(String diaCHi) {
        this.diaChi = diaCHi;
    }

    public SinhVien(String maSV, String hoTen, String dienThoai, String diaChi, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.email = email;
    }
    
    public void setMaSV(String maSV) {
        if(maSV.contains("SF")) {
            System.out.println("day la hoc vien cua Staford");
        }
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaCHi) {
        this.diaChi = diaCHi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
