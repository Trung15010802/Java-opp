package tuan3.buoi1;

public class Dog {
    private int size;
    private String breed;
    private String name;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        if(size > 0)
            this.size = size;
        else System.out.println("Size không hợp lệ!");
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}
