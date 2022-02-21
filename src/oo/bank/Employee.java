package oo.bank;

import java.util.Scanner;

public class Employee {
    String name;
    String address;
    String phoneNumber;
    double salary;

    Scanner sc = new Scanner(System.in);

    void EnterInfo(){
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phoneNumber = sc.nextLine();
        System.out.print("Nhập lương: ");
        salary = sc.nextDouble();
    }

    void show(){
        System.out.println("Tên: "+name);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Số điện thoại: "+phoneNumber);
        System.out.println("Lương: "+ salary);
    }
    
}
