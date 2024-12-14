/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author PHAN ANH TUAN
 */
public class SachThamKhao extends Sach{
    private double thue;

    public SachThamKhao(double thue, String maSach, String ngayNhap, int soLuong, String nhaXuatBan, double donGia) {
        super(maSach, ngayNhap, soLuong, nhaXuatBan, donGia);
        this.thue = thue;
    }
    
    @Override
    public void in() {
        System.out.printf("|%.2f|", thue);
    }
    
    public double thanhTien() {
        return super.getSoLuong() * super.getDonGia() + thue;
    }
}

