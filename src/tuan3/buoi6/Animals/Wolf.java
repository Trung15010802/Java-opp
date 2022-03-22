package tuan3.buoi6.Animals;

public class Wolf extends Canine{
    @Override
    public void makeNoise() {
        System.out.println("Wolf sound...");
    }
    @Override
    protected void eat() {
        System.out.println("eat meat...");
    }
}
