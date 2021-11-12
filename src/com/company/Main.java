package com.company;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int points = 0;

    public static void main(String[] args) {


        randomColour();


    }
    private static void randomColour() {

            Scanner input = new Scanner(System.in);


            for (int i = 0; i < 10; i++) {

                Random random = new Random();

                List<String> Colours = new ArrayList<String>();

                Collections.addAll(Colours, "Red", "Green", "Blue");

                String element = Colours.get(random.nextInt(3 - 1) + 1);


                System.out.println("Please enter what colour you think the counter is, Red, Green, Blue");
                String guess = input.nextLine();
                if (guess.equalsIgnoreCase(element)) {
                    points += 1;
                    System.out.println("correct!");
                } else if (!guess.equals(element)) {
                    System.out.println("incorrect, the correct answer was: " + element);
                }

            }
            System.out.println("Congrats your score is: " + points + "/10");

        while (true) {
            System.out.println("would you like to play again? Y/N");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                randomColour();
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Thank you for playing");
                break;
            } else {
                System.out.println("enter a valid response");
            }
        }

    }
}




