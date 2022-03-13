package tuan4.buoi8;

public class Cow extends Animal{
    double giveMilk;
    
    
    public Cow(double giveMilk, String name) {
        super(name);
        this.giveMilk = giveMilk;
    }
    public Cow(){
        this.giveMilk = 500;
    }
    @Override
    public String toString() {
        return "Cow [giveMilk = "+giveMilk+"]"+super.toString();
    }
}
