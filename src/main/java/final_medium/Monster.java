package final_medium;

import java.util.Random;

public class Monster implements Comparable<Monster> {
    public String name;
    public int strength; // 力量
    public int agility; // 敏捷
    public int intelligence;  //智力

    public String toString(){
        // Don't modify code in this toString function.
        return "" + this.name + ": (" + this.strength + ", " + this.agility + ", " + this.intelligence + ")";
    }

    @Override
    public int compareTo(Monster other) {
        // TODO: modify your code here for the function sortArrUsingComparableInterface()
        return -1;
    }
}

class Duck extends Monster {
    public Duck(){
        this.name = "Duck";
        this.strength = 8  + new Random().nextInt(10);
        this.agility = 8 + new Random().nextInt(10);
        this.intelligence = 8 + new Random().nextInt(10);
    }
}

class Dragon extends Monster {
    public Dragon(){
        this.name = "Dragon";
        this.strength = 29  + new Random().nextInt(10);
        this.agility = 29 + new Random().nextInt(10);
        this.intelligence = 29 + new Random().nextInt(10);
    }
}

class Tortoise extends Monster {
    public Tortoise(){
        this.name = "Tortoise";
        this.strength = 1  + new Random().nextInt(10);
        this.agility = 1 + new Random().nextInt(10);
        this.intelligence = 1 + new Random().nextInt(10);
    }
}
