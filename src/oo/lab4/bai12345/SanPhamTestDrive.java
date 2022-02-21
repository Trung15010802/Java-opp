package oo.lab4.bai12345;

import java.util.ArrayList;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        // SanPham sp1 = new SanPham();
        SanPham sp1 = new SanPham("Laptop", 20000000, 0);
        SanPham sp2 = new SanPham("Iphone 13", 25000000, 3000000);
        ArrayList<SanPham> list = new ArrayList<>();
        list.add(sp1);
        list.add(sp2);
        for (SanPham x : list) {
            x.xuat();
        }
    }
}
