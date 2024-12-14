/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DinhDangThoiGian;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
/**
 *
 * @author Admin
 */
public class DinhDangTienTe {
    public static void main(String[] args) {
        Locale lc = new Locale("vi", "vn");
        Currency c = Currency.getInstance("VND");
        double x = 1005;
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
        nf.setCurrency(c);
        System.out.println("sau khi dinh dang:" + nf.format(x));
    }
}
