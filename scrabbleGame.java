
// Objective: To calculate and compare the scores of 2 players to find the Winner in a scrabble game.

import java.util.Scanner;
public class scrabbleGame
{
public static void main(String[] args) {
       
        //Taking 2 Input Strings from the User
       
        Scanner sc = new Scanner(System.in);
       
        String stringPlayer1 = null;
        String stringPlayer2 = null;
       
        System.out.print("Player 1: ");
        stringPlayer1 = sc.next();
       
        System.out.print("Player 2: ");
        stringPlayer2 = sc.next();
       
        // Condition to check whether input string is valid choice or not
       
        char inputCheckPlayer1 = 0;
        char inputCheckPlayer2 = 0;
       
        for(int k=0;k<stringPlayer1.length();k++){
       
        inputCheckPlayer1 = stringPlayer1.charAt(k);
        inputCheckPlayer2 = stringPlayer2.charAt(k);
               
        if(Character.isLetter(inputCheckPlayer1) && Character.isLetter(inputCheckPlayer2)){
            playerScoreCalculator(stringPlayer1, stringPlayer2);
            break;
        }
        else{
            System.out.println("Invalid Input");
            break;
        }
        }
}

//Method to calculate and compare the Scores of Player 1 and Player 2

    public static void playerScoreCalculator(String stringPlayer1, String stringPlayer2){
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
       
        //Convert the input strings to Uppercase Strings
       
        String updatedStringPlayer1 = stringPlayer1.toUpperCase();
        String updatedStringPlayer2 = stringPlayer2.toUpperCase();
       
        //Player 1 Score Line
       
        for(int i=0;i<updatedStringPlayer1.length();i++){
           
            if(updatedStringPlayer1.charAt(i)=='A' || updatedStringPlayer1.charAt(i)=='E' || updatedStringPlayer1.charAt(i)=='I' || updatedStringPlayer1.charAt(i)=='L'|| updatedStringPlayer1.charAt(i)=='N'|| updatedStringPlayer1.charAt(i)=='O'|| updatedStringPlayer1.charAt(i)=='R'|| updatedStringPlayer1.charAt(i)=='S'|| updatedStringPlayer1.charAt(i)=='T'|| updatedStringPlayer1.charAt(i)=='U'){
                scorePlayer1=scorePlayer1+1;
            }
            else if(updatedStringPlayer1.charAt(i)=='D' || updatedStringPlayer1.charAt(i)=='G'){
                scorePlayer1=scorePlayer1+2;
            }
            else if(updatedStringPlayer1.charAt(i)=='B' || updatedStringPlayer1.charAt(i)=='C'|| updatedStringPlayer1.charAt(i)=='M'|| updatedStringPlayer1.charAt(i)=='P'){
                scorePlayer1=scorePlayer1+3;
            }
            else if(updatedStringPlayer1.charAt(i)=='F' || updatedStringPlayer1.charAt(i)=='H'|| updatedStringPlayer1.charAt(i)=='V'|| updatedStringPlayer1.charAt(i)=='W'| updatedStringPlayer1.charAt(i)=='Y'){
                scorePlayer1=scorePlayer1+4;
            }
            else if(updatedStringPlayer1.charAt(i)=='K'){
                scorePlayer1=scorePlayer1+5;
            }
            else if(updatedStringPlayer1.charAt(i)=='J' || updatedStringPlayer1.charAt(i)=='X'){
                scorePlayer1=scorePlayer1+8;
            }
            else if(updatedStringPlayer1.charAt(i)=='Q' || updatedStringPlayer1.charAt(i)=='Z'){
                scorePlayer1=scorePlayer1+10;
            }
            else{
                scorePlayer1=scorePlayer1+0;
            }
           
        }
       
        //Player 2 Score Line
       
        for(int j=0;j<updatedStringPlayer2.length();j++){
           
            if(updatedStringPlayer2.charAt(j)=='A' || updatedStringPlayer2.charAt(j)=='E' || updatedStringPlayer2.charAt(j)=='I' || updatedStringPlayer2.charAt(j)=='L'|| updatedStringPlayer2.charAt(j)=='N'|| updatedStringPlayer2.charAt(j)=='O'|| updatedStringPlayer2.charAt(j)=='R'|| updatedStringPlayer2.charAt(j)=='S'|| updatedStringPlayer2.charAt(j)=='T'|| updatedStringPlayer2.charAt(j)=='U'){
                scorePlayer2=scorePlayer2+1;
            }
            else if(updatedStringPlayer2.charAt(j)=='D' || updatedStringPlayer2.charAt(j)=='G'){
                scorePlayer2=scorePlayer2+2;
            }
            else if(updatedStringPlayer2.charAt(j)=='B' || updatedStringPlayer2.charAt(j)=='C'|| updatedStringPlayer2.charAt(j)=='M'|| updatedStringPlayer2.charAt(j)=='P'){
                scorePlayer2=scorePlayer2+3;
            }
            else if(updatedStringPlayer2.charAt(j)=='F' || updatedStringPlayer2.charAt(j)=='H'|| updatedStringPlayer2.charAt(j)=='V'|| updatedStringPlayer2.charAt(j)=='W'| updatedStringPlayer2.charAt(j)=='Y'){
                scorePlayer2=scorePlayer2+4;
            }
            else if(updatedStringPlayer2.charAt(j)=='K'){
                scorePlayer2=scorePlayer2+5;
            }
            else if(updatedStringPlayer2.charAt(j)=='J' || updatedStringPlayer2.charAt(j)=='X'){
                scorePlayer2=scorePlayer2+8;
            }
            else if(updatedStringPlayer2.charAt(j)=='Q' || updatedStringPlayer2.charAt(j)=='Z'){
                scorePlayer2=scorePlayer2+10;
            }
            else{
                scorePlayer2=scorePlayer2+0;
            }
        }
       
        //Comparison between Scores of Player 1 and Player 2 to find the Winner
       
        if(scorePlayer1>scorePlayer2){
            System.out.println("Player 1 Wins!");
        }
        else if(scorePlayer1<scorePlayer2){
            System.out.println("Player 2 Wins!");
        }
        else{
            System.out.println("Tie!");
        }
}
}

    /*SAMPLE OUTPUT:
    Player 1: COMPUTER
    Player 2: science
    Player 1 Wins!*/
