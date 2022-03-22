package tuan5.buoi9;

public class DogRobot implements Pet{

    @Override
    public void beFriendly() {
        System.out.println("Chó robot Thân thiện");        
    }

    @Override
    public void play() {
        System.out.println("Chó robot chơi đùa");
        
    }
    
}
