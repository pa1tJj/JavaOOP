/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAN ANH TUAN
 */
public class QuanLyPhongHoc {

    private ArrayList<PhongHoc> ph;
    private Scanner sc = new Scanner(System.in);

    public QuanLyPhongHoc() {
        ph = new ArrayList<>();
    }

    public boolean kiemTraMaTrung(PhongHoc x) {
        for (PhongHoc phongHoc : ph) {
            if (x.getMaPhongHoc().equalsIgnoreCase(phongHoc.getMaPhongHoc())) {
                return true;
            }
        }
        return false;
    }

    public void themPhongHoc() {
        System.out.println("1.them phong ly thuyet");
        System.out.println("2.them phong thi nghiem");
        System.out.println("3.them phong may tinh");
        System.out.println("chon phong can them:");
        int c = sc.nextInt();
        switch (c) {
            case 1 -> {
                PhongHoc lyThuyet = new LyThuyet();
                boolean check = false;
                do {
                    lyThuyet.nhap();
                    check = true;
                } while (kiemTraMaTrung(lyThuyet) == true);
                if (check == true) {
                    ph.add(lyThuyet);
                }
            }
            case 2 -> {
                PhongHoc thiNghiem = new ThiNghiem();
                boolean check = false;
                do {
                    thiNghiem.nhap();
                    check = true;
                } while (kiemTraMaTrung(thiNghiem) == true);
                if (check == true) {
                    ph.add(thiNghiem);
                }
            }
            case 3 -> {
                PhongHoc mayTinh = new MayTinh();
                boolean check = false;
                do {
                    mayTinh.nhap();
                    check = true;
                } while (kiemTraMaTrung(mayTinh) == true);
                if (check == true) {
                    ph.add(mayTinh);
                }
            }
        }
    }

    public void timKiemTheoMaPhong(String maPhongTimKiem) {
        int check = 0;
        for (PhongHoc phongHoc : ph) {
            if (phongHoc.getMaPhongHoc().equalsIgnoreCase(maPhongTimKiem)) {
                phongHoc.in();
                check++;
            }
        }
        if (check == 0) {
            System.out.println("khong ton tai phong hoc co ma:" + maPhongTimKiem);
        }
    }

    public void inDanhSach() {
        for (PhongHoc phongHoc : ph) {
            phongHoc.in();
        }
    }

    public void inDanhSachSachPhongHocDatChuan() {
        int check = 0;
        for (PhongHoc phongHoc : ph) {
            if (phongHoc.kiemTraPhongHoc()) {
                phongHoc.in();
                check++;
            }
        }
        if (check == 0) {
            System.out.println("khong co phong hoc nao dat chuan");
        }
    }

    public void sapXepDanhSachTangDanTheoDayNha() {
        for (int i = 0; i < ph.size() - 1; i++) {
            for (int j = i; j < ph.size() - 1; j++) {
                if (ph.get(j).getDayNha().compareToIgnoreCase(ph.get(j + 1).getDayNha()) > 0) {
                    PhongHoc tmp = ph.get(j);
                    ph.set(j, ph.get(j + 1));
                    ph.set(j + 1, tmp);
                }
            }
        }
    }

    public void sapXepDanhSachGiamDanTheoDienTich() {
        for (int i = 0; i < ph.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < ph.size(); j++) {
                if (ph.get(max).getDienTich() < ph.get(j).getDienTich()) {
                    max = j;
                }
            }
            PhongHoc tmp = ph.get(max);
            ph.set(max, ph.get(i));
            ph.set(i, tmp);
        }
    }

    public void sapXepDanhSachTangDanTheoSoBongDen() {
        for (int i = 0; i < ph.size() - 1; i++) {
            for (int j = i + 1; j < ph.size(); j++) {
                if (ph.get(i).getSoBongDen() > ph.get(j).getSoBongDen()) {
                    PhongHoc tmp = ph.get(i);
                    ph.set(i, ph.get(j));
                    ph.set(j, tmp);
                }
            }
        }
    }

    public void capNhatSoLuongMayTinh(String maMayTinh, int soLuongMoi) {
        boolean check = false;
        for (int i = 0; i < ph.size(); i++) {
            if (ph.get(i).getMaPhongHoc().equalsIgnoreCase(maMayTinh)) {
                if (ph.get(i) instanceof MayTinh mt) {
                    mt.setSoLuongMayTinh(soLuongMoi);
                    check = true;
                }
            }
        }
        if(check == false) {
            System.out.println("khong ton tai phong may tinh co ma:" + maMayTinh);
        }else {
            System.out.println("cap nhat thanh cong");
        }
    }

    public void xoaMotPhongHoc(String maPhongCanXoa) {
        for (int i = 0; i < ph.size(); i++) {
            if (ph.get(i).getMaPhongHoc().equalsIgnoreCase(maPhongCanXoa)) {
                ph.remove(ph.get(i));
            }
        }
    }

    public void tongSoPhongHoc() {
        System.out.println(ph.size());
    }

    public void danhSachCacPhongCo60May() {
        int check = 0;
        for (PhongHoc phongHoc : ph) {
            if (phongHoc instanceof MayTinh mt) {
                if (mt.getSoLuongMayTinh() == 60) {
                    phongHoc.in();
                    check++;
                }
            }
        }
        if (check == 0) {
            System.out.println("khong co phong may tinh nao co 60 may tinh");
        }
    }
}

