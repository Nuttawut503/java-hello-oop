### Practice OOP with Java

code
```java
    Animal doberman = new Doberman(1, 10);
    Animal certain_cat = new Cat(2, 10);

    System.out.println("1) Doberman is fighting with a certain cat");
    System.out.println(" - Doberman's status: " + doberman.getInfo());
    System.out.println(" - The cat's status: " + certain_cat.getInfo());

    Animal winner = doberman.fight(certain_cat);

    System.out.println(" - The winner is " + winner.getName());

    System.out.println("2) give a prize to the winner");
    winner.feed();
    System.out.println(" - The current status now is " + winner.getInfo());

    Animal nyan = new Nyan(1000, 1);
    System.out.println("3) A new enemy is coming");
    System.out.println(" - Unknown status");
    System.out.println(" - The previous champion is going to fight");
    Animal secondWinner = winner.fight(nyan);
    System.out.println(" - The new winner is " + secondWinner.getInfo());
```

output
```
    1) Doberman is fighting with a certain cat
    - Doberman's status: Doberman - {age: 1, weight: 10, power: 15}
    - The cat's status: Cat - {age: 2, weight: 10, power: 5}
    HongHoHongHoHong!! Hong!! Hong!!
    Meow!!
    - The winner is Doberman
    2) give a prize to the winner
    feeding...
    - The current status now is Doberman - {age: 1, weight: 10, power: 17}
    3) A new enemy is coming
    - Unknown status
    - The previous champion is going to fight
    HongHoHongHoHong!! Hong!! Hong!!
    Hello Nyan!!
    - The new winner is Nyan - {age: 1000, weight: 1, power: 99}

```
