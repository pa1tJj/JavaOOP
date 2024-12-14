/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThueBaoInternet;

/**
 *
 * @author Admin
 */
public class T1 extends ThueBao{
    private static int thueBaoHangThang = 2000000;

    public T1() {
        super();
    }

    public static int getThueBaoHangThang() {
        return thueBaoHangThang;
    }

    public static void setThueBaoHangThang(int thueBaoHangThang) {
        T1.thueBaoHangThang = thueBaoHangThang;
    }

    @Override
    public String toString() {
        return "thue bao T1 co thue bao hang thang = " + thueBaoHangThang + ",tong tien:" + tinhTien();
    }
    
    @Override
    public long tinhTien() {
        return thueBaoHangThang;
    }
}
