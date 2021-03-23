package Animal.Cat;

public class Nyan extends Cat {

    public Nyan(int age, int weight) {
        super(age, weight, 99);
    }

    public String getName() {
        return "Nyan";
    }

    public void makeSound() {
        System.out.println("Hello Nyan!!");
    }
}
