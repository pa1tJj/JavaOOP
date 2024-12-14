/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author PHAN ANH TUAN
 */
public class SachGiaoKhoa extends Sach{
    private String tinhTrang;

    public SachGiaoKhoa(String tinhTrang, String maSach, String ngayNhap, int soLuong, String nhaXuatBan, double donGia) {
        super(maSach, ngayNhap, soLuong, nhaXuatBan, donGia);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public void in() {
        super.in();
        System.out.printf("|%10s|\n", tinhTrang);
    }
    
    public double thanhTien() {
        double thanh = 0.0;
        if(tinhTrang.equalsIgnoreCase("cu")) {
            thanh = super.getSoLuong() * super.getDonGia() * 0.5;
        }else if(tinhTrang.equalsIgnoreCase("moi")) {
            thanh = super.getDonGia() * super.getDonGia();
        }
        return thanh;
    }
    
}

