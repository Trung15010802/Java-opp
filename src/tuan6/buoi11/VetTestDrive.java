package tuan6.buoi11;

import tuan5.buoi9.*;

public class VetTestDrive {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d = new Dog();
        Cat c = new Cat();
        v.giveShot(d);
        v.giveShot(c);
    }   
}
