package tuan3.buoi6.Animals;

public class Tiger extends Feline{
    @Override
    protected void makeNoise() {
        System.out.println("Tiger sound: gào gào");
    }

    @Override
    protected void eat() {
        System.out.println("Eating ...");
    }
}
