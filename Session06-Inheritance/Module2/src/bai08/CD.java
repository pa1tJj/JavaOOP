/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai08;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CD {

    private String maCD, tuaCD;
    private int soBaiHat;
    double gia;

    public CD(String maCD, String tuaCD, int soBaiHat, double gia) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBaiHat = soBaiHat;
        this.gia = gia;
    }

    public CD() {
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void nhap1ThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma cd:");
        maCD = sc.nextLine();
        System.out.println("nhap tua CD:");
        tuaCD = sc.nextLine();
        System.out.println("nhap so bai hat:");
        soBaiHat = sc.nextInt();
        System.out.println("nhap gia thanh:");
        gia = sc.nextDouble();
    }

    public void nhap(CD c[], int n) {
        for (int i = 0; i < n; i++) {
            c[i] = new CD();
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap thong tin dia CD thu:" + (i + 1));
            System.out.println("nhap ma cd:");
            c[i].maCD = sc.nextLine();
            System.out.println("nhap tua CD:");
            c[i].tuaCD = sc.nextLine();
            System.out.println("nhap so bai hat:");
            c[i].soBaiHat = sc.nextInt();
            System.out.println("nhap gia thanh:");
            c[i].gia = sc.nextDouble();
        }
    }

    public void in(CD c[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("ma cd:" + c[i].maCD);
            System.out.println("tua cd:" + c[i].tuaCD);
            System.out.println("so bai hat:" + c[i].soBaiHat);
            System.out.println("gia thanh:" + c[i].gia);
        }
    }

    public void them(CD c[], int n, int viTriThem, CD x) {
        CD cmp[] = new CD[c.length + 1];
        for (int i = 0; i < c.length; i++) {
            cmp[i] = c[i];
        }
        c[viTriThem] = x;
    }

    public double tinhTongGiaThanh(CD c[], int n) {
        double s = 0;
        for (int i = 0; i < 10; i++) {
            s += c[i].gia;
        }
        return s;
    }

    public void sapXepGiamDanTheoGiaThanh(CD c[], int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (c[j].gia > c[min].gia) {
                    min = j;
                }
                CD tmp;
                tmp = c[min];
                c[min] = c[j];
                c[j] = tmp;
            }
        }
    }

    public void sapXepTangDanTheoTuaCD(CD c[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i].tuaCD.compareTo(c[j].tuaCD) > 0) {
                    CD tmp;
                    tmp = c[i];
                    c[i] = c[j];
                    c[j] = tmp;
                }
            }
        }
    }
    
}
