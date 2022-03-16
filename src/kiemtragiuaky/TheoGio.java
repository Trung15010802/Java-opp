package kiemtragiuaky;

import java.text.ParseException;

public class TheoGio extends HoaDon{
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
        return super.toString()+
        "\n Số giờ thuê: "+gioThue;
    }
}
