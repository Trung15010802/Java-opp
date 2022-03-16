package tuan5.buoi9.bai3;

import java.text.ParseException;

public class TienTe extends GiaoDich {
    private double tiGia;

    public TienTe() {
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    @Override
    void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhập tỉ giá: ");
        tiGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "|| Tỉ giá: " + tiGia;

    }
}
