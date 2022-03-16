package tuan5.buoi9.bai3;

import java.text.ParseException;

public class Vang extends GiaoDich {
    private String loai;

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    void nhap() throws ParseException {
        super.nhap();
        sc.nextLine();
        System.out.print("Nhập loại vàng: ");
        loai = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "|| Loại: " + loai;
    }
}
