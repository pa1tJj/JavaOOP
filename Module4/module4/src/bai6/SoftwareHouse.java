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
public class SoftwareHouse {

    private ArrayList<Employee> el = new ArrayList<>();
    public static final Scanner sc = new Scanner(System.in);

    public SoftwareHouse() {
    }

    public boolean kiemTraMaTrung(String maTrung) {
        for (Employee employee : el) {
            if (employee.getMaNhanVien().equalsIgnoreCase(maTrung)) {
                return true;
            }
        }
        return false;
    }

    public boolean themNhanVien(Employee x) {
        if (kiemTraMaTrung(x.getMaNhanVien())) {
            return false;
        }
        return el.add(x);
    }

    public void hienThiDanhSachNhanVien() {
        for (Employee employee : el) {
            employee.in();
        }
    }

    public void nhapDanhSachNhanVien() {
        int c;
        do {
            System.out.println("1.them lap trinh vien");
            System.out.println("2.them nguoi quan ly");
            System.out.println("3.them nguoi quan ly");
            System.out.print("chon nhan vien can them/0.thoat:");
            c = sc.nextInt();
            switch (c) {
                case 1 -> {
                    Programmer p = new Programmer();
                    p.nhap();
                    themNhanVien(p);
                }
                case 2 -> {
                    Administrator a = new Administrator();
                    a.nhap();
                    themNhanVien(a);
                }
                case 3 -> {
                    ProjectLeader p = new ProjectLeader();
                    p.nhap();
                    themNhanVien(p);
                }
                case 0 -> {}
            }
        }while(c != 0);
    }
    
    
    public void tongTien() {
        double sum = 0;
        for (Employee employee : el) {
            sum += employee.luongHangThang();
        }
        System.out.println(sum);
    }
     
    public void sapXepNhanVienTheoTen() {
        for (int i = 0; i < el.size() - 1; i++) {
            for (int j = i + 1; j < el.size(); j++) {
                if(el.get(i).getTenNhanVien().compareToIgnoreCase(el.get(j).getTenNhanVien()) > 0) {
                    Employee tmp = el.get(i);
                    el.set(i, el.get(j));
                    el.set(j, tmp);
                }
            }
        }
    }
    
    public void hienThiDanhSachLapTrinhVien() {
        int check = 0;
        for (Employee employee : el) {
            if(employee instanceof Programmer) {
                employee.in();
                check++;
            }
            
        }
        if(check == 0) {
            System.out.println("khong co lap trinh vien nao");
        }
    }
    
    public boolean capNhatPhongBan(String maSoNguoiSua, String phongBanMoi) {      
        for (Employee employee : el) {
            if(employee.getMaNhanVien().equalsIgnoreCase(maSoNguoiSua)) {
                if(employee instanceof Administrator a) {
                    a.setPhongBan(phongBanMoi);
                    return true;
                }                
            }
        }
        return false;
    }
    
    public boolean xoaNhanVienTheoMaSo(String maSoNhanVienCanXoa) {
        for (Employee employee : el) {
            if(employee.getMaNhanVien().equalsIgnoreCase(maSoNhanVienCanXoa)) {
                el.remove(employee);
                return true;
            }
        }
        return false;
    }
   
}

