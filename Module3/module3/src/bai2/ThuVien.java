/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author PHAN ANH TUAN
 */
public class ThuVien {
    public static void main(String[] args) {
        SachThamKhao stk1 = new SachThamKhao(5, "hfewrf", "22/12/2020", 111, "rwr", 6265);
        SachThamKhao stk2 = new SachThamKhao(7, "hfewrf435", "27/12/2020", 151, "rw75r", 1265);
        SachThamKhao stk3 = new SachThamKhao(8, "hfewrhdngf", "2/12/2020", 171, "rwhdr", 7265);
        
        SachGiaoKhoa sgk1 = new SachGiaoKhoa("cu", "fhg", "15/4/2022", 5, "owf", 6535);
        SachGiaoKhoa sgk2 = new SachGiaoKhoa("cu", "fhg", "15/8/2022", 6, "o2wf", 735);
        SachGiaoKhoa sgk3 = new SachGiaoKhoa("moi", "agffhg", "13/4/2022", 5, "owfdg", 16535);
        
        double tongTienSTK = (double) (stk1.thanhTien() + stk2.thanhTien() + stk3.thanhTien());
        System.out.println("tong tien sach tham khao:" + tongTienSTK);
        
        double tongTienSGK = (double) (sgk1.thanhTien() + sgk2.thanhTien() + sgk3.thanhTien());
        System.out.println("tong tien sach giao khoa:" + tongTienSGK);
        
        double tbc = (double) ((stk1.getDonGia() + stk2.getDonGia() + stk3.getDonGia())/3);
        System.out.println("trung binh cong don gia sach tham khao:" + tbc);
        String timKiemTenNXB = "owf";
        SachGiaoKhoa sgk[] = {sgk1, sgk2, sgk3};
        for (int i = 0; i <  sgk.length; i++) {
            if(sgk[i].getNhaXuatBan().equalsIgnoreCase(timKiemTenNXB)) {
                sgk[i].in();
            }
        }
    }
}

