package tuan3.buoi6.bai6;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    SimpleDateFormat spDate = new SimpleDateFormat("dd/MM/yyyy");

    public HangThucPham(String maHang) {
        setMahang(maHang);
    }

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, double donGia, String inputDate1, String inputDate2)
            throws ParseException {
        this.setMahang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        ngayHetHan = spDate.parse(inputDate2);
        ngaySanXuat = spDate.parse(inputDate1);
    }

    public String getMahang() {
        return maHang;
    }

    private void setMahang(String maHang) {
        if (maHang != null) {
            this.maHang = maHang;
        } else
            System.out.println("Mã hàng không được rỗng!");
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null) {
            this.tenHang = tenHang;
        } else
            System.out.println("Tên hàng không được để rỗng!");
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else
            System.out.println("Đơn giá phải lớn hơn 0");
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if (ngaySanXuat != null) {
            this.ngaySanXuat = ngaySanXuat;
        } else
            System.out.println("Ngày sản xuất không được để rỗng!");
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan.after(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else
            System.out.println("Ngày hết hạn phải sau ngày sản xuất!");
    }

    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getNumberInstance();
        String str = currencyFormat.format(donGia);
        return "Thông tin về thực phẩm: \n" +
                "Mã hàng : " + maHang +
                "\nTên hàng : " + tenHang +
                "\nĐơn giá : " + str +
                "\nNgày sản xuất : " + spDate.format(ngaySanXuat) +
                "\nHạn sử dụng : " + spDate.format(ngayHetHan);
    }

    boolean hsd() {
        Date today = new Date();
        if (ngayHetHan.before(today))
            return true;
        return false;
    }

}