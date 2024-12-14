/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class DanhSachHoaDon {

    ArrayList<HoaDon> h;
    static final Scanner sc = new Scanner(System.in);

    public DanhSachHoaDon() {
        h = new ArrayList<>();
    }

    public void nhapDanhSach() {
        int c;
        do {
            System.out.print("\n1.nhap hoa don theo gio");
            System.out.print("\n2.nhap hoa don theo ngay");
            System.out.print("\n0.thoat");
            System.out.print("\nchon hoa don can nhap thong tin:");
            c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1 -> {
                    TheoGio tg = new TheoGio();
                    tg.nhap();
                    h.add(tg);
                }
                case 2 -> {
                    TheoNgay tn = new TheoNgay();
                    tn.nhap();
                    h.add(tn);
                }
                case 0 -> {
                }
            }
        } while (c != 0);
    }

    public void inDanhSach() {
        for (HoaDon hoaDon : h) {
            hoaDon.in();
        }
    }

    public void themHoaDon() {
        int c;
        do {
            System.out.println("1.them hoa don theo gio");
            System.out.println("2.them hoa don theo ngay");
            System.out.println("0.thoat");
            System.out.println("chon hoa don can them:");
            c = sc.nextInt();
            switch (c) {
                case 1 -> {
                    int viTriThem;
                    System.out.println("nhap vi tri them:");
                    viTriThem = sc.nextInt();
                    TheoGio tg2 = new TheoGio();
                    tg2.nhap();
                    int dem = 0;
                    for (int i = 0; i < h.size(); i++) {
                        if(tg2.kiemTra(h.get(i)) == true) {
                            dem ++;
                        }
                    }
                    if(dem == 0) {
                        h.add(viTriThem, tg2);
                    }
                    break;
                }
                case 2 -> {
                    int viTriThem;
                    System.out.println("nhap vi tri them");
                    viTriThem = sc.nextInt();
                    TheoNgay tn2 = new TheoNgay();
                    tn2.nhap();
                    int dem = 0;
                    for (int i = 0; i < h.size(); i++) {
                        if(tn2.kiemTra(h.get(i)) == true) {
                            dem ++;
                        }
                    }
                    if(dem == 0) {
                        h.add(viTriThem, tn2);
                    }
                    break;
                }
            }
        } while (c != 0);

    }

    public void thongKeSoLuong() {
        int demHDTheoGio = 0;
        int demHDTheoNgay = 0;
        for (HoaDon hoaDon : h) {
            if (hoaDon instanceof TheoGio) {
                demHDTheoGio++;
            } else {
                demHDTheoNgay++;
            }
        }
        System.out.print("\nso luong hop dong theo gio:" + demHDTheoGio);
        System.out.print("\nso luong hop dong theo ngay:" + demHDTheoNgay);
    }

    public void tongTien() {
        double sum = 0;
        for (HoaDon hoaDon : h) {
            if (hoaDon instanceof TheoGio) {
                TheoGio tg = (TheoGio) hoaDon;
                sum += tg.thanhTien();
            } else if (hoaDon instanceof TheoNgay) {
                TheoNgay tn = (TheoNgay) hoaDon;
                sum += tn.thanhTien();
            }

        }
        System.out.print(sum);
    }
}

