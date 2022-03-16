package tuan5.buoi9;

public class Circle extends Shape{

    public Circle(int  _x, int _y, int _r){
        super(_x, _y);
    } 
    @Override
    public void draw() {
        System.out.println("Draw a circle at: "+x+", "+y);  
    }

    @Override
    public void erase() {
        System.out.println("Erase circle at "+x+", "+y);
        
    }
    
}
