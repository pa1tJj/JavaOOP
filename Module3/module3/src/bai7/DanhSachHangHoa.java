/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class DanhSachHangHoa {

    private ArrayList<HangHoa> hng;
    public static final Scanner sc = new Scanner(System.in);

    public DanhSachHangHoa() {
        hng = new ArrayList<>();
    }

    public void nhapDanhSach() {
        int c;
        do {
            System.out.println("1.them hang thuc pham");
            System.out.println("2.them hang dien may:");
            System.out.println("3.them hang sah su");
            System.out.println("0.thoat");
            System.out.println("chon loai hang can them:");
            c = sc.nextInt();
            switch(c) {
                case 1 ->{
                    HangHoa tp = new ThucPham();
                    tp.nhap();
                    hng.add(tp);
                }
                case 2 -> {
                    HangHoa dm = new DienMay();
                    dm.nhap();
                    hng.add(dm);
                }
                case 3 -> {
                    HangHoa ss = new SanhSu();
                    ss.nhap();
                    hng.add(ss);
                }
                case 0 -> {
                }
            }
        } while (c != 0);
    }
    
    public void inDanhSach() {
        for (HangHoa hang : hng) {
            hang.in();
        }
    }
    
    public void inTungLoai() {
        int c;
        do {            
            System.out.print("\n1.hang thuc pham");
            System.out.print("\n2.hang dien may");
            System.out.print("\n3.hang sanh su");
            System.out.print("\n0.thoat");
            System.out.print("\nchon loai hang can xem:");
            c = sc.nextInt();
            switch(c) {
                case 1 -> {
                    for (HangHoa hangHoa : hng) {
                        if(hangHoa instanceof ThucPham) {
                            hangHoa.in();
                        }
                    }
                }
                case 2 -> {
                    for (HangHoa hangHoa : hng) {
                        if(hangHoa instanceof DienMay) {
                            hangHoa.in();
                        }
                    }
                }
                case 3 -> {
                    for (HangHoa hangHoa : hng) {
                        if(hangHoa instanceof SanhSu) {
                            hangHoa.in();
                        }
                    }
                }
                case 0 -> {
                }
            }
        } while (c != 0);
    }
    
    public void timKiemTheoMa(String maTimKiem) {
        boolean kt = false ;
        for (HangHoa hangHoa : hng) {
            if(hangHoa.getMaHang().equalsIgnoreCase(maTimKiem)) {
                hangHoa.in();
                kt = true;
            }
        }
        if(kt == false) {
            System.out.println("khong ton tai loai hang hao can tim");
        }
    }
    
    public void sapXepTheoTenTangDan() {
        for (int i = 0; i < hng.size() - 1; i++) {
            for (int j = i + 1; j < hng.size(); j++) {
                if(hng.get(i).getTenHang().compareToIgnoreCase(hng.get(j).getTenHang()) > 0) {
                    HangHoa tmp = hng.get(i);
                    hng.set(i, hng.get(j));
                    hng.set(j, tmp);
                }
            }
        }
    }
    
    public void sapXepTheoSoLuongTonGiamDan() {
        for (int i = 0; i < hng.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < hng.size(); j++) {
                if(hng.get(min).getSoLuongTon() < hng.get(j).getSoLuongTon()) {
                    min = j;
                }
            }
            HangHoa tmp = hng.get(i);
            hng.set(i, hng.get(min));
            hng.set(min, tmp);
        }
    }
    
    public void hangThucPhamKhoBan() {
        for (int i = 0; i < hng.size(); i++) {
            if(hng.get(i) instanceof ThucPham tp) {
                if(tp.getSoLuongTon() > 0 && tp.kiemTraNgayHetHan() == true) {
                    tp.in();
                }
            }
        }
    }
    
}

