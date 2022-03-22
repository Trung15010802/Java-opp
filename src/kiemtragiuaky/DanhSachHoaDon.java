package kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
    private List<HoaDon> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private SimpleDateFormat spDate = new SimpleDateFormat("dd/MM/yyyy");
    private double tienTB = 0;

    void themHoaDon() throws ParseException {
        do {
            System.out.println();
            int key;
            HoaDon hoaDon;
            System.out.print("Nhập 1 để thêm hoá đơn theo giờ 2 để thêm hoá đơn theo ngày: ");
            key = sc.nextInt();
            if (key == 1) {
                hoaDon = new TheoGio();
                hoaDon.nhap();
                list.add(hoaDon);
            } else if (key == 2) {
                hoaDon = new TheoNgay();
                hoaDon.nhap();
                list.add(hoaDon);
            } else
                System.out.println("Lựa chọn sai vui lòng chọn lại!");
            sc.nextLine();
            System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }

    void XuatHoaDonGio() {
        for (HoaDon hoaDon : list) {
            if (hoaDon instanceof TheoGio) {
                System.out.println(hoaDon.toString());
                System.out.println("Thành tiền: " + hoaDon.tinhTien(hoaDon));
            }

        }
    }

    void xuatHoaDonNgay() {
        for (HoaDon hoaDon : list) {
            if (hoaDon instanceof TheoNgay) {
                System.out.println(hoaDon.toString());
                System.out.println("Thành tiền: " + hoaDon.tinhTien(hoaDon));
            }
        }

    }

    void tongSoLuong() {
        int dem, dem2;
        dem = 0;
        dem2 = 0;
        for (HoaDon hoaDon : list) {
            if (hoaDon instanceof TheoGio)
                dem++;
            else
                dem2++;
        }
        System.out.println("Số lượng hoá đơn theo giờ: " + dem);
        System.out.println("Số lượng hoá đơn theo ngày: " + dem2);
    }

    void tinhTienTBT92013() throws ParseException {
        for (HoaDon hoaDon : list) {
            int dem = 0;
            if (hoaDon.getNgay().before(spDate.parse("1/10/2013"))
                    && hoaDon.getNgay().after(spDate.parse("31/8/2013"))) {
                tienTB += hoaDon.tinhTien(hoaDon);
                dem++;
            }
            tienTB = tienTB/dem;
            System.out.println("Tiền trung bình tháng 9/2013: "+tienTB);
        }
    }

}
