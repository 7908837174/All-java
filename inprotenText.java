// import java.util.Scanner;

// public class ImportTex {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);  
//         System.out.println("Enter Your Name:");
//         String name = sc.nextLine();  
//         System.out.println("Enter Your Age:");
//         int age = sc.nextInt();  
//         System.out.println("Hello, " + name + "! You are " + age + " years old.");
//         sc.close();  
//     }
// }
//     import java.util.Random;
// import java.util.Scanner;

// public class NumberGuessingGame {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();
        
//         int numberToGuess = random.nextInt(100) + 1;
//         int numberOfTries = 0;
//         boolean hasGuessedCorrectly = false;

//         System.out.println("Welcome to the Number Guessing Game!");
//         System.out.println("I'm thinking of a number between 1 and 100.");

//         while (!hasGuessedCorrectly) {
//             System.out.print("Enter your guess: ");
//             int playerGuess = scanner.nextInt();
//             numberOfTries++;

//             if (playerGuess < 1 || playerGuess > 100) {
//                 System.out.println("Please guess a number between 1 and 100.");
//             } else if (playerGuess < numberToGuess) {
//                 System.out.println("Too low! Try again.");
//             } else if (playerGuess > numberToGuess) {
//                 System.out.println("Too high! Try again.");
//             } else {
//                 hasGuessedCorrectly = true;
//                 System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
//             }
//         }

//         scanner.close();
//     }
// }

/**
 * importTex
 */
class Loix {
    public static void main(String[] args) {
        int i = 34;
        do {
            System.out.println(i);
            i++;
        } while (i < 40); 
        System.out.println("Get out of the loop");
    }
}



