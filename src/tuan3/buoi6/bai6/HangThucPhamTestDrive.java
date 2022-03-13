package tuan3.buoi6.bai6;

import java.text.ParseException;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        HangThucPham hang = new HangThucPham("100Tp", "Thịt Bò", 500000, "1/3/2022", "10/3/2022");
        System.out.println(hang.toString());
        System.out.println(hang.hsd());
    }
}
