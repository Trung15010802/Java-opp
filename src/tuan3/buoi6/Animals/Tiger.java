package tuan3.buoi6.Animals;

public class Tiger extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("Tiger sound: ");
    }

    @Override
    protected void eat() {
        System.out.println("Eating ...");
    }
}
