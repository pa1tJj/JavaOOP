/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThueBaoInternet;

/**
 *
 * @author Admin
 */
public class DialUp extends ThueBao{
    private static int thueBaoHangThang = 30000;
    private static int donGiaPhut = 30;
    private int thoiGianTruyCap;

    public DialUp(int thoiGianTruyCap) {
        super();
        this.thoiGianTruyCap = thoiGianTruyCap;
    }

    

    public int getThoiGianTruyCap() {
        return thoiGianTruyCap;
    }

    public void setThoiGianTruyCap(int thoiGianTruyCap) {
        this.thoiGianTruyCap = thoiGianTruyCap;
    }

    public static int getThueBaoHangThang() {
        return thueBaoHangThang;
    }

    public static void setThueBaoHangThang(int thueBaoHangThang) {
        DialUp.thueBaoHangThang = thueBaoHangThang;
    }

    public static int getDonGiaPhut() {
        return donGiaPhut;
    }

    public static void setDonGiaPhut(int donGiaPhut) {
        DialUp.donGiaPhut = donGiaPhut;
    }

    @Override
    public String toString() {
        return "thue bao DialUp co thue bao hang thang = " + thueBaoHangThang + 
        ",don gia phut = " + donGiaPhut + ",so phut truy cap = " + thoiGianTruyCap + ",tong tien:" + tinhTien();
    }
    
    @Override
    public long tinhTien() {
        return  thueBaoHangThang + thoiGianTruyCap * donGiaPhut;
    }
}
