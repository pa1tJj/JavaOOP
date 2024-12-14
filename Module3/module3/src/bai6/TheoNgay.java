/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author PHAN ANH TUAN
 */
public class TheoNgay extends HoaDon{
    private int soNgayThue;

    public TheoNgay() {
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("nhap so ngay thue:");
        soNgayThue = sc.nextInt();
    }
    
    @Override
    public void in() {
        super.in();
        System.out.printf("%4d|\n", soNgayThue);
    }
    
    public double thanhTien() {
        if(soNgayThue > 7) {
            return soNgayThue * (getDonGia() * 0.2);
        }else {
            return soNgayThue * getDonGia();
        }
    }
    
    @Override
    public boolean kiemTra(HoaDon x) {
        if(x.getMaHoaDon().equalsIgnoreCase(this.getMaHoaDon())) {
            return true;
        }
        return false;
    }
}

