package org.example;

import java.util.Scanner;

public class ExampleStrings {
    public static void main(String[] args) {
        // ask user what their fav color is
        // if its red or blue then well say those are awesome colors
        // if its orange then well say thats cool
        //if its purple well say its a royal regal color
        // other wise say nothing specical

        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite color ");

        String color = input.nextLine();

        //with strings, we CANNOT use ==
        //equals() EqualsIgnoreCase()
        // EqualsIgnoreCase -

        if(color.equalsIgnoreCase("blue") ||
                color.equalsIgnoreCase("red")){
            System.out.println("Those are awesome colors");

        }

        else if(color.equalsIgnoreCase("orange")){
            System.out.println("That's Cool");

        }

        else if (color.equalsIgnoreCase("purple")) {
            System.out.println("a regal, royal color");

        }

        else{
            System.out.println("thats specical");

        }
    }
}
