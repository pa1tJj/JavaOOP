/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Vang extends GiaoDich{
    private String loaiVang;

    public Vang(String loaiVang, String maGiaoDich, String ngayGiaoDich, double  donGia, int soLuong) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    @Override 
    public void in() {
        System.out.printf("|%10s|\n", loaiVang);
    }
    
    public double thanhTien() {
        return super.getSoLuong() * super.getDonGia();
    }
}

