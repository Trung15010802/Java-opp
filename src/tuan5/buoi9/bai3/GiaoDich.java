package tuan5.buoi9.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private String ma;
    private Date ngayGiaoDich;
    private double donGia;
    private int soLuong;
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat spDate = new SimpleDateFormat("dd/MM/yyyy");

    public GiaoDich() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    void nhap() throws ParseException {
        System.out.print("Nhập mã giao dịch: ");
        ma = sc.nextLine();
        System.out.print("Nhập ngày giao dịch: ");
        ngayGiaoDich = spDate.parse(sc.nextLine());
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập số lương: ");
        sc.nextInt();
    }

    @Override
    public String toString() {
        return "Mã: " + ma + "|| Ngày giao dịch" + spDate.format(ngayGiaoDich) + "|| Đơn giá: " + donGia + "|| Số lượng: " + soLuong;
    }

}
