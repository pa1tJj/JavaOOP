/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.util.ArrayList;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Management {
    ArrayList<Person> pr;

    public Management() {
        pr = new ArrayList<>();
    }
    
    public Person themMotNguoi(Person p) {
        p.nhap();
        pr.add(p);
        return p;
    }
    
    public void hienThiDanhSach() {
        for (Person person : pr) {
            person.in();
        }
    }
    
    
    public void xoaMotNguoiTheoTen(String tenNguoiCanXoa) {
        int dem = 0;
        for (int i = 0; i < pr.size(); i++) {
            if(pr.get(i).getHoTen().equalsIgnoreCase(tenNguoiCanXoa)) {
                pr.remove(pr.get(i));
                dem ++;
            }
        }
        if(dem == 0) {
            System.out.println("khong ton tai nguoi co ten:" + tenNguoiCanXoa);
        }
    }
    
    public void sapXepTheoHoTen() {
        for (int i = 0; i < pr.size() - 1; i++) {
            for (int j = i + 1; j < pr.size(); j++) {
                if(pr.get(i).getHoTen().compareTo(pr.get(j).getHoTen()) > 0) {
                    Person tmp = pr.get(i);
                    pr.set(i, pr.get(j));
                    pr.set(j, tmp);
                }
            }
        }
    }
}

