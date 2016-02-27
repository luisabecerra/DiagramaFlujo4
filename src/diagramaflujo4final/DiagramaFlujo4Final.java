/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaflujo4final;

import static java.lang.Math.floor;
import java.util.Random;

/**
 *
 * @author Luisa Paola Becerra Pleáez--Juan Camilo Mora Tinoco
 */
public class DiagramaFlujo4Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura=
            new java.util.Scanner(System.in);
        double answer =(double) Math.floor((Math.random()*100)+1);
        String playAgain="y";
            if (playAgain != "y"){
            }
            else{ 
                GuessingGame(answer);
                System.out.println("Would you like to play another game(y/n): ");
                playAgain=lectura.next();
            }
    }
     
    public static int GuessingGame(double answer){   
        java.util.Scanner lectura=
            new java.util.Scanner(System.in);
        answer=floor((Math.random()*100)+1);
        int guess=0;
        int numGuesses=1;
        if (numGuesses>7||(guess==answer)){
            if (numGuesses >7 ){
                System.out.println("You lost");
            }
        }
        else {
            System.out.println("Guess a number");
            guess=lectura.nextInt();
            if (guess<answer){
                System.out.println("Higher...");
            }
            else {
                if (guess>answer){
                    System.out.println("Lower...");
                }
                System.out.println("You won");
            }
            numGuesses=numGuesses+1;
        }
        return 0;
    }
    
     
}
