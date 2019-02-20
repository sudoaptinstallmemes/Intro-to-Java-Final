package com.company;

import java.util.Random;
import java.util.Scanner;

public class Brute_Diction_V2 {
    public String main() {
    {


        System.out.print("Input a single character: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        //Generates dictionary
        String diction = "";
        for(int x = 32; x<126; x++)//32,126 for full or 97,123 for just lowercase
        {
            diction = diction+(char)x;
        }

        String dictionfull = "";
        int bound = 0;
        for(int x = 0; x<word.length(); x++)
        {
            dictionfull =dictionfull+diction;
            bound++;
        }
        System.out.println("BOUND: "+bound);
        System.out.println(dictionfull);
        int count = 0;
        String temp;
        char[] current = new char[word.length()];
        Random rand = new Random();
        int x;
        int y;

        do {
            for (x = 0; x < word.length(); x++)
            {
                if (current[x] != word.charAt(x))
                {
//                    int z = rand.nextInt((diction.length())+(diction.length()*(bound-1)));
                    int z = rand.nextInt((dictionfull.length()));
                    current[x] = dictionfull.charAt(z);
                    dictionfull = dictionfull.substring(0,z)+dictionfull.substring(z+1);
                }
                else
                {
                    diction = "";
                    for(int p = 97; p<123; p++)//32,126 for full or 97,123 for just lowercase
                    {
                        diction = diction+(char)x;
//                        System.out.println("MAERSK  "+(char)x);
                    }
                }
            }
            temp ="";
            for (y = 0; y<current.length; y++)
                temp+=current[y];
            System.out.println(temp);
            count++;
            System.out.println();
            System.out.println(dictionfull);
            System.out.println();
        }
        while (!temp.equals(word));
        System.out.println();
        System.out.println("Output: "+temp);
        System.out.println();
        System.out.println(count+" Iterations");
        System.out.println();
        System.out.println("Unused Characters: "+dictionfull);

    }
    return("");
}
}

