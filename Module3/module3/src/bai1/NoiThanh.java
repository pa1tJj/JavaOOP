/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author PHAN ANH TUAN
 */
public class NoiThanh extends ChuyenXe{
    private int soTuyen;
    private double soKmDiDuoc;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public NoiThanh(int soTuyen, double soKmDiDuoc, String maSo, String hoTenTaiXe, int soXe, double doanhThu) {
        super(maSo, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    @Override
    public void in() {
        super.in();
        System.out.printf("|%4d|%.2f|\n", soTuyen, soKmDiDuoc);
    }  
    
}

