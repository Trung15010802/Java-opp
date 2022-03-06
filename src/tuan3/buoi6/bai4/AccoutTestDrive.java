package tuan3.buoi6.bai4;

import java.util.Scanner;

public class AccoutTestDrive {
    public static void main(String[] args) {
        int n = 0;
        Account a[] = null;
        int key;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("==========Menu==========");
            System.out.println(">>1. Nhập thông tin tài khoản");
            System.out.println(">>2. Xuất danh danh sách thông tin khách hàng");
            System.out.println(">>3. Nạp tiền");
            System.out.println(">>4. Rút tiền");
            System.out.println(">>5. Chuyển khoản");
            System.out.println(">>6. Đáo hạn");
            System.out.println(">>0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Nhập số lượng tài khoản cần nhập thông tin: ");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        a[i] = new Account();
                        a[i].nhap();
                    }
                    break;
                case 2:
                    System.out.printf("%-20s%-20s%-20s\n", "STK", "TenTK", "Số Dư");
                    for (int i = 0; i < n; i++) {
                        System.out.println(a[i]);
                    }
                    break;
                case 3:
                    System.out.print("Nhập số tài khoản cần nạp tiền: ");
                    long stk = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (a[i].getStk() == stk) {
                            System.out.print("Nhập sô tiền cần nạp: ");
                            double tien = sc.nextDouble();
                            a[i].napTien(tien);
                            break;
                        }
                    }
                    System.out.println("Số tài khoản không hợp lệ!");
                    break;
                case 4:
                    System.out.print("Nhập số tài khoản cần rút tiền: ");
                    stk = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk == a[i].getStk()) {
                            System.out.print("Nhập số tiền rút: ");
                            Double tienRut = sc.nextDouble();
                            a[i].rutTien(tienRut);
                            break;
                        }
                    }
                    System.out.println("Số tài khoản không hợp lệ!");
                    break;
                case 5:
                    System.out.print("Nhập số tài khoản chuyển tiền: ");
                    stk = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk == a[i].getStk()) {
                            System.out.print("Nhập số tiền rút: ");
                            Double tien = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Nhập số tài khoản cầN chuyển tiền tới: ");
                            long STKKhach = sc.nextLong();
                            a[i].chuyenTien(STKKhach, tien, 0);
                            break;
                        }
                    }
                    System.out.println("Số tài khoản không hợp lệ!");
                    break;
                case 6:
                    System.out.print("Nhập số tài khoản cần nạp tiền: ");
                    stk = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk == a[i].getStk()) {
                            a[i].daoHan();
                            break;
                        }

                    }
                    System.out.println("Số tài khoản không hợp lệ!");
                    break;
                case 0:
                    System.out.println("Chào tạm biệt!");
                    flag = false;
            }
        } while (flag);
        sc.close();
    }
}
