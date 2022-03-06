package tuan3.buoi6.bai2;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("2004110026", "Bùi Quang Trung", 9, 9.5);
        SinhVien sv2 = new SinhVien("132413274", "Nguyễn Văn A", 8, 7);
        SinhVien sv3 = new SinhVien();
        sv3.setDiemLLT(8);
        sv3.setDiemTH(8.5);
        sv3.setHoTen("Nguyễn Văn Ba");
        sv3.setMssv("0123412140");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

    }
}
