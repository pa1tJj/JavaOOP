/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thaotacvoitaptin;

import java.io.IOException;

/**
 *
 * @author PHAN ANH TUAN
 */
public class ReadByte {
    public static void main(String[] args) throws IOException{
        byte data[] = new byte[5];
        System.out.println("enter");
        System.in.read(data);
        System.out.println("is enter");
        for (int i = 0; i < data.length; i++) {
            System.out.println((char) data[i]);
        }
    }
}
