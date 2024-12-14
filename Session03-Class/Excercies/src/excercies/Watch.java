/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excercies;

import java.util.Scanner;

public class Watch {
    private String hangSanXuat;
    private String loai;
    private String chatLieu;
    private int duongKinh;
    private int baoHanh;
    public void nhap() {
        Scanner nhapBP = new Scanner(System.in);
        System.out.print("nhap ten hang san xuat:");
        hangSanXuat = nhapBP.nextLine();
        System.out.print("nhap loai dong ho:");
        loai = nhapBP.nextLine();
        System.out.print("nhap chat lieu:");
        chatLieu =nhapBP.nextLine();
        System.out.print("nhap duong kinh:");
        duongKinh = nhapBP.nextInt();
        System.out.print("nhap bao hanh:");;
        baoHanh = nhapBP.nextInt();
    }
    public void in() {
        System.out.println("Hang san xuat:" + hangSanXuat);
        System.out.println("Loai dong ho:" + loai);
        System.out.println("Chat lieu:" + chatLieu);
        System.out.println("Duong kinh:" + duongKinh);
        System.out.println("Thoi gain bao hanh:" + baoHanh);
    }
}
