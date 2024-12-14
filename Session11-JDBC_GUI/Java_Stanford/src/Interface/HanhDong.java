/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import java.util.List;

/**
 *
 * @author PHAN ANH TUAN
 */
public interface HanhDong<T, idT> {

    List<T> layDanhSach();

    T layChiTietTheoMa(idT id);

    boolean themMoi(T obj);

    boolean capNhat(T obj);

    boolean xoa(idT obj);
    
    List<T> timKiem(idT obj);
}
