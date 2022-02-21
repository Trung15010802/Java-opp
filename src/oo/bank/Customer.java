package oo.bank;

import java.util.Scanner;

public class Customer {
    String name;
    String address;
    String phoneNumber;
    
    Scanner sc = new Scanner(System.in);

    void EnterInfo(){
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();
    }

    void show(){
        System.out.println("Tên: "+name);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Số điện thoại: "+phoneNumber);
    }
    
}
