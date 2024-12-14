/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThueBaoInternet;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DanhSachThueBao {

    private ArrayList<ThueBao> tb = new ArrayList<>();

    public DanhSachThueBao() {
        super();
    }

    public void themThueBao(ThueBao thueBao) {
        tb.add(thueBao);
    }

    public void hienThiDanhSach() {
        for (ThueBao thueBao : tb) {
            System.out.println(thueBao.toString());
        }
    }

    public void tongTienCuocTungLoai() {
        double tienCuocDialUp = 0;
        double tienCuocADSL = 0;
        double tienCuocT1 = 0;
        for (ThueBao thueBao : tb) {
            if (thueBao instanceof DialUp d) {
                d = (DialUp) thueBao;
                tienCuocDialUp += d.tinhTien();
            } else if (thueBao instanceof ADSL a) {
                a = (ADSL) thueBao;
                tienCuocADSL += a.tinhTien();
            } else if (thueBao instanceof T1 t) {
                t = (T1) thueBao;
                tienCuocT1 += t.tinhTien();
            }
        }
        System.out.print("\ntong tien cuoc thue bao DialUp:" + tienCuocDialUp);
        System.out.print("\ntong tien cuoc thue bao ADSL:" + tienCuocADSL);
        System.out.print("\ntong tien cuoc thue bao T1:" + tienCuocT1);
    }
    
    public void tongTienCuocThueBao() {
        double tongCuoc = 0;
        for (ThueBao thueBao : tb) {
            tongCuoc += thueBao.tinhTien();
        }
    }
    
    public void thueBaoADSLCuocLonNhat() {
        long max = 0;
        long tmp;
        int viTri = 0;
        for (int i = 0; i < tb.size(); i++) {
            if(tb.get(i) instanceof ADSL) {
                tmp = tb.get(i).tinhTien();
                if(tmp > max) {
                    max = tmp;
                    viTri = i;
                }
            }
        }
        System.out.println(tb.get(viTri).toString());
    }
}
