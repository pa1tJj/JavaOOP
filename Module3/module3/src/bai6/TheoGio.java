/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author PHAN ANH TUAN
 */
public class TheoGio extends HoaDon{
    private int soGioThue;

    public TheoGio() {
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("nhap so gio thue:");
        soGioThue = sc.nextInt();
    }
    
    @Override
    public void in() {
        super.in();
        System.out.printf("%4d|\n", soGioThue);
    }
    
    public double thanhTien() {
        return getDonGia() * soGioThue;
    }
    
    @Override
    public boolean kiemTra(HoaDon x) {
        if(x.getMaHoaDon().equalsIgnoreCase(this.getMaHoaDon())) {
            return true;
        }
        return false;
    }
}

