package tuan4.buoi7.bai1;

public class NoiThanh extends Xe {
    private String noiDen;
    private int soNgayDi;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

   @Override
   void nhap() {
       super.nhap();
       sc.nextLine();
        System.out.print("Nhập nơi đến: ");
        noiDen = sc.nextLine();
        System.out.print("Nhập số ngày đi được: ");
        soNgayDi = sc.nextInt();
   }

    @Override
    public String toString() {
        
        return super.toString()+" "+noiDen+" "+soNgayDi;
    }

}
