package tuan6.buoi11;

import java.util.ArrayList;
import java.util.List;

import tuan5.buoi9.Animal;

public class DanhSachThu {
    private List<Animal> danhSach = new ArrayList<>();

    // Thêm
    // Xoá
    // Sửa
    public Animal timKiemAnimal(String name) {
        Animal animalTimThay = null;  
        for (Animal animal : danhSach) {
            if (animal.getName().equals(name))
                animalTimThay = animal;
        }
        return animalTimThay;
    }

}
