package tuan3.buoi6.Animals;

public class Hippo extends Animal {
    @Override
    protected void eat() {
        System.out.println("Ăn cá");
    }

    @Override
    public void makeNoise() {
        System.out.println("kêu hà mã");
    }
}
