package Animal.Cat;

import Animal.Animal;

public class Cat extends Animal {

    public Cat(int age, int weight) {
        this(age, weight, 5);
    }

    protected Cat(int age, int weight, int power) {
        super(age, weight, power);
    }

    public String getName() {
        return "Cat";
    }

    public void makeSound() {
        System.out.println("Meow!!");
    }

    public void feed() {
        System.out.println("feeding...");
        super.updatePower(1);
    }
}
