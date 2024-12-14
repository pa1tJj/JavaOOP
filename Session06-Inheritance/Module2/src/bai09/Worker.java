/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai09;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Worker {
    String hoTen;
    int soSanPham;
    
    public Worker(){}
    public Worker(String hoTen, int soSanPham) {
        this.hoTen = hoTen;
        this.soSanPham = soSanPham;
    }
    
    public void nhap(Worker a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = new Worker();
            System.out.println("nhap thong tin cong nhan thu:" + (i+1));
            System.out.println("nhap ho ten:");
            a[i].hoTen = sc.nextLine();
            sc.nextLine();
            System.out.println("nhap so san pham:");
            a[i].soSanPham = sc.nextInt();
        }
    }
    
    public void in(Worker a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("ho ten:" + a[i].hoTen);
            System.out.println("so san pham:" + a[i].soSanPham);
        }
    }
    
    public void sapXepTheoSoSanPham(Worker a[], int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i].soSanPham > a[j].soSanPham) {
                    Worker tmp;
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Worker x = new Worker();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong:");
        n = Integer.parseInt(sc.nextLine());
        Worker a[] = new Worker[n];
        x.nhap(a, n);
        x.sapXepTheoSoSanPham(a, n);
        x.in(a, n);
    }
}
