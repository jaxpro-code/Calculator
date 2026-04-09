package org.example;

import java.util.Scanner;

public class ExampleIf {
    public static void main(String[] args) {
        //if statements
        // ask somebody how old they are (scanner)
        //if the person is over 50 we'll say they;re old
        //if the person is between 19- 49 years old we'll say not too old
        // if the person is 18 or below, we'll say they're not an adult

        // what  sysmbols do we use to compare number? < > == != >= <=

        Scanner scanner = new Scanner(System.in);

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        if(age >= 50) {
            System.out.println("your old");
        }

        else if(age >= 19 && age < 49) {
            System.out.println("your not that old");
        }

        else {
            System.out.println("you are not an adult yet");
        }




        }
    }

