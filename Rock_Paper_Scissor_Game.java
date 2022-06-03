package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0-Rock, 1-Paper , 2-Scissor:");
        int userInput = sc.nextInt();

        int compInput = random.nextInt(3);              // Bound only take +ve values and index starts from 1

        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        if(userInput == compInput)
        {
            System.out.println("Draw");
        }
        else if((userInput == 0 & compInput == 2 || userInput == 1 & compInput == 0  || userInput == 2 & compInput == 1))
        {
            System.out.println("You Wins!");
        }
        else
            System.out.println("Computer Wins!");

        System.out.println("Computer Input : "+compInput);

    }
}
