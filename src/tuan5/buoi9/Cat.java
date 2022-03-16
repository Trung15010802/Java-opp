package tuan5.buoi9;

public class Cat extends Feline implements Pet{
    @Override
    protected void eat() {
        System.out.println("Ăn cá, ăn chuột");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Mèo kêu: meo meo meo");
    }

    void chaseButtfly() {
        System.out.println("Đuổi bướm...");
    }

    @Override
    public void beFriendly() {
        
        
    }

    @Override
    public void play() {
       
        
    }
}
