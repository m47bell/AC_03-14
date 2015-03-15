package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/14/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class exitTicket {
    public static void main(String[] args){



        for (int numGuess=0;numGuess<=5;numGuess++){


            System.out.println("guess a number:");
            Scanner input = new Scanner(System.in);
           int userGuess= input.nextInt();

            if (userGuess > 1 && userGuess <=9){
                System.out.println("Your guess is too low.");
            }

            else if (userGuess > 11 && userGuess <= 20){
                System.out.println("Your guess is too high.");
            }

            else {
                System.out.println("Congrats! you guessed it.");
            }


        }



    }




}
