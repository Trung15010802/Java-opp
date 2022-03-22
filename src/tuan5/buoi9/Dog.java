package tuan5.buoi9;

public class Dog extends Canine implements Pet{
    @Override
    protected void eat() {
        System.out.println("Ăn cơm, ăn xương");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chó sủa: gâu gâu");
    }

    public void chaseCat(){
        System.out.println("Đuổi mèo");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog Friendly");
    }

    @Override
    public void play() {
        System.out.println("Dog play");
    }
}
