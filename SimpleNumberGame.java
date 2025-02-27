import java.util.*;

class SimpleNumberGame {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int num=rand.nextInt(100)+1;
        int tries=0;
        int maxtries=10;
        boolean win=false;
        System.out.println("Guess a number between 1 and 100. You have 10 tries!");

        while(tries<maxtries) {
            System.out.print("Enter your guess: ");
            int guess=sc.nextInt();
            tries++;

            if (guess==num) {
                win=true;
                break;
            } else if(guess<num) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (win) {
            System.out.println("Congratulations! You guessed the number in " + tries + " tries.");
        } else {
            System.out.println("Sorry, you ran out of tries. The number was " + num + ".");
        }

        sc.close();
    }
}