package tuan5.buoi9;

public class Dog extends Canine implements Pet{
    @Override
    protected void eat() {
        System.out.println("Ăn cơm, ăn xương");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Chó sủa: gâu gâu");
    }

    void chaseCat(){
        System.out.println("Đuổi mèo");
    }

    @Override
    public void beFriendly() {
        
    }

    @Override
    public void play() {
        
    }
}
