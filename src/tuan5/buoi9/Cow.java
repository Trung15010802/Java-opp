package tuan5.buoi9;

public class Cow extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Cow sound...");        
    }

    @Override
    protected void eat() {
        System.out.println("Cow are eating grass...");
        
    }
    
}
