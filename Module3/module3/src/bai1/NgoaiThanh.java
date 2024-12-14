/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author PHAN ANH TUAN
 */
public class NgoaiThanh extends ChuyenXe{
    private int soNgayDiDuoc;
    private String noiDen;

    public NgoaiThanh(int soNgayDiDuoc, String noiDen, String maSo, String hoTenTaiXe, int soXe, double doanhThu) {
        super(maSo, hoTenTaiXe, soXe, doanhThu);
        this.soNgayDiDuoc = soNgayDiDuoc;
        this.noiDen = noiDen;
    }

    

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    
    @Override
    public void in() {
        super.in();
        System.out.printf("|%4d|%10s|\n", soNgayDiDuoc, noiDen);
    }
}

