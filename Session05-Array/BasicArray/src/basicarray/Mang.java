/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarray;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mang {

    public static int timKiemNhiPhan(int a[] , int n, int x) {
        int i = 0, j = 0;
        int l = 0, r = n - 1;
        while(i < n && j < n) {
            int m = (l+r)/2;
            if(x == a[m]){
                return m;
            }else if(x > a[m]) {
                l = m + 1;
            }else {
                r = m - 1;
            }
        }
        return 0;
    }
    
    public static void xoa(int a[], int n, int viTriXoa) {
        for (int i = 0; i < n; i++) {
            if(i == viTriXoa) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                --n;
            }
        }
    }
    
    public static void tachMang(int a[], int m){
        int b[] = new int[m];
        int c[] = new int[m];
        int ib = 0, ic = 0;
        for(int i = 0; i < m; i++) {
            if(a[i] % 2 == 0) {
                b[ib] = a[i];
                ib++;
            }else{
                c[ic] = a[i];
                ++ic;
            }
        }
        System.out.print("gia tri mang so chan:");
        for (int i = 0; i < ib; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\ngia tri mang so le:");
        for (int i = 0; i < ic; i++) {
            System.out.print(c[i] + " ");
        }
    }
    
    public static void nhapPhanTuKhongTrung(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("nhap gia tri:");
            a[i] = sc.nextInt();
            boolean kt = true;
            for(int j = 0; j < i; j++) {
                if(a[i] == a[j]) {
                    System.out.println("nhap lai");
                    kt = false;
                    break;
                }
            }
            
            if(kt == false){
                continue;
            }else{
                ++i;
            }
        }while(i < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap n:");
        n = sc.nextInt();
        int a[] = new int[n];
        nhapPhanTuKhongTrung(a, n);
        for(int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
    }
    
}
