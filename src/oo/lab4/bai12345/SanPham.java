package oo.lab4.bai12345;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau(double donGia) {
        return 0.1 * donGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    Scanner sc = new Scanner(System.in);

    void nhap() {
        System.out.print("Nhập tên sản phẩm:");
        tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.printf("\nĐơn giá: %f", donGia);
        System.out.printf("\nGiảm giá: %f", giamGia);
        System.out.printf("\nThuế nhập khẩu: %f", getThueNhapKhau(donGia));
    }

}
