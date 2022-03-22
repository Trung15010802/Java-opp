package tuan6.buoi11;

import tuan3.buoi6.Animals.Animal;
import tuan3.buoi6.Animals.Cat;
import tuan3.buoi6.Animals.Dog;
import tuan3.buoi6.Animals.Hippo;
import tuan3.buoi6.Animals.Pig;

public class DaHinhMang {
    public static void main(String[] args) {
        // danh sách với kiểu class cha
        //Lợi ích của đa hình: thay đổi code khi chương trình đang chạy

        Animal danhSachThu[] = new Animal[6];
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        danhSachThu[0] = cat;
        danhSachThu[1] = cat2;
        danhSachThu[2] = dog;
        danhSachThu[3] = dog2;
        Hippo hippo = new Hippo();
        danhSachThu[4] = hippo;
        danhSachThu[5] = new Pig();
        for (Animal animal : danhSachThu) {
            //Ràng buộc code trễ ->Chấp nhận bất kỳ hình dạng nào của con
                animal.makeNoise();// Gửi cùng 1 thông điệp (overritde) cho các object khác nhau nhưng ứng với mỗi object khác nhau thì sẽ có hành vì khác nhau
        }
    }
}
