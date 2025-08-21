//1. Generate a random number within a specified range, such as 1 to 100.

import java.util.*;
import java.util.Random;
public class RandomNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();
        int number = rm.nextInt(100) + 1;
        System.out.println("Random number between 1 to 100 is:"+number);
    }
}
Output:-
Random number between 1 to 100 is:98


//2.Prompt the user to enter their guess for the generated number.

import java.util.*;
public class GuessNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your guess number:");
        int guess=sc.nextInt();
        System.out.println("Your Guessed is:"+guess);
    }
    
}

Output:-
Enter your guess number:
45
Your Guessed is:45

//3. Compare the user's guess with the generated number and provide feedback on whether the guess
 is correct, too high, or too low.

import java.util.*;
import java.util.Random;
public class NumberGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();
         int number = rm.nextInt(100) + 1;
         
        System.out.println("Enter your guess number(1-100):");
        int guess=sc.nextInt();
       if(guess==number){
           System.out.println("Correct!! You entered the right one:)");
       }
           else if(guess>number){
               System.out.println("Aww!! You entered too high!!");
           }
               else{
                   System.out.println("You entered too low!!");
               }
               System.out.println("The number was:"+number);
    } 
}

Output:-
Enter your guess number(1-100):
7
You entered too low!!
The number was:20

// 4.Repeat steps 2 and 3 until the user guesses the correct number

import java.util.*;
import java.util.Random;
  public class NumberGame{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int number = rm.nextInt(100) + 1;
        
        int guess = 0; 
        System.out.println("Guess the number between 1 and 100!");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
            } else if (guess>number) {
                System.out.println("Aww!! You entered too high!!");
            } else {
                System.out.println("You entered too low!!");
            }
        }
        System.out.println("The number was:"+number);

    }
}


Output:
Guess the number between 1 and 100!
Enter your guess: 78
Aww!! You entered too high!!
Enter your guess: 32
You entered too low!!
Enter your guess: 66
Aww!! You entered too high!!
Enter your guess: 44
Aww!! You entered too high!!
Enter your guess: 35
Correct! You guessed the number.
The number was:35

// 5. Limit the number of attempts the user has to guess the number.

import java.util.*;
import java.util.Random;
  public class NumberGame{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int number = rm.nextInt(100) + 1;
        int attempts=0;
        int maxAttempts=5;

        while (attempts<maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
            } else if (guess>number) {
                System.out.println("Aww!! You entered too high!!");
            } else {
                System.out.println("You entered too low!!");
            }
        }
        if(attempts==maxAttempts){
        System.out.println("Attempts reach out:( the number was:"+number);
        
        }
    }
}

Output:-
Enter your guess: 40
You entered too low!!
Enter your guess: 45
You entered too low!!
Enter your guess: 50
You entered too low!!
Enter your guess: 60
Aww!! You entered too high!!
Enter your guess: 51
You entered too low!!
Attempts reach out:( the number was:56



// 6.Add the option for multiple rounds, allowing the user to play again.

import java.util.*;
import java.util.Random;
  public class NumberGame{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        boolean playagain=true;
        
        while(playagain){
        int number = rm.nextInt(100) + 1;
        int attempts=0;
        int maxAttempts=5;
        
        while (attempts<maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
            } else if (guess>number) {
                System.out.println("Aww!! You entered too high!!");
            } else {
                System.out.println("You entered too low!!");
            }
        }
        if(attempts==maxAttempts){
        System.out.println("Attempts reach out:( the number was:"+number);
        }
        System.out.println("Do you want to play again?(yes/no):");
        String response = sc.next().toLowerCase();
        if(!response.equals("yes")){
            playagain = false; 
            System.out.println("Thanks for playing!");
         }
    }
}
}

Output:-
Enter your guess: 43
Aww!! You entered too high!!
Enter your guess: 30
Aww!! You entered too high!!
Enter your guess: 12
You entered too low!!
Enter your guess: 23
Aww!! You entered too high!!
Enter your guess: 16
Aww!! You entered too high!!
Attempts reach out:( the number was:13
Do you want to play again?(yes/no):
yes
Enter your guess: 67
Aww!! You entered too high!!
Enter your guess: 32
You entered too low!!
Enter your guess: 52
You entered too low!!
Enter your guess: 62
You entered too low!!
Enter your guess: 67
Aww!! You entered too high!!
Attempts reach out:( the number was:66
Do you want to play again?(yes/no):
no
Thanks for playing!

//7. Display the user's score, which can be based on the number of attempts taken or rounds won.

import java.util.*;
import java.util.Random;
  public class NumberGame{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        
        boolean playagain=true;
        int score = 0;
        
        while(playagain){
        int number = rm.nextInt(100) + 1;
        int attempts=0;
        int maxAttempts=5;
        
        while (attempts<maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
                 score++;
                 break;
            } 
            else if (guess>number) {
                System.out.println("Aww!! You entered too high!!");
            } 
            else {
                System.out.println("You entered too low!!");
            }
        }
        if(attempts==maxAttempts){
        System.out.println("Attempts reach out:( the number was:"+number);
        }
        System.out.println("Your score (rounds won): " +score);
        System.out.println("Do you want to play again?(yes/no):");
        String response = sc.next().toLowerCase();
        
        if(!response.equals("yes")){
            playagain = false; 
            System.out.println("Thanks for playing Final Score: " +score);
         }
    }
}
}

Output:-
Enter your guess: 43
Aww!! You entered too high!!
Enter your guess: 23
You entered too low!!
Enter your guess: 34
Aww!! You entered too high!!
Enter your guess: 31
Aww!! You entered too high!!
Enter your guess: 29
Aww!! You entered too high!!
Attempts reach out:( the number was:25
Your score (rounds won): 0
Do you want to play again?(yes/no):
yes
Enter your guess: 45
You entered too low!!
Enter your guess: 52
You entered too low!!
Enter your guess: 56
You entered too low!!
Enter your guess: 89
You entered too low!!
Enter your guess: 95
Aww!! You entered too high!!
Attempts reach out:( the number was:94
Your score (rounds won): 0
Do you want to play again?(yes/no):
no
Thanks for playing Final Score: 0

