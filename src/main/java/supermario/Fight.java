/*
 @author: lunde chen
 @email: lundechen@shu.edu.cn
 */

package supermario;

import java.util.ArrayList;
import java.util.Random;


/*
 TODO:
  1. modify this java file. Reduce almost in half its lines (less than 115 lines)
  2. please do that with inheritance
  3. note that template method design pattern is used here.
  4. each time you modify your code a little bit, play the game and make sure it runs well.
 */


class FightBase {
    public int numOfMonsters;
    public SuperMario superMario;
    public ArrayList<Monster> queueMonsters;
    public int sizeOfMonsterQueue;

    public int fight(){
        return -1;
    }

    public void fillInMonsters(int roundOfGame){
        for(int i = queueMonsters.size(); i < this.sizeOfMonsterQueue; i ++){
            int randomChoice = (new Random()).nextInt(3);
            switch (randomChoice) {
                case 0:
                    queueMonsters.add(new Dragon(roundOfGame));
                    break;
                case 1:
                    queueMonsters.add(new Duck(roundOfGame));
                    break;
                case 2:
                    queueMonsters.add(new Tortoise(roundOfGame));
                    break;
            }
        }
    }
}

class Fight1vs1 {
    public int numOfMonsters;
    public SuperMario superMario;
    public ArrayList<Monster> queueMonsters;
    public int sizeOfMonsterQueue;
    public Monster monster_1;

    public Fight1vs1(SuperMario superMario,  ArrayList<Monster> queueMonsters, int sizeOfMonsterQueue){
        this.superMario = superMario;
        this.queueMonsters = queueMonsters;
        this.numOfMonsters = 1;
        this.sizeOfMonsterQueue = sizeOfMonsterQueue;
        this.monster_1 = queueMonsters.remove(0);
    }

    public int fight(){
        int numKilled = 0;
        if( this.superMario.strength >= this.monster_1.strength && this.superMario.agility >= this.monster_1.agility
                && this.superMario.intelligence >= this.monster_1.intelligence)
            numKilled ++;
        return numKilled;
    }

    public void fightAndAfterProcessing(int roundOfGame){
        int numKilled = fight();
        if(numKilled == this.numOfMonsters){
            System.out.println("\n\nSuper Mario won the fight against " + this.numOfMonsters + " monsters!");
            this.superMario.growAfterAWin();
        }
        else {
            this.superMario.numOfLives --;
            System.out.println("\n\nSuper Mario lose the fight ... and now has only " + superMario.numOfLives + " lives!");
        }
        this.fillInMonsters(roundOfGame);
    }

    public void fillInMonsters(int roundOfGame){
        for(int i = queueMonsters.size(); i < this.sizeOfMonsterQueue; i ++){
            int randomChoice = (new Random()).nextInt(3);
            switch (randomChoice) {
                case 0:
                    queueMonsters.add(new Dragon(roundOfGame));
                    break;
                case 1:
                    queueMonsters.add(new Duck(roundOfGame));
                    break;
                case 2:
                    queueMonsters.add(new Tortoise(roundOfGame));
                    break;
            }
        }
    }
}

class Fight1vs2 {
    public int numOfMonsters;
    public SuperMario superMario;
    public ArrayList<Monster> queueMonsters;
    public int sizeOfMonsterQueue;
    public Monster monster_1;
    public Monster monster_2;

    public Fight1vs2(SuperMario superMario,  ArrayList<Monster> queueMonsters, int sizeOfMonsterQueue){
        this.superMario = superMario;
        this.queueMonsters = queueMonsters;
        this.sizeOfMonsterQueue = sizeOfMonsterQueue;
        this.numOfMonsters = 2;
        this.monster_1 = queueMonsters.remove(0);
        this.monster_2 = queueMonsters.remove(0);
    }

    public int fight(){
        int numKilled = 0;
        if( this.superMario.strength >= this.monster_1.strength && this.superMario.agility >= this.monster_1.agility
                && this.superMario.intelligence >= this.monster_1.intelligence)
            numKilled ++;
        if( this.superMario.strength >= this.monster_2.strength && this.superMario.agility >= this.monster_2.agility
                && this.superMario.intelligence >= this.monster_2.intelligence)
            numKilled ++;
        return numKilled;
    }

    public void fightAndAfterProcessing(int roundOfGame){
        int numKilled = fight();
        if(numKilled == this.numOfMonsters){
            System.out.println("\n\nSuper Mario won the fight against " + this.numOfMonsters + " monsters!");
            this.superMario.growAfterAWin();
        }
        else {
            this.superMario.numOfLives --;
            System.out.println("\n\nSuper Mario lose the fight ... and now has only " + superMario.numOfLives + " lives!");
        }
        this.fillInMonsters(roundOfGame);
    }

    public void fillInMonsters(int roundOfGame){
        for(int i = queueMonsters.size(); i < this.sizeOfMonsterQueue; i ++){
            int randomChoice = (new Random()).nextInt(3);
            switch (randomChoice) {
                case 0:
                    queueMonsters.add(new Dragon(roundOfGame));
                    break;
                case 1:
                    queueMonsters.add(new Duck(roundOfGame));
                    break;
                case 2:
                    queueMonsters.add(new Tortoise(roundOfGame));
                    break;
            }
        }
    }
}


class Fight1vs3 {
    public int numOfMonsters;
    public SuperMario superMario;
    public ArrayList<Monster> queueMonsters;
    public int sizeOfMonsterQueue;
    public Monster monster_1;
    public Monster monster_2;
    public Monster monster_3;

    public Fight1vs3(SuperMario superMario,  ArrayList<Monster> queueMonsters, int sizeOfMonsterQueue){
        this.superMario = superMario;
        this.queueMonsters = queueMonsters;
        this.sizeOfMonsterQueue = sizeOfMonsterQueue;
        this.numOfMonsters = 3;
        this.monster_1 = queueMonsters.remove(0);
        this.monster_2 = queueMonsters.remove(0);
        this.monster_3 = queueMonsters.remove(0);
    }

    public int fight(){
        int numKilled = 0;
        if( this.superMario.strength >= this.monster_1.strength && this.superMario.agility >= this.monster_1.agility
                && this.superMario.intelligence >= this.monster_1.intelligence)
            numKilled ++;
        if( this.superMario.strength >= this.monster_2.strength && this.superMario.agility >= this.monster_2.agility
                && this.superMario.intelligence >= this.monster_2.intelligence)
            numKilled ++;
        if( this.superMario.strength >= this.monster_3.strength && this.superMario.agility >= this.monster_3.agility
                && this.superMario.intelligence >= this.monster_3.intelligence)
            numKilled ++;
        return numKilled;
    }

    public void fightAndAfterProcessing(int roundOfGame){
        int numKilled = fight();
        if(numKilled == this.numOfMonsters){
            System.out.println("\n\nSuper Mario won the fight against " + this.numOfMonsters + " monsters!");
            this.superMario.growAfterAWin();
        }
        else {
            this.superMario.numOfLives --;
            System.out.println("\n\nSuper Mario lose the fight ... and now has only " + superMario.numOfLives + " lives!");
        }
        this.fillInMonsters(roundOfGame);
    }

    public void fillInMonsters(int roundOfGame){
        for(int i = queueMonsters.size(); i < this.sizeOfMonsterQueue; i ++){
            int randomChoice = (new Random()).nextInt(3);
            switch (randomChoice) {
                case 0:
                    queueMonsters.add(new Dragon(roundOfGame));
                    break;
                case 1:
                    queueMonsters.add(new Duck(roundOfGame));
                    break;
                case 2:
                    queueMonsters.add(new Tortoise(roundOfGame));
                    break;
            }
        }
    }

}
