package tuan6.buoi11;

import java.util.ArrayList;
import java.util.List;

import tuan5.buoi9.*;
public class DaHinhPet {
    public static void main(String[] args) {
        //Mối quan hệ giữa các interface và các lớp con cũng là mối quan hệ is-a
        List<Pet> list =new ArrayList<>();
        Pet dsPet[] = new Pet[2];
        DogRobot robotDog = new DogRobot();
        Dog dog = new Dog();
        Cat cat = new Cat();
        list.add(robotDog);
        list.add(dog);
        list.add(cat);
        for (Pet pet : dsPet) {
            pet.beFriendly();
        }
    }
}
