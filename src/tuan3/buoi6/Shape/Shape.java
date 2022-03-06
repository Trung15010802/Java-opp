package tuan3.buoi6.Shape;

public class Shape {
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    void rotate() {
        System.out.println("- Rotating 360 ...");
    }

    void playSound() {
        System.out.println("Play file .aif sound");
        System.out.println("____________________________________");
    }
}
