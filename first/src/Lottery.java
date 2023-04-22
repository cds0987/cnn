
    import java.util.*;

    public class Lottery {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Buy a ticket with six random numbers
            int[] ticket = new int[6];
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                ticket[i] = random.nextInt(49) + 1;
            }
            System.out.println("Your ticket is: " + Arrays.toString(ticket));

            // Generate the winning numbers
            int[] winningNumbers = new int[6];
            for (int i = 0; i < 6; i++) {
                winningNumbers[i] = random.nextInt(49) + 1;
            }
            System.out.println("The winning numbers are: " + Arrays.toString(winningNumbers));

            // Determine what prize you won
            int matches = 0;
            for (int i = 0; i < 6; i++) {
                if (ticket[i] == winningNumbers[i]) {
                    matches++;
                }
            }
            switch (matches) {
                case 1:
                case 2:
                    System.out.println("You won a small prize of $10.");
                    break;
                case 3:
                    System.out.println("You won a small prize of $100.");
                    break;
                case 4:
                    System.out.println("You won a bigger prize of $1000.");
                    break;
                case 5:
                    System.out.println("You won an even bigger prize of $5000.");
                    break;
                case 6:
                    System.out.println("You won the jackpot of $5 million in cash!");
                    break;
                default:
                    System.out.println("Sorry, you didn't win a prize.");
                    break;
            }
        }
    }

