/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumberFormat.pckage;

import java.text.*;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class NumberFormat {
    public static void main(String[] args) {
        playWithNumberFormat();
    }
    
    public static void playWithNumberFormat() {
        Locale lc = new Locale("en", "EN");//Locale là đối tượng đại diện cho ngôn ngữ và quốc gia , khu vực khác nhau trên thế giới
        //en là ngôn ngữ, EN là quốc gia
        Locale locale = Locale.getDefault();// trả về locale là khu vực mặc định của hệ thống
        System.out.println("tra ve ngon ngu cua locale:" + locale.getDisplayLanguage());
        System.out.println("tra ve khu vuc cua he thong:" + locale.getDisplayCountry());
        System.out.println("tra ve ma ngon ngu cua he thong:" + locale.getLanguage());
        System.out.println("tra ve ma khu vuc cua he thong:" + locale.getCountry());
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));
    }
    
   
}
