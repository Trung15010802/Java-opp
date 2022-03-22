package kiemtragiuaky;

import java.text.ParseException;

public class TheoGio extends HoaDon {
    private double gioThue;

    public TheoGio(double gioThue) {
        this.gioThue = gioThue;
    }

    public TheoGio() {
    }

    public double getGioThue() {
        return gioThue;
    }

    public void setGioThue(double gioThue) {
        this.gioThue = gioThue;
    }

    @Override
    void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhập số giờ thuê: ");
        gioThue = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Số giờ thuê: " + gioThue;
    }

    @Override
    public double tinhTien(HoaDon theoGio) {
        double thanhTienTheoGio = 0;
        if (((TheoGio) theoGio).getGioThue() > 30)
            return -1;
        else if (((TheoGio) theoGio).getGioThue() > 24 && ((TheoGio) theoGio).getGioThue() < 30)
            thanhTienTheoGio = theoGio.getDonGia() * 24;
        else
            thanhTienTheoGio = theoGio.getDonGia() * ((TheoGio) theoGio).getGioThue();
        return thanhTienTheoGio;
    }

}
