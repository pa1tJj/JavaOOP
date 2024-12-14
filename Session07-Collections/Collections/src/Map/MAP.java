/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Map;

import java.util.*;

/**
 *
 * @author Admin
 */
public class MAP {
    public static void main(String[] args) {
        playWithHashMap();
    }
    
    public static void playWithMap() {
        Map m1 = new HashMap();
        m1.put("haara", 22);//put(key, value) chèn một cặp <key, value>
        m1.put("jj", 21);
        m1.put("david", 44);
        System.out.print("in ra phan tu cua map:");
        System.out.print(" " + m1);
        System.out.print("\nin ra jj:" + m1.get("jj"));// in ra value cua key-jj
    }
    
    public static void playWithHashMap() {
        HashMap hm = new HashMap();
        hm.put("dd", 74563.8);
        hm.put("hh", 9465.1);
        hm.put("jj", 8888.14);
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ":");
            System.out.print(me.getValue());
        }
        
        //them 1000 vao jj
        double balan = ((Double)hm.get("jj")).doubleValue();
        hm.put("jj", balan + 1000);
        System.out.println("\ngia tri hien tai cua jj la:" + hm.get("jj"));
    }
}
