package kiemtragiuaky;

import java.text.ParseException;

public class TheoNgay extends HoaDon {
    private double soNgay;

    public TheoNgay(double soNgay) {
        this.soNgay = soNgay;
    }

    public TheoNgay() {
    }

    public double getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(double soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhập số ngày thuê: ");
        soNgay = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n Số ngày thuê: " + soNgay;
    }

    @Override
    public double tinhTien(HoaDon theoNgay) {
        double thanhTienTheoNgay = 0;
        if (soNgay > 7)
            thanhTienTheoNgay = soNgay * theoNgay.getDonGia() * 0.8;
        else
            thanhTienTheoNgay = soNgay * theoNgay.getDonGia();
        return thanhTienTheoNgay;
    }
}
