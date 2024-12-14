/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Dat extends GiaoDich{
    char loaiDat;

    public Dat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
    }
    
    public Dat(){}

    public char getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(char loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    
}

