package Animal.Dog;

public class Shihtzu extends Dog {

    public Shihtzu(int age, int weight) {
        super(age, weight, 8);
    }

    public String getName() {
        return "Shihtzu";
    }

    public void makeSound() {
        System.out.println("Hong!! Hong!! Huh Huh Hong!!..");
    }
}
