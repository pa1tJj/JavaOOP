/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author PHAN ANH TUAN
 */
public class ProjectLeader extends Programmer{

    public ProjectLeader() {
    }
    
    @Override
    public void nhap() {
        super.nhap();
    }
    
    @Override
    public void in() {
        super.in();
    }
    
    @Override
    public double luongHangThang() {
         return super.luongHangThang() + 0.2 * super.luongHangThang();
    }
}

