package tuan5.buoi9;

abstract public class Animal {
    // private String picture;
    // private String food;
    // private int hunger;
    private String name;

    public String getName() {
        return name;
    }

    public abstract void makeNoise();

    protected abstract void eat();

    protected void sleep() {

    }

    protected void roam() {

    }

}
