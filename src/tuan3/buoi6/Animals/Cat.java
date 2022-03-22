package tuan3.buoi6.Animals;

public class Cat extends Feline {
    @Override
    protected void eat() {
        System.out.println("Ăn cá, ăn chuột");
    }

    @Override
    public void makeNoise() {
        System.out.println("Mèo kêu: meo meo meo");
    }

    void chaseButtfly() {
        System.out.println("Đuổi bướm...");
    }
}
