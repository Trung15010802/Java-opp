package tuan3.buoi6.bai1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;


    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        return   chieuDai * chieuRong;

    }

    public double tinhChuVi() {
        return   (chieuDai + chieuRong) * 2;

    }

    public String toString() {
        return chieuDai + " " + chieuRong + " " + this.tinhDienTich() + " " + this.tinhChuVi();
    }
}
