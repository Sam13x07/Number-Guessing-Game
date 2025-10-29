
---

## 🔢 **Project 2: Number Guessing Game**

---

### 🧠 **Code: `GuessTheNumber.java`**
```java
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            try {
                userGuess = sc.nextInt();
                attempts++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("❗ Please guess a number between 1 and 100.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                }
            } catch (Exception e) {
                System.out.println("❗ Invalid input. Please enter a number.");
                sc.next(); // clear invalid input
            }
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
