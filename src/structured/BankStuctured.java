package structured;

import java.util.Scanner;

public class BankStuctured {
    static int account_number = 12345;
    static int account_balanced = 0;
    void show(){
        //show
        System.out.println("Thông tin tài khoản : ");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: "+ account_balanced);
    }
    public static void main(String[] args) {

        //Gửi tiền
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi >");
        int inputAmount = sc.nextInt();
        account_balanced += inputAmount;

        //With draw - rút tiền
        System.out.println("Nhập số tiền rút >");
        int inputWithdrawAmount = sc.nextInt();
        account_balanced -= inputWithdrawAmount;
        sc.close();
    }
}
