package tuan4.buoi7.bai1;

import java.util.Scanner;

public class Xe {
    private int ma;
    private String tenTaiXe;
    private int soXe;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    void nhap() {
        System.out.print("Nhập mã số chuyến: ");
        ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập họ tên tài xe: ");
        tenTaiXe = sc.nextLine();
        System.out.print("Nhập số xe: ");
        soXe = sc.nextInt();
        System.out.print("Nhập doanh thu: ");
        doanhThu = sc.nextDouble();
    }

    void xuat(){
        System.out.println("Mã số chuyến: "+ ma);
        System.out.println("Tên tài xế: "+tenTaiXe);
        System.out.println("Số xe: "+soXe);
        System.out.println("Doanh thu: "+doanhThu);
    }

    public String toString(){
        return ma + " " + tenTaiXe +" "+ soXe +" "+ doanhThu;
    }

}