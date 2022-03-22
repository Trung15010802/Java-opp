package tuan5.buoi9;

public class Lion extends Feline{
    @Override
    protected void eat() {
        
        System.out.println("Lion are eating...");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion sound...");
    }
}
