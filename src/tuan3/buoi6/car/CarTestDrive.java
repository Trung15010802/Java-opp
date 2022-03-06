package tuan3.buoi6.car;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Green");
        car.setCarPrice(50000);
        System.out.println("Color: "+car.getCarColor());
        System.out.println("Price: "+car.getCarPrice());
    }
}
