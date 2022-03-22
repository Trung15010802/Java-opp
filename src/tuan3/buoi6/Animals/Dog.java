package tuan3.buoi6.Animals;

public class Dog extends Canine{
    @Override
    protected void eat() {
        System.out.println("Ăn cơm, ăn xương");
    }

    @Override
    public void makeNoise() {
        System.out.println("Chó sủa: gâu gâu");
    }

    void chaseCat(){
        System.out.println("Đuổi mèo");
    }
}
