package Animal;

public abstract class Animal {
    protected int age, weight, power;

    public Animal(int age, int weight) {
        this(age, weight, 0);
    }

    protected Animal(int age, int weight, int power) {
        this.age = age;
        this.weight = weight;
        this.power = power;
    }

    public abstract void makeSound();

    public String getName() {
        return "Animal";
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPower() {
        return this.power;
    }

    public String getInfo() {
        return String.format(
            "%s - {age: %s, weight: %s, power: %s}",
            this.getName(), this.getAge(), this.getWeight(), this.getPower()
        );
    }

    protected void updatePower(int power_point) {
        this.power += power_point;
    }
    
    public Animal fight(Animal target) {
        this.makeSound();
        target.makeSound();
        // return the winner
        return this.power < target.power? target: this;
    }

    public abstract void feed();
}
