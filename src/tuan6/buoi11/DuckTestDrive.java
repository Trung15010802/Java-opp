package tuan6.buoi11;

public class DuckTestDrive {
    public static void main(String[] args) {
        System.out.println("Số vịt: "+Duck.getDem()); // Không cần tạo bất kỳ object nào vẫn có thể sử dụng được thành viên class 
        //Bằng cú pháp <Tên class>.thanhvienClass
        // Thành viên class/static sẽ được thực thi trước khi bất kỳ đối tượng nào được tạo ra
        // Thành viên static không được thao tác lên thành viên object nhưng ngược lại thì được

       // Duck duck = new Duck(5);
      //  Duck duck2 = new Duck();
        System.out.println("Số vịt: " + Duck.getDem());
    }
}
