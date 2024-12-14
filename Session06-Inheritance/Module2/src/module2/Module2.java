/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module2;

import bai06.Account;
import java.util.Scanner;
import bai08.CD;

/**
 *
 * @author Admin
 */
public class Module2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong:");
        n = Integer.parseInt(sc.nextLine());
        CD x = new CD();
        CD c[] = new CD[n];
        x.nhap(c, n);
        x.in(c, n);
        int viTriThem;
        System.out.println("nhap vi tri can them:");
        viTriThem = sc.nextInt();
        CD cmp = new CD();
        cmp.nhap1ThongTin();
        x.them(c, n, viTriThem, cmp);
        System.out.println("sau khi them");
        x.in(c, n);
        x.sapXepGiamDanTheoGiaThanh(c, n);
        System.out.println("SAP XEP GIAM DAN THEO GIA THANH");
        x.in(c, n);
        x.sapXepTangDanTheoTuaCD(c, n);
        System.out.println("SAP XEP TANG DAN THEO TUA CD");
        x.in(c, n);
    }
}
