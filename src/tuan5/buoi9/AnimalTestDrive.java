package tuan5.buoi9;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeNoise();
        animal.eat();
        Animal animal2 = new Dog();
        animal2.makeNoise();
        animal2.eat(); 
        Animal animal3 = new Lion();
        animal3.makeNoise();
        animal3.eat();

    }
}
