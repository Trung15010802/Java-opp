package tuan3.buoi6.bai7;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv[] = null;
        int n;
        Scanner sc = new Scanner(System.in);
        //Nhập số sinh viên cần nhậP
        System.out.print("Nhập số sinh viên cần nhập dữ liệu: ");
        n = sc.nextInt();
        sv = new SinhVien[n];
        //Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            sv[i].nhap();
        }
        //Sắp xếp sinh viên theo MSSV tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(sv[i].getMSSV() > sv[j].getMSSV()){
                    SinhVien temp = sv[i];
                    sv[i]= sv[j];
                    sv[j] = temp;
                }
            }
        }
        //In danh sách sinh viên
        System.out.printf("%-20s%-20s%-20s%-20s\n", "MSSV", "Họ Tên", "Địa chỉ", "Số điện thoại");
        for (int i = 0; i < n; i++) {
            System.out.println(sv[i].toString());
        }
        sc.close();
    }
}
