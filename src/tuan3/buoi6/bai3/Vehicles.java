package tuan3.buoi6.bai3;

import java.util.Scanner;

public class Vehicles {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double giaTri;

    Scanner sc = new Scanner(System.in);

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    double thue(double giaTri) {
        if (dungTich > 200)
            return 0.05 * giaTri;
        else if (dungTich > 100)
            return 0.03 * giaTri;
        else
            return 0.01 * giaTri;
    }

    void nhap() {
        System.out.print("Nhập tên chủ xe: ");
        setTenChuXe(sc.nextLine());
        System.out.print("Nhập loại xe: ");
        setLoaiXe(sc.nextLine());
        System.out.print("Nhập dung tích: ");
        setDungTich(sc.nextInt());
        System.out.print("Nhập giá xe: ");
        setGiaTri(sc.nextDouble());
    }

    void inThongTin() {
        System.out.printf("%-20s %-20s %-20d %-20f %-20f \n", getTenChuXe(), getLoaiXe(), getDungTich(), getGiaTri(),
                thue(giaTri));
    }

}
