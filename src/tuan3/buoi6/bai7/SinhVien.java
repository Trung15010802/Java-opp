package tuan3.buoi6.bai7;

import java.util.Scanner;

public class SinhVien {
    private int MSSV;
    private String hoTen;
    private String diaChi;
    private int sdt;
    Scanner sc = new Scanner(System.in);
    public SinhVien() {
    }

    public SinhVien(int mSSV, String hoTen, String diaChi, int sdt) {
        MSSV = mSSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int mSSV) {
        MSSV = mSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String toString(){
        String s = String.format("%-20d%-20s%-20s%-20d", MSSV, hoTen, diaChi, sdt);
        return s;
    }
    void nhap(){
        System.out.print("Nhập MSSV: ");
        MSSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        sdt = sc.nextInt();
    }

    
}
