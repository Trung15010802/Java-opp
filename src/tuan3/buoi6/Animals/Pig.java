package tuan3.buoi6.Animals;

public class Pig extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Heo kêu: éc éc");        
    }

    @Override
    protected void eat() {
        System.out.println("Ăn cám");
    }
    
}
