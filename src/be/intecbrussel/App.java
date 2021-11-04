package be.intecbrussel;

import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Bear bear = new Bear(50, 5);
        Witch witch = new Witch(30, 100);


        String[] Monsters = {"Bear", "Witch"};
        Random r = new Random();
        int randInt;
        if (r.nextDouble() >= 0.5){
            randInt=1;
        }else {
            randInt = 0;
        }

        while (bear.getHitPoints() > 0 || witch.getHitPoints() > 0) {
            if (randInt == Arrays.asList(Monsters).indexOf("Bear")) {
                bear.bearClawAttack();
                bear.restoreRP(5);
                witch.takeDamage(10);
                if (bear.getHitPoints() <= 0) {
                    System.out.println("Witch is the winner!");
                }
            } else {
                witch.fireballAttack();
                witch.restoreMP(4);
                bear.takeDamage(8);
                if (witch.getHitPoints() <= 0) {
                    System.out.println("Bear is the winner!");
                }

            }

        }


    }
}
