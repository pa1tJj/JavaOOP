/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author PHAN ANH TUAN
 */
public class TienTe extends GiaoDich{
    private String loaiTien;
    private double  tiGia;

    public TienTe(String loaiTien, double tiGia, String maGiaoDich, String ngayGiaoDich, double donGia, int soLuong) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiTien = loaiTien;
        this.tiGia = tiGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

   
    
    @Override 
    public void in() {
        System.out.printf("|%10s|\n", loaiTien);
    }
    
    public double thanhTien() {
        double gia = 0;
        if(loaiTien.equalsIgnoreCase("Euro") || loaiTien.equalsIgnoreCase("usd")) {
            gia = super.getDonGia() * super.getSoLuong();
        }else if(loaiTien.equalsIgnoreCase("VND")) {
            gia = super.getDonGia() * super.getSoLuong();
        }
        return gia;
    }
}

