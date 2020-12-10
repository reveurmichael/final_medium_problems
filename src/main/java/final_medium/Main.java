package final_medium;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FinalExamMedium medium = new FinalExamMedium();
        Scanner scanner = new Scanner(System.in);
        String in = "";
        while(true){
            try {
                in = scanner.next().toUpperCase();
            }
            catch (Exception e) {
                System.out.println("Error: INPUT SOMETHING ELSE");
            }
            switch (in) {
                case "AD":
                    medium.addOneDragon();
                    break;
                case "AB":
                    medium.addOneBull();
                    break;
                case "AT":
                    medium.addOneTortoise();
                    break;
                case "RD":
                    medium.removeAllDragons();
                    break;
                case "RB":
                    medium.removeAllBulls();
                    break;
                case "RT":
                    medium.removeAllTortoise();
                    break;
                case "S":
                    medium.sortArrUsingComparableInterface();
                    break;
                case "C":
                    medium.cloneLastMonster();
                    break;
                case "U":
                    medium.upgradeLastMonster();
                    break;
                case "Q":
                    return;
                default:
                    System.out.println("Error: INPUT SOMETHING ELSE");
            }
            medium.printArrMonster();
        }
    }
}
