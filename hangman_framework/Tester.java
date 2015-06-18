import java.util.Scanner;

public class Tester{

    public static void main(String [] args){
        System.out.println("Enter the word to guess");
        Scanner scan = new Scanner(System.in);
        String inputWord = scan.nextLine();

        String lettersGuessed= "";
        Board board = new Board(inputWord);

        String input = "";

        boolean correct = false;
        int remaining_lives = board.getLives();

        while (remaining_lives  > 0 || board.allLettersFilled()){ /* FIX THIS WHILE LOOP CONDITION */
                remaining_lives = board.getLives();
                System.out.println("Number of Lives: "  + remaining_lives);
                if(remaining_lives == 6){
                    System.out.println(Hangman.base());
                }
                if(remaining_lives == 5){
                    System.out.println(Hangman.strikeOne());
                }
                if(remaining_lives == 4){
                    System.out.println(Hangman.strikeTwo());
                }
                if(remaining_lives == 3){
                    System.out.println(Hangman.strikeThree());
                }
                if(remaining_lives == 2){
                    System.out.println(Hangman.strikeFour());
                }
                if(remaining_lives == 1){
                    System.out.println(Hangman.strikeFive());
                }
                if(remaining_lives == 0){
                    System.out.println(Hangman.strikeSix());
                    System.out.println("You Lose");
                    break;
                }
                else if(remaining_lives > 0 && board.allLettersFilled()){
                    System.out.println("You Win!");
                    break; 
                }
                if(input.equals("5")){
                    //if the player types in "5", we will respond by displaying the original player input. 
                    System.out.println(inputWord);
                }
                if(input.equals("4")){
                    System.out.println("CAMP STEAM ROCKS!!!");
                } 
                if(input.equals("6")){
                    System.out.println("Created by: Deen Hussain 2015"); 
                }
                /**
             *
             *
             * ENTER YOUR CODE HERE
             *
             */

            if(!board.getIncorrectGuesses().equals("\n")){
                System.out.println("Letters Guessed: " + board.getIncorrectGuesses());
            }

            System.out.println(board.toString());
            System.out.println("Enter your guess");

            input = scan.nextLine();
            input = input.substring(0,1);

            correct = board.setMove(input);
            board.updateNumberOfLives(correct);

            if(!correct){
                lettersGuessed += input + " ";
            }
        }

        if(!correct){
            System.out.println(Hangman.strikeSix());
        }
        else{
            System.out.println(board.toString());
            System.out.println("VICTORY!");
        }
       

    }
}
