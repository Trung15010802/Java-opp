package tuan3.buoi6.bai4;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long stk;
    private String tenTK;
    private double soDu;
    final double laiSuat = 0.035;
    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(long stk, String tenTK, double soDu) {
        this.stk = stk;
        this.tenTK = tenTK;
        this.soDu = soDu;
    }

    public Account(long stk, String tenTK) {
        this.stk = stk;
        this.tenTK = tenTK;
        this.soDu = 50;
    }

    public long getStk() {
        return stk;
    }

    public void setStk(long stk) {
        this.stk = stk;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getNumberInstance();
        String str = currencyFormat.format(soDu);
        String s = String.format("%-20s%-20s%-20s", stk, tenTK, str);
        return s;
    }

    double napTien(double tienNap) {
        return soDu += tienNap;
    }

    double rutTien(double tienRut) {
        return soDu -= tienRut + 3000;
    }

    double daoHan() {
        return soDu = soDu + soDu * laiSuat;
    }

    void chuyenTien(long SoTk, double soTien, double phi) {
        soDu -= soTien + phi;
        System.out.println("Chuyển khoản thành công!");
    }

    void nhap() {
        System.out.print("Nhập số tài khoản: ");
        stk = sc.nextLong();
        sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        tenTK = sc.nextLine();
        System.out.print("Nhập số dư: ");
        soDu = sc.nextDouble();
    }

}
