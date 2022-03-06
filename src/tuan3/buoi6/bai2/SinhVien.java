package tuan3.buoi6.bai2;

public class SinhVien {
    private String mssv;
    private String hoTen;
    private double diemLLT;
    private double diemTH;
    public SinhVien(String mssv, String hoTen, double diemLLT, double diemTH) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemLLT = diemLLT;
        this.diemTH = diemTH;
    }
    public SinhVien() {
        this.mssv = null;
        this.hoTen = null;
        this.diemLLT = 0;
        this.diemTH = 0;
    }
    public String getMssv() {
        return mssv;
    }
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public double getDiemLLT() {
        return diemLLT;
    }
    public void setDiemLLT(double diemLLT) {
        this.diemLLT = diemLLT;
    }
    public double getDiemTH() {
        return diemTH;
    }
    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    
    public double tinhDiemTB(){
        return (diemLLT + diemTH)/2;
    }

    public String toString(){
       return hoTen + "     " + mssv + "    " +diemLLT +"   "+ diemTH +"    "+this.tinhDiemTB();
    }
    
}
