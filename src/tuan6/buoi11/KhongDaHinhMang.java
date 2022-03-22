package tuan6.buoi11;

import tuan3.buoi6.Animals.Dog;
import tuan3.buoi6.Animals.Cat;

public class KhongDaHinhMang {
    public static void main(String[] args) {
        Cat danhSach[] = new Cat[3];
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        danhSach[0] = cat;
        danhSach[1] = cat2;
        danhSach[2] = new Cat();
        for (Cat c : danhSach) {
            //Ràng buộc code sớm
            c.makeNoise();
        }


        Dog danhSach2[] = new Dog[3];
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        danhSach2[0] = dog;
        danhSach2[1] = dog2;
        danhSach2[2] = new Dog();
        for (Dog d : danhSach2) {
            //Ràng buộc code sớm
            d.makeNoise();
        }

    }
}
