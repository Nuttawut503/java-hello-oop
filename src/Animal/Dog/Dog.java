package Animal.Dog;

import Animal.Animal;

public class Dog extends Animal {
    
    public Dog(int age, int weight) {
        this(age, weight, 10);
    }
    
    protected Dog(int age, int weight, int power) {
        super(age, weight, power);
    }

    public String getName() {
        return "Dog";
    }

    public void makeSound() {
        System.out.println("Woof!!");
    }

    public void feed() {
        System.out.println("feeding...");
        super.updatePower(2);
    }
}
