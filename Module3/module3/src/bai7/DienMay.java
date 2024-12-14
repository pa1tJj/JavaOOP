/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */public class DienMay extends HangHoa{
    private int thoiGianBaoHanh;
    private int congSuat;

    public DienMay() {
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {            
            System.out.println("nhap thoi gian bao hanh:");
            thoiGianBaoHanh = sc.nextInt();
        } while (thoiGianBaoHanh < 0);
        do {            
            System.out.println("nhap cong suat:");
            congSuat = sc.nextInt();
        } while (congSuat < 0);
    }
    
    @Override 
    public void in() {
        super.in();
        System.out.print("\nthoi gian bao hanh:" + thoiGianBaoHanh);
        System.out.print("\ncong suat:" + congSuat);
    }
}

