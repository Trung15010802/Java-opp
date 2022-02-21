package tuan3.buoi1;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(4);
        dog.setBreed("Đốm");
        dog.setName("LuLU");
        System.out.println("Size of Dog: "+dog.getSize());
        System.out.println("Breed: "+dog.getBreed());
        System.out.println("Name: "+dog.getName());
    }
}
