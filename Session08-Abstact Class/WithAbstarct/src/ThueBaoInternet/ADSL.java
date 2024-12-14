/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThueBaoInternet;

/**
 *
 * @author Admin
 */
public class ADSL extends ThueBao{
    private static int thueBaoHangThang = 50000;
    private static int donGiaMB = 50;
    private int soMBTruyCap;

    public ADSL(int soMBTruyCap) {
        super();
        this.soMBTruyCap = soMBTruyCap;
    }

    public static int getThueBaoHangThang() {
        return thueBaoHangThang;
    }

    public static void setThueBaoHangThang(int thueBaoHangThang) {
        ADSL.thueBaoHangThang = thueBaoHangThang;
    }

    public int getSoMBTruyCap() {
        return soMBTruyCap;
    }

    public void setSoMBTruyCap(int soMBTruyCap) {
        this.soMBTruyCap = soMBTruyCap;
    }

    public static int getDonGiaMB() {
        return donGiaMB;
    }

    public static void setDonGiaMB(int donGiaMB) {
        ADSL.donGiaMB = donGiaMB;
    }

    @Override
    public String toString() {
        return "thue bao ADSL co thue bao hang thang = " + thueBaoHangThang + 
        ",don gia MB = " + donGiaMB + ",so MB truy cap = " + soMBTruyCap + ",tong tien:" + tinhTien();
    }

    
    
    @Override
    public long tinhTien() {
        return thueBaoHangThang + donGiaMB * soMBTruyCap;
    }
}
