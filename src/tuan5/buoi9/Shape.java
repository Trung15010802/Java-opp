package tuan5.buoi9;

public abstract class Shape {
    protected int x, y;

    public Shape(int _x, int _y) {
        x = _x;
        y = _y;
    }

    abstract public void draw();
    abstract public void erase();
    public void moveTo(int _x, int _y){
        erase();
        x = _x;
        y = _y;
        draw();
    }
    
}
