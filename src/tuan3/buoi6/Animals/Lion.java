package tuan3.buoi6.Animals;

public class Lion extends Animal{
    @Override
    protected void eat() {
        
        System.out.println("Lion are eating...");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Lion sound...");
    }
}
