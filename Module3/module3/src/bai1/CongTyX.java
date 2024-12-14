/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author PHAN ANH TUAN
 */
public class CongTyX {
      public static void main(String[] args) {
        NoiThanh noi = new NoiThanh(12, 4566.0, "ihgew", "gireh", 222, 542345.0);
        NoiThanh noi2 = new NoiThanh(13, 555524, "ughfer", "frreg", 333, 734563);
        NgoaiThanh ngoai = new NgoaiThanh(22, "ajgfh", "cgfwef", "uhfe", 211, 43753);
        NgoaiThanh ngoai2 = new NgoaiThanh(313, "urweh", "fiw", "egrg", 212, 926945);
        
        double s;
        s = (double) (noi.getDoanhThu() + noi2.getDoanhThu());
        System.out.println("tong doanh thu xe noi thanh:" + s);
        double sum = (double) (ngoai.getDoanhThu() + ngoai2.getDoanhThu());
        System.out.println("tong doanh thu ngoai thanh:" + sum);
        System.out.println("tong doanh thu:" + (sum + s));
    }
}
