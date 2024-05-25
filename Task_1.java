import java.lang.Math;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME IN THE NUMBER GUESSING GAME");
        System.out.println("PRESS 1 TO PLAY THE GAME\nPRESS 2 TO EXIT");
        System.out.println("YOUR CHOICE: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                char ch;
                do {
                    int max, min, random_number;
                    while (true) {
                        System.out.println("Select The Minimum Number In the Range: ");
                        min = sc.nextInt();
                        System.out.println("Select The Maximum Number In the Range: ");
                        max = sc.nextInt();
                        if (min > max) {
                            System.out.println("Error...MINUMUM NUMBER MUST BE GRATER THAN MAXIMUM NUMBER");

                        } else {
                            break;
                        }
                    }
                    random_number = (int) (Math.random() * (max - min + 1) + min);
                    System.out.println("YOU WILL GET 10 CHANCES: ");
                    System.out.println("GAME IS STARTING...");
                    boolean guessed = false;
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("GUESS YOUR NUMBER: ");
                        int guess_number = sc.nextInt();
                        if (guess_number == random_number) {
                            System.out.println("Congratulation!!! You Guess The Correct Number.");
                            System.out.println("Your Score Is: " + (11 - i));
                            guessed = true;
                            break;
                        }

                        else if (guess_number > random_number) {
                            System.out.println("NUMBER IS BIGGER THAN THE RANDOM NUMBER");
                        }

                        else if (guess_number < random_number) {
                            System.out.println("NUMBER IS SMALLER THAN THE RANDOM NUMBER");
                        }
                    }

                    if (!guessed) {
                        System.out.println("NO MORE CHANCES LEFT... COREECT ANSWER: " + random_number);
                    }
                    System.out.println("DO YOU WANT TO PLAY AGAIN: Y/N");
                    ch = sc.next().charAt(0);
                } while (ch == 'Y' || ch == 'y');
                break;

            case 2:
                System.exit(0);

            default:
                System.out.println("PLEASE ENTER A VALID CHOICCE.");
                break;
        }
        System.out.println("THANK YOU FOR PLAYING.");
        sc.close();

    }
}