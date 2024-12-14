/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author PHAN ANH TUAN
 */
public class DocFileTXT {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
//        File f = new File("test.txt");
//        if(f.isFile()) {
//            System.out.println("chua file:" + f.getAbsolutePath());// getAbsolutePath() - lấy ra đường dẫn của file test.txt
//            f.delete();// hàm này để xóa một file
//        }else {
//            System.out.println("not file");   
//            f.createNewFile();// hàm tạo một file
//        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("test.txt");
            fos = new FileOutputStream("test_cmp.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
                fos.write(i);
            }
        } catch (IOException e) {
        }finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }
            
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                }
            }  
        }
        
    }
}
