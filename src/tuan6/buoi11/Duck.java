package tuan6.buoi11;

public class Duck {
    private int size;
    private String name;
    private static int dem = 0; // Thành viên class ->Dùng chung cho tất cả object cùng 1 lớp

    // Các biến của đối tượng đều trở thành hành vi và trạng thái của đối tượng
    // trong vùng nhớ heap
    // Khi thiết kế classs ngoài việc chứa thành viên object thì còn có thành viên
    // class/static
    // static{
    //     System.out.println("Test");
    // }
    public Duck(int size) {
        this.size = size;
        demVit();
    }

    public Duck() { // ->Phương thức class
        demVit();
    }

    private void demVit() {
        dem++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        Duck.dem = dem;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
