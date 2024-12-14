/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jav;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class jav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 3;
        int a[] = {1, 2, 3, 4, 5};
        int aNew[] = new int[a.length + 1];
        int vt = 2;
        int k = 100;
        for (int i = 0; i < a.length; i++) {
            aNew[i] = a[i];
        }
        aNew[vt] = k;
        System.out.println("mang ban dau:" + Arrays.toString(a));
        System.out.println("mang sua khi them:" + Arrays.toString(aNew));
    }

}
