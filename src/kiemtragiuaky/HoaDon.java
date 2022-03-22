package kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class HoaDon {
    private String maHoaDon;
    private Date ngay;
    private String tenKhachHang;
    private String maPhong;
    private double donGia;
    SimpleDateFormat spDate = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, Date ngay, String tenKhachHang, String maPhong, double donGia) {
        this.maHoaDon = maHoaDon;
        this.ngay = ngay;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public abstract double tinhTien(HoaDon hoaDon);

    void nhap() throws ParseException{
        System.out.print("Nhập mã hóa đơn: ");
        maHoaDon = sc.nextLine();
        System.out.print("Nhập ngày hóa đơn: ");
        ngay = spDate.parse(sc.nextLine());
        System.out.print("Nhập tên khách hàng: ");
        tenKhachHang = sc.nextLine();
        System.out.print("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }

    @Override
    public String toString() {
        return " Mã hóa đơn: "+maHoaDon
        +"\n Ngày hóa đơn: "+spDate.format(ngay)
        +"\n Tên khách hàng: "+tenKhachHang
        +"\n Mã phòng: "+maPhong+
        "\n Đơn giá: "+donGia;
    }

    public double getSoNgay() {
        return 0;
    }
}
