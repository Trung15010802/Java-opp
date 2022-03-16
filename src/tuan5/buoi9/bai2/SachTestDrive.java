package tuan5.buoi9.bai2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) throws ParseException {
        List<SGK> listSGK = new ArrayList<>();
        List<SachThamKhao> listSTK = new ArrayList<>();
        double thanhTienSGK = 0;
        double thanhTienSTK = 0;
        double tongDonGiaSTK = 0;
        double TBdongiaSTK = 0;
        Scanner sc = new Scanner(System.in);
        // Nhập SGK
        do {
            SGK sgk = new SGK();
            sgk.nhapSach();
            listSGK.add(sgk);
            System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));

        // Nhập sách tham khảo
        do {
            SachThamKhao stk = new SachThamKhao();
            stk.nhapSach();
            listSTK.add(stk);
            System.out.print("Bạn có muốn tiếp tục nhập(y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
        // Tính thành tiền SGK
        for (SGK sgk : listSGK) {
            if (sgk.getTinhTrang() == 0) {
                thanhTienSGK += sgk.getSoLuong() * sgk.getDonGia();
            } else
                thanhTienSGK += sgk.getDonGia() * sgk.getSoLuong() * 0.5;
        }
        // Tính thành tiền sách tham khảo
        for (SachThamKhao stk : listSTK) {
            thanhTienSTK += stk.getDonGia() * stk.getSoLuong() + stk.getThue();
        }

        // Trung bình đơn giá sách tham khảo
        for (SachThamKhao stk : listSTK) {
            tongDonGiaSTK += stk.getDonGia();
        }
        TBdongiaSTK = tongDonGiaSTK / listSGK.size();

        //In danh sách SGK
        for (SGK sgk : listSGK) {
            System.out.println(sgk.toString());
        }
        System.out.println("Thành tiền SGK: "+thanhTienSGK);
        //In danh sách STK
        for (SachThamKhao stk : listSTK) {
            System.out.println(stk.toString());
        }
        System.out.println("Thành tiền STK: "+thanhTienSTK);
        System.out.println("Trung bình đơn giá STK: "+TBdongiaSTK);
        sc.close();
    }
}
