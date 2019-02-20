package com.company;

import java.util.*;
import java.util.Scanner;

public class helloWorld {
//    public static void main(String [] args)

        public String main() {


        System.out.print("Input String: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        //inputs string


        int count = 0;
        String temp;
        char[] current = new char[word.length()];
        Random rand = new Random();
        int x;
        int y;
        do {
            for (x = 0; x < word.length(); x++) {
                if (current[x] != word.charAt(x)) {
                    current[x] = (char) (rand.nextInt(91) + 32);
                    //Completely random, does not check against a list of previous attempts.

                }
            }
            temp = "";
            for (y = 0; y < current.length; y++)
                temp += current[y];
            System.out.println(temp);
            count++;

        } while (!temp.equals(word));
        System.out.println();
        System.out.println(count + " Iterations");
        return("");
    }
    }

