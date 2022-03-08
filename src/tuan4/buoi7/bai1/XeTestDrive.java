package tuan4.buoi7.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        ArrayList<NoiThanh> xeNoiThanh = new ArrayList<NoiThanh>();
        ArrayList<NgoaiThanh> xeNgoaiThanh = new ArrayList<NgoaiThanh>();
        double doanhThuXeNoiThanh = 0;
        double doanhThuXeNgoaiThanh = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập xe nội thành: ");
        do {
            NoiThanh noiThanh = new NoiThanh();
            noiThanh.nhap();
            xeNoiThanh.add(noiThanh);
            System.out.print("Bạn có muốn tiếp tục nhập: ");
        } while (sc.nextLine().equalsIgnoreCase("Y"));

        System.out.println("Nhập xe ngoại thành: ");
        do {
            NgoaiThanh ngoaiThanh = new NgoaiThanh();
            ngoaiThanh.nhap();
            xeNgoaiThanh.add(ngoaiThanh);
            System.out.print("Bạn có muốn tiếp tục nhập: ");
        } while (sc.nextLine().equalsIgnoreCase("Y"));
        // Tính tổng doanh thu xe nội thành
        for (NoiThanh xNoiThanh : xeNoiThanh) {
            doanhThuXeNoiThanh += xNoiThanh.getDoanhThu();
        }
        // Tổng doanh thu xe ngoại thành
        for (NgoaiThanh xNgoaiThanh : xeNgoaiThanh) {
            doanhThuXeNgoaiThanh += xNgoaiThanh.getDoanhThu();
        }
        // In thông tin xe ngoại thành
        for (NgoaiThanh xNgoaiThanh : xeNgoaiThanh) {
            System.out.println(xNgoaiThanh.toString());
        }
        // In thông tin xe nội thành
        for (NoiThanh xNoiThanh : xeNoiThanh) {
            System.out.println(xNoiThanh.toString());
        }

        System.out.println("Tổng doanh thu xe nội thành: " + doanhThuXeNoiThanh);
        System.out.println("Tổng doanh thu xe ngoại thành: " + doanhThuXeNgoaiThanh);
        sc.close();
    }
}
