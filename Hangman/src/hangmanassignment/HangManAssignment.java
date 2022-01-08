/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanassignment;

// Import keyboard scanner
import java.util.Scanner;

/**
 *
 * @author 335462040
 */
public class HangManAssignment {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // ICS3U
        // Olivia Ye
        // Assignment 2: Hangman

        // Call on keyboard scanner for player input
        Scanner keyboard = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to Hangman.");

        // Inputted secret word from player 1, the hidden word in '-' shown to player 2
        String secretWord, dashWord;
        // Position of player 2's guessed letter: in the secret word, in the alphabet indez
        int positionGuess, positionAlfabet;
        // Position of player 2's letter within the secret word and the length of the full secret word
        int findPos, lengthWord;
        // Alphabet index
        String alfabet;
        // Player 2's letter guess
        char letter;
        // Running count of tries (max 8)
        int numOfTries;
        // Status on running game
        char gameAnswer = 'y';
        // Empty lines 
        int space;

        // Do-while loop that plays the entire game while the player's answer is 'y'
        do {
            // Prompts player 1 to enter a secret word
            System.out.print("Player 1, please enter a secret word (max 8 letters): ");
            secretWord = keyboard.nextLine();
            lengthWord = secretWord.length();
            // Resets the number of tries to 8 at the beginning of every runthrough
            numOfTries = 8;
            // Resets the index of the word to zero
            findPos = 0;

            // Print out spaces between player 1's input and player 2's guess to prevent cheating
            for (space = 25; space != 0; space--) {
                System.out.println("");
            }

            // Sets another variable to equal secretWord so secretWord remains unchanged
            dashWord = secretWord;
            // While loop to replace all the letters in the secret word to dashes, stored in dashWord
            while (findPos != lengthWord) {
                dashWord = (dashWord.substring(0, findPos++) + "-" + dashWord.substring(findPos, lengthWord));
            }

            System.out.println("Player 2, this is the secret word: " + dashWord);
            // Resets and displays the index that the player will choose letters from
            alfabet = ("abcdefghijklmnopqrstuvwxyz");
            System.out.println("This is your index: " + alfabet);

            // While loop to allow the player to guess letters while the game answer is 'y'
            while (gameAnswer == 'y') {
                // Prompts player 2 to input a letter
                System.out.print("\n" + "Player 2, please guess a letter: ");
                letter = Character.toLowerCase(keyboard.nextLine().charAt(0));
                // Checks the index of the guessed letter in the secretWord and alfabet
                positionGuess = (int) secretWord.indexOf(letter);
                positionAlfabet = (int) alfabet.indexOf(letter);

                // If statement to check if the letter is NOT in the secretWord, updates the index, and decreases & displays number of tries left
                if (positionGuess == -1 || positionAlfabet == -1) {
                    numOfTries--;
                    System.out.println("\n" + "Wrong guess. You have " + numOfTries + " tries left.");
                    // Print off various stages of the hangman visual at different numbers of tries
                    switch (numOfTries) {
                        case 7:
                            System.out.println("\n" + "   ______");
                            System.out.println("  |      ");
                            System.out.println("  |   ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 6:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |   ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 5:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |      O");
                            System.out.println("  |       ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 4:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |      O");
                            System.out.println("  |      |");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 3:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |      O");
                            System.out.println("  |      |/");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 2:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |      O");
                            System.out.println("  |     \\|/");
                            System.out.println("  |       ");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 1:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |      O");
                            System.out.println("  |     \\|/");
                            System.out.println("  |       \\");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                        case 0:
                            System.out.println("   ______");
                            System.out.println("  |      |");
                            System.out.println("  |      O");
                            System.out.println("  |     \\|/");
                            System.out.println("  |     / \\");
                            System.out.println("  |");
                            System.out.println("------" + "\n");
                            break;
                    }

                    // If statement to update the index by replacing the letter with a '/' IF it has not already been replaced    
                    if (positionGuess == -1 && positionAlfabet != -1) {
                        alfabet = (alfabet.substring(0, positionAlfabet++)) + "/" + (alfabet.substring(positionAlfabet, 26));
                    }

                    System.out.println(dashWord);
                    System.out.println("Here is your updated index: " + alfabet);
                } 
                // Else statment to replace the dash word with the correct letter and update the index
                else {
                    // While statement to replace the dash word with the letter (used to check for ALL occurances of the letter in the word)
                    while (positionGuess != -1) {
                        dashWord = (dashWord.substring(0, positionGuess++) + letter + dashWord.substring(positionGuess, lengthWord));
                        positionGuess = secretWord.indexOf(letter, positionGuess);
                    }
                    // Updates the index with the inputted letter
                    System.out.println("\n" + dashWord);
                    alfabet = (alfabet.substring(0, positionAlfabet++)) + "/" + (alfabet.substring(positionAlfabet, 26));
                    System.out.println("Here is your updated index: " + alfabet);
                }

                // Checks at the end of each inputted letter to see if they guessed the full word or ran out of tries
                if (dashWord.equals(secretWord) || numOfTries == 0) {
                    gameAnswer = 'n';
                }
            }

            // Displays different text depending on win/loss
            if (dashWord.equals(secretWord)) {
                System.out.println("\n" + "Governer called! You are saved. Player 2 has won.");
            } 
            else {
                System.out.println("\n" + "Hangman! Player 2 has lost.");
            }

            // Asks the player if they would like to play again
            System.out.print("Would you like to play again? (y/n): ");
            gameAnswer = Character.toLowerCase(keyboard.nextLine().charAt(0));
            System.out.println(" ");

            // Checks the keyboard input for y/n and prompts to re-enter if they did not specifically enter (y/n)
            while (gameAnswer != 'y' && gameAnswer != 'n') {
                System.out.print("Invalid input. Please enter again (y/n): ");
                gameAnswer = keyboard.nextLine().charAt(0);
                System.out.println(" ");
            }
        } while (gameAnswer == 'y'); // Will play the game again if the answer is 'y'

        // Closing remarks, if they chose 'n'
        System.out.println("Thanks for playing!");
    }
}
