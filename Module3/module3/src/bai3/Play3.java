/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author PHAN ANH TUAN
 */
public class Play3 {
     public static void main(String[] args) {
        TienTe t = new TienTe("USD", 0.5, "rehjg", "22/12/2020", 7457, 10);
        TienTe t2 = new TienTe("USD", 0.25, "rehdgjg", "22/12/2020", 7454, 6);
        TienTe t3 = new TienTe("USD", 0.45, "rehdfgjg", "22/12/2020", 3254, 8);
        Vang v = new Vang("9999", "eorjg", "12/3/2024", 4586, 12);
        Vang v2 = new Vang("1111", "emhgorjg", "2/3/2024", 41586, 2);
        Vang v3 = new Vang("9999r", "ekhkorjg", "12/372024", 496456088, 4);

        TienTe tong1[] = {t, t2, t3};
        System.out.println("tong so luong gtien:" + tong1.length);
        Vang tongVang[] = {v, v2, v3};
        System.out.println("tong so luong vang:" + tongVang.length);

        System.out.println("trung bih thanh tien cua TienTe:" + ((t.thanhTien() + t2.thanhTien() + t3.thanhTien()) / tong1.length));
        
        for (int i = 0; i < tong1.length; i++) {
            if(tong1[i].getDonGia() > 1000000000) {
                tong1[i].in();
            }
        }
        for (int i = 0; i < tongVang.length; i++) {
            if(tongVang[i].getDonGia() > 1000000000) {
                tongVang[i].in();
            }
        }
    }
}
