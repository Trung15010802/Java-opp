package tuan3.buoi6.bai3;

import java.util.Scanner;

public class VehiclesTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicles xe[] = null;
        int n = 0;
        int key;
        boolean flag = true;
        do {
            System.out.println("---------MENU---------");
            System.out.println(">>1. NhậP thông tin");
            System.out.println(">>2. Xuất bảng kê khai");
            System.out.println(">>3. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Nhập số xe bạn muốn nhập thông tin: ");
                    n = sc.nextInt();
                    xe = new Vehicles[n];
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhập thông tin xe thứ %d: \n", i+1);
                        xe[i] = new Vehicles();
                        xe[i].nhap();
                    }
                    break;
                case 2:
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Tên Chủ Xe", "Loại xe", "Dung tích",
                            "Giá Trị", "Thuế");
                    for (int i = 0 ; i < n; i++) {
                        xe[i].inThongTin();
                    }
                    break;
                case 3:
                    System.out.println("Chào tạm biệt!");
                    flag = false;
            }

        } while (flag);
        sc.close();
    }
}
