package tuan6.buoi11;

import java.util.ArrayList;
import java.util.List;

import tuan5.buoi9.Pet;
import tuan5.buoi9.Dog;

public class MatHanhViObject {
    public static void main(String[] args) {
        List<Pet> list = new ArrayList<>();
        Dog dog = new Dog();
        list.add(dog);
        Pet pet = list.get(0);// Mất hành vi 
        Dog dog2 = (Dog)pet; //Lấy lại hành vi ép kiểu
        dog2.makeNoise();
        dog2.chaseCat();
        dog2.beFriendly();
    }
}
