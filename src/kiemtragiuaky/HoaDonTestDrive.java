package kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) throws ParseException {
        boolean flag = true;
        int key;
        List<TheoGio> listGio = new ArrayList<>();
        List<TheoNgay> listNgay = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double thanhTienTheoGio = 0;
        double thanhTienTheoNgay = 0;
        double thanhTienTrungBinh = 0;
        double thanhTienTrungBinhNgay = 0;
        double thanhTienTrungBinhGio = 0;
        SimpleDateFormat spDate = new SimpleDateFormat("dd/MM/yyyy");
        do {
            System.out.println("==============MENU==============");
            System.out.println(">>1. Nhập hóa đơn theo giờ.");
            System.out.println(">>2. Xuất hóa đơn theo giờ.");
            System.out.println(">>3. Nhập hóa đơn theo ngày.");
            System.out.println(">>4. Xuất hóa đơn theo ngày.");
            System.out.println(">>5. Tổng số lượng thuê phòng theo giờ.");
            System.out.println(">>6. Tổng số lượng thuê phòng theo ngày.");
            System.out.println(">>7. Trung bình thành tiền hóa đơn theo tháng 9/2013.");
            System.out.println(">>0. Thoát!");
            System.out.print("Mời bạn nhập lựa chọn: ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    do {
                        TheoGio theoGio = new TheoGio();
                        theoGio.nhap();
                        listGio.add(theoGio);
                        sc.nextLine();
                        System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
                    } while (sc.nextLine().equalsIgnoreCase("y"));
                    break;
                case 2:
                    for (TheoGio theoGio : listGio) {
                        System.out.println();
                        System.out.println(theoGio.toString());
                        if (theoGio.getGioThue() > 30)
                            System.out.println("Vui lòng dùng hóa đơn theo ngày!");
                        else if (theoGio.getGioThue() > 24 && theoGio.getGioThue() < 30)
                            thanhTienTheoGio = theoGio.getDonGia() * 24;
                        else
                            thanhTienTheoGio = theoGio.getDonGia() * theoGio.getGioThue();
                        System.out.println(" Thành tiền: " + thanhTienTheoGio);
                    }
                    break;
                case 3:
                    do {
                        TheoNgay theoNgay = new TheoNgay();
                        theoNgay.nhap();
                        listNgay.add(theoNgay);
                        sc.nextLine();
                        System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
                    } while (sc.nextLine().equalsIgnoreCase("y"));
                    break;
                case 4:
                    for (TheoNgay theoNgay : listNgay) {
                        System.out.println();
                        System.out.println(theoNgay.toString());
                        if (theoNgay.getSoNgay() > 7)
                            thanhTienTheoNgay = theoNgay.getSoNgay() * theoNgay.getDonGia() * 0.8;
                        else
                            thanhTienTheoNgay = theoNgay.getSoNgay() * theoNgay.getDonGia();
                        System.out.println(" Thành tiền: " + thanhTienTheoNgay);
                    }
                    break;
                case 5:
                    System.out.println("Tổng số hóa đơn thuê theo giờ là: " + listGio.size());
                    break;
                case 6:
                    System.out.println("Tổng số hóa đơn theo giờ: " + listNgay.size());
                    break;
                case 7:
                    Date ngayTruoc = spDate.parse("30/9/2013");
                    Date ngaySau = spDate.parse("31/9/2013");
                    for (TheoNgay theoNgay : listNgay) {
                        if (theoNgay.getNgay().after(ngayTruoc) && theoNgay.getNgay().before(ngaySau))
                            thanhTienTrungBinhNgay += thanhTienTheoNgay;
                    }
                    for (TheoGio theoGio : listGio) {
                        if (theoGio.getNgay().after(ngayTruoc) && theoGio.getNgay().before(ngaySau))
                            thanhTienTrungBinhGio += thanhTienTheoNgay;
                    }
                    thanhTienTrungBinh = thanhTienTrungBinhGio+thanhTienTrungBinhNgay;
                    System.out.println("Thành tiền trung bình là: "+thanhTienTrungBinh);
                    break;
                default:
                    break;
            }
        } while (flag);
        sc.close();

    }
}
