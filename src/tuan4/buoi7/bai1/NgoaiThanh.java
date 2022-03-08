package tuan4.buoi7.bai1;

public class NgoaiThanh extends Xe {
    private int soTuyen;
    private int soKm;

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    @Override
    void nhap() {
        super.nhap();
        System.out.print("Nhập số tuyến: ");
        soTuyen = sc.nextInt();
        System.out.print("Nhập số km: ");
        soKm = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+" "+soTuyen +" "+ soKm;
    }
}
