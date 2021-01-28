package com.Abduvaliev;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private String playerLetter;
    private String opponentLetter;


    public RockPaperScissors() {
        Player();
        Opponent();
        WinOrLose();
    }

    private void Player () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors");
        System.out.println("Enter r for Rock, p for Paper, or s for Scissors");
        String gameLetter = scanner.next();
        if (gameLetter.equals("r")) {
            playerLetter = gameLetter;
            System.out.println("vs");
        } else if (gameLetter.equals("p")) {
            playerLetter = gameLetter;
            System.out.println("vs");
        } else if (gameLetter.equals("s")) {
            playerLetter = gameLetter;
            System.out.println("vs");
        } else {
            System.out.println("Invalid input");
        }
    }

    private void Opponent () {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum == 0) {
            opponentLetter = "r";
            System.out.println(opponentLetter);
        } else if (randomNum == 1) {
            opponentLetter = "p";
            System.out.println(opponentLetter);
        } else if (randomNum == 2) {
            opponentLetter = "s";
            System.out.println(opponentLetter);
        }
    }

    private void WinOrLose () {
        if (playerLetter.equals(opponentLetter)) {
            System.out.println("Tie");
        } else if ((playerLetter.equals("r") && opponentLetter.equals("p"))
                || (playerLetter.equals("s") && opponentLetter.equals("r"))
                || (playerLetter.equals("p") && opponentLetter.equals("s"))) {
            System.out.println("You Lost. Better luck next time.");
        } else if ((playerLetter.equals("r") && opponentLetter.equals("s"))
                || (playerLetter.equals("p") && opponentLetter.equals("r"))
                || (playerLetter.equals("s") && opponentLetter.equals("p"))) {
            System.out.println("You won");
        }
    }
}
