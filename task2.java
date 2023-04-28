import java.util.Random;
import javax.swing.JOptionPane;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attemptsLeft = 3;
        int score = 0;
        
        while (attemptsLeft > 0) {
            int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number (between 1 and 100):"));
            
            if (guess == numberToGuess) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + (4 - attemptsLeft) + " attempts.");
                score += attemptsLeft;
                break;
            } else if (guess < numberToGuess) {
                JOptionPane.showMessageDialog(null, "The number is higher. You have " + (--attemptsLeft) + " attempts left.");
            } else {
                JOptionPane.showMessageDialog(null, "The number is lower. You have " + (--attemptsLeft) + " attempts left.");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Your final score is " + score + " points.");
    }
}
