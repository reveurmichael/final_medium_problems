package final_medium;

import java.util.ArrayList;
import java.util.HashMap;

public class FinalExamMedium {

    ArrayList<Monster> arrMonster = new ArrayList<>();

    public void addOneDragon(){
        // TODO: write your code here.
    }

    public void addOneBull(){
        // TODO: write your code here.

    }

    public void addOneTortoise(){
        // TODO: write your code here.

    }

    public void sortArrUsingComparableInterface(){
        // TODO: write your code here.

    }

    public void cloneLastMonster(){
        // TODO: write your code here.

    }

    public void upgradeLastMonster(){
        // TODO
        //  Double the attributes of the last monster (last in the position of arrMonster).
        //  Double means multiplying by 2.
        //  For example, if the last monster's intelligence = 20, strength = 11, agility = 3,
        //  then, after calling this function,
        //  the monster should have intelligence = 40, strength = 22, agility = 6

        // TODO: write your code here.

    }

    public void removeAllDragons(){
        // TODO: write your code here.

    }

    public void removeAllBulls(){
        // TODO: write your code here.

    }

    public void removeAllTortoise(){
        // TODO: write your code here.

    }

    public void removeStrongest(){
        // TODO: write your code here.

    }

    public void removeWeakest(){
        // TODO: write your code here.

    }

    public void saveArrToTextFile(){
        // This function won't be tested, it's up to you to conceive how the data should be saved.
        // We will call saveArrToTextFile() first and then loadArrToTextFile(), if we have the same arrMonster,
        // then it's OK.
        // TODO: write your code here.

    }

    public void loadArrFromTextFile(){
        // TODO: write your code here.

    }

    public void printArrMonster(){
        int size = arrMonster.size();
        for(int i = 0; i < size; i ++){
            System.out.println((i + 1) + ": " + arrMonster.get(i));
        }
        System.out.println("--------------------------\n\n");
    }

}
