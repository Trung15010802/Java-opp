package tuan5.buoi9;

public class Tiger extends Feline{
    @Override
    public void makeNoise() {
        System.out.println("Tiger sound: gào gào");
    }

    @Override
    protected void eat() {
        System.out.println("Eating ...");
    }
}
