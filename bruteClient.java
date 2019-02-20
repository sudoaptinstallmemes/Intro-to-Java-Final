package com.company;

/*
Amon Guinan
January - February 2019
Compilation of three increasingly efficient codes
that use Brute Force methods to find specified strings.
 */
import java.util.Scanner;

public class bruteClient {
    public static void main(String [] args)
    {
        helloWorld brute1 = new helloWorld();
        Brute_Diction_V2 brute2 = new Brute_Diction_V2();
//        Brute_Diction_String brute3 = new Brute_Diction_String(); Broken. Extremely similar to 2.
        Brute_Diction_V3 brute4 = new Brute_Diction_V3();

        int x = 0;

        System.out.println();
        System.out.println("-INTRODUCTION-");
        System.out.println("This client program can initiate a series of other programs, designed to demonstrate \"Brute Force\" techniques.");
        System.out.println("These techniques are a simple method to find an unknown piece of information.");
        System.out.println("Essentially, the program runs through every possible output until it finds the correct one.");
        System.out.println("As such, this technique is used in scenarios when the attempted output can be compared to a secret correct output.");
        System.out.println("A scenario such as finding a password.");
        System.out.println("Of course, this would not work on current passwords, as security measures have been developed to prevent a program like this one from working.");
        System.out.println();





        do {
            System.out.println("-EXECUTION-");
            System.out.print("Select Program 1 through 3: ");
            Scanner input = new Scanner(System.in);
            String word = input.nextLine();
            word = word.toLowerCase();


            switch(word)
            {

                case("1"):
                case("one"):
                    System.out.println();
                    System.out.println("Program one is the primary inspiration for this project.");
                    System.out.println("It outputs a random string, until it gets an individual letter correct.");
                    System.out.println("Once it does, it remembers that letter, but otherwise it prints the unknowns completely randomly.");
                    System.out.println();
                    System.out.print(brute1.main());
                    break;
                case("2"):
                case("two"):
                    System.out.println();
                    System.out.println("Program two was an attempt to incorporate a dictionary to improve efficiency.");
                    System.out.println("That's to say, once it gets a letter wrong, it won't try it again.");
                    System.out.println("However, it can only test for a single character.");
                    System.out.println("This limitation comes from the fact that it tests all the characters at once, and it doesn't refresh its dictionary.");
                    System.out.println("Attempting to input more than one character will confuse it.");
                    System.out.println();
                    System.out.print(brute2.main());
                    break;
//                case("3"):
//                case("three"):
//                    System.out.print(brute3.main());
//                    break;
                //broken attempt at two.

                case("3"):
                case("three"):
                    System.out.println();
                    System.out.println("Program three resolves the limitations of program two, but at a cost of efficiency.");
                    System.out.println("Program three tests using a dictionary, but it tests only one charater at a time.");
                    System.out.println("Technically, this would still be more efficient resource wise compared to method one, but it results in more iterations.");
                    System.out.println("This program can accept full sentences of any length, composed of any set of ascii characters predefined in the code.");
                    System.out.println();
                    System.out.print(brute4.main());
                    break;
                default:
                    System.out.print("Please enter a valid number, 1 through 3.");
                    break;

            }
            System.out.println();
            System.out.print("Would you like to run another program? >");
            String decision = input.nextLine();
            decision = decision.toLowerCase();
            switch(decision)
            {
                case("yes"):
                case("y"):
                case("1"):
                    break;
                case("no"):
                case("n"):
                case("0"):
                    x = 1;
                    break;
            }
        }
        while(x == 0);
    }

}
