package tuan5.buoi9;

public class Hippo extends Animal {
    @Override
    protected void makeNoise() {
        System.out.println("Hippo sound....");
    }

    @Override
    protected void eat() {
        System.out.println("Hippo are eating...");
    }
}
