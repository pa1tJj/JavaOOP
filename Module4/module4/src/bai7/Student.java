/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Student extends Person{
    private String maSinhVien;
    private int namTrungTuyen;

    public Student() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public int getNamTrungTuyen() {
        return namTrungTuyen;
    }

    public void setNamTrungTuyen(int namTrungTuyen) {
        this.namTrungTuyen = namTrungTuyen;
    }
    
}

