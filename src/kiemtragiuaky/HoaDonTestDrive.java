package kiemtragiuaky;

import java.text.ParseException;

import java.util.Scanner;

public class HoaDonTestDrive {
    public static void main(String[] args) throws ParseException {
        boolean flag = true;
        int key;
        Scanner sc = new Scanner(System.in);
        DanhSachHoaDon dSachHoaDon = new DanhSachHoaDon();
        do {
            System.out.println("==============MENU==============");
            System.out.println(">>1. Nhập hóa đơn.");
            System.out.println(">>2. Xuất hóa đơn theo giờ.");
            System.out.println(">>3. Xuất hóa đơn theo ngày.");
            System.out.println(">>4. Tổng số lượng hoá đơn.");
            System.out.println(">>5. Trung bình thành tiền hóa đơn theo tháng 9/2013.");
            System.out.println(">>0. Thoát!");
            System.out.print("Mời bạn nhập lựa chọn: ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    dSachHoaDon.themHoaDon();
                    break;
                case 2:
                    dSachHoaDon.XuatHoaDonGio();
                    break;
                case 3:
                    dSachHoaDon.xuatHoaDonNgay();
                    break;
                case 4:
                    dSachHoaDon.tongSoLuong();
                    break;
                case 5:
                    dSachHoaDon.tinhTienTBT92013();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (flag);
        sc.close();

    }
}
