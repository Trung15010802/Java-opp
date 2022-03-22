package tuan5.buoi9;

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
