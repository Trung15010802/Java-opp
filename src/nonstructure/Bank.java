package nonstructure;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int account_number = 12345;
        int account_balanced = 0;
        //Gửi tiền
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi >");
        int inputAmount = sc.nextInt();
        account_balanced += inputAmount;

        //show
        System.out.println("Thông tin tài khoản : ");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: "+ account_balanced);

        //With draw - rút tiền
        System.out.println("Nhập số tiền rút >");
        int inputWithdrawAmount = sc.nextInt();
        account_balanced -= inputWithdrawAmount;

        //show
        System.out.println("Thông tin tài khoản : ");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: "+ account_balanced);
        sc.close();
    }
}
