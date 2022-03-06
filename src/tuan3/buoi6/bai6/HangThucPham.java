package tuan3.buoi6.bai6;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private int maHang;
    private String tenHang;
    private double donGia;
    private String  inputDate2;
    private Date ngaySanXuat;
    private Date ngayHetHan;
    SimpleDateFormat spDate = new SimpleDateFormat("dd/MM/yyyy");

    public HangThucPham(int mahang) {
        this.maHang = mahang;
    }

    public HangThucPham(int mahang, String tenHang, double donGia, String inputDate1, String inputDate2)
            throws ParseException {
        this.maHang = mahang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        ngayHetHan = spDate.parse(inputDate2);
        ngaySanXuat = spDate.parse(inputDate1);
    }

    public int getMahang() {
        return maHang;
    }

    public void setMahang(int mahang) {
        this.maHang = mahang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getNumberInstance();
        String str = currencyFormat.format(donGia);
        String str1 = spDate.format(ngaySanXuat);
        String str2 = spDate.format(ngayHetHan);
        return "Thông tin về thực phẩm: \n" +
                "Mã hàng : " + maHang +
                "\nTên hàng : '" + tenHang +
                "\nĐơn giá : " + str +
                "\nNgày sản xuất : " + str1 +
                "\nHạn sử dụng : " + str2;
    }

    void hsd() {
        Date today = new Date();
        String strToDay = spDate.format(today);
         inputDate2 = spDate.format(ngayHetHan);
        if (inputDate2.compareTo(strToDay) > 0)
            System.out.println("Còn hạn sử dụng!");
        else
            System.out.println("Hết hạn sử dụng!");
    }

}