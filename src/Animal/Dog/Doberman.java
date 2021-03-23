package Animal.Dog;

public class Doberman extends Dog {
    
    public Doberman(int age, int weight) {
        super(age, weight, 15);
    }

    public String getName() {
        return "Doberman";
    }

    public void makeSound() {
        System.out.println("HongHoHongHoHong!! Hong!! Hong!!");
    }
}
