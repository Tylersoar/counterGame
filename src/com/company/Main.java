package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

        Random random = new Random();

        List<String> Colours = new ArrayList<String>();

        Collections.addAll(Colours, "Red", "Green", "Blue");

        String element = Colours.get(random.nextInt(3-1)+1);

        System.out.println(element);
        }
    }
    private static void userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what colour you think the counter is, Red, Green, Blue");
        String guess = input.nextLine();
        if (guess.equalsIgnoreCase(guess == element))
    }
}






