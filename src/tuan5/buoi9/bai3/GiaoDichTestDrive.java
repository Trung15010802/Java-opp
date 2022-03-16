package tuan5.buoi9.bai3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) throws ParseException {
        List<Vang> listVang = new ArrayList<>();
        List<TienTe> listTienTe = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double thanhTienVang = 0;
        double thanhTienTienTe = 0;
        // Nhập giao dịch vàng
        do {
            Vang vang = new Vang();
            vang.nhap();
            listVang.add(vang);
            System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
        // Nhập giao dịch tiền tệ
        do {
            TienTe tienTe = new TienTe();
            tienTe.nhap();
            listTienTe.add(tienTe);
            System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
        // In danh sách vàng
        for (Vang vang : listVang) {
            System.out.println(vang.toString());
            thanhTienVang = vang.getSoLuong() * vang.getDonGia();
            System.out.println("Thành tiền: " + thanhTienVang);
        }

        // In danh sách giao dịch tiền tệ:
        for (TienTe tienTe : listTienTe) {
            System.out.println(tienTe.toString());
            thanhTienTienTe = tienTe.getSoLuong() * tienTe.getSoLuong();
            System.out.println("Thành tiền: " + thanhTienTienTe);
        }
        sc.close();
    }
}
