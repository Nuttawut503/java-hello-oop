import Animal.Animal;
import Animal.Dog.*;
import Animal.Cat.*;

public class App {
    public static void main(String[] args) throws Exception {
        Animal doberman = new Doberman(1, 10);
        Animal certain_cat = new Cat(2, 10);

        System.out.println("1) Doberman is fighting with a certain cat");
        System.out.println(" - Doberman's status: " + doberman.getInfo());
        System.out.println(" - The cat's status: " + certain_cat.getInfo());

        Animal winner = doberman.fight(certain_cat);

        System.out.println(" - The winner is " + winner.getName());

        System.out.println("2) give a prize to the winner");
        winner.feed();
        System.out.println(" - The current status now is " + winner.getName());

        Animal nyan = new Nyan(1000, 1);
        System.out.println("3) A new enemy is coming");
        System.out.println(" - Unknown status");
        System.out.println(" - The previous champion is going to fight");
        Animal secondWinner = winner.fight(nyan);
        System.out.println(" - The new winner is " + secondWinner.getInfo());
    }
}
