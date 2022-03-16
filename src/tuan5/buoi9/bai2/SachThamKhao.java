package tuan5.buoi9.bai2;

import java.text.ParseException;

public class SachThamKhao extends Sach {
    private double thue;

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    void nhapSach() throws ParseException {
        super.nhapSach();
        System.out.print("Nhập thuế: ");
        sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ", Thuế: " + thue;
    }
}
