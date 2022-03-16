package tuan5.buoi9.bai2;

import java.text.ParseException;

public class SGK extends Sach {
    private int tinhTrang;

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    void nhapSach() throws ParseException {
        super.nhapSach();
        System.out.print("Nhập tình trạng sách(mới=0/cũ=1): ");
        tinhTrang = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ", Tình trạng: " + tinhTrang;
    }
}
