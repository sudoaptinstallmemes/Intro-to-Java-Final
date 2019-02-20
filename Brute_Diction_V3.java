package com.company;

import java.util.Random;
import java.util.Scanner;

public class Brute_Diction_V3 {
    public String main() {

        {
            //Generates dictionary
            String diction = "";
            for (int x = 32; x < 126; x++)//32,126 for full or 97,123 for just lowercase
            {
                diction = diction + (char) x;
            }

            //Input target string.
            System.out.print("Input String: ");
            Scanner input = new Scanner(System.in);
            String word = input.nextLine();

            //Declarations.
            int count = 0;
            Random rand = new Random();
            String dictiontemp = diction;
            String letter;
            boolean isEqual;
            String output = "";

            //Generate output
            for (int z = 0; z < word.length(); z++) {
                do {
                    int a = rand.nextInt((dictiontemp.length()));
                    System.out.println();
                    System.out.println("Number: " + a);
                    System.out.println("TARGET: " + word.substring(z, z + 1));
                    System.out.println();
                    letter = String.valueOf(dictiontemp.charAt(a));
                    dictiontemp = dictiontemp.substring(0, a) + dictiontemp.substring(a + 1);
                    //Neat way of modifying temporary dictionary. Strings can't be edited but this tecnically works.
                    count++;
                    System.out.println(output + letter);
                    System.out.println();
                    System.out.println(dictiontemp);
                    System.out.println();
                    isEqual = letter.equals(word.substring(z, z + 1));
                }
                while (!isEqual);
                output = output + letter;
                dictiontemp = diction;
            }

            System.out.print(output);
            System.out.println();
            System.out.println(count + " Iterations");
            //count represents how many attempts were made.


        }
        return ("");
    }
}


