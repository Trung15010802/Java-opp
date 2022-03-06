package tuan3.buoi6.bai8;

import java.util.Scanner;

public class CD {
    private int ma;
    private String tuaDe;
    private String caSi;
    private int soBaiHat;
    private double giaThanh;

    Scanner sc = new Scanner(System.in);

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTuaDe() {
        return tuaDe;
    }

    public void setTuaDe(String tuaDe) {
        this.tuaDe = tuaDe;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    public CD(int ma, String tuaDe, String caSi, int soBaiHat, double giaThanh) {
        this.ma = ma;
        this.tuaDe = tuaDe;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public String toString() {
        String s = String.format("%-20s%-20s%-20s%-20s%-20s", "Mã", "Tựa đề", "Ca sĩ", "Số bài hát", "Giá thành");
        return s;
    }

    void nhap(){
        System.out.print("Nhập Mã");
        ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tựa đề: ");
        tuaDe = sc.nextLine();
        System.out.print("Nhập tên ca sĩ: ");
        caSi = sc.nextLine();
        System.out.print("Nhập số lượng bài hát: ");
        sc.nextInt();
        System.out.print("Nhập giá thành: ");
        sc.nextInt();
    }
}
