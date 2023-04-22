import java.util.*;
public class LotterySimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TICKET_PRICE = 4;
        final int JACKPOT_PRIZE = 5000000;
        final int FIVE_MATCH_PRIZE = 5000;
        final int FOUR_MATCH_PRIZE = 1000;
        final int THREE_MATCH_PRIZE = 100;
        final int TWO_MATCH_PRIZE = 10;
        final int ONE_MATCH_PRIZE = 10;
        final int MAX_TICKETS = 100000;

        int totalCost = 0;
        int totalWinnings = 0;
        int totalJackpots = 0;
        int totalFiveMatches = 0;
        int totalFourMatches = 0;
        int totalThreeMatches = 0;
        int totalTwoMatches = 0;
        int totalOneMatch = 0;

        Random random = new Random();
        for (int i = 0; i < MAX_TICKETS; i++) {
            // Buy a ticket with six random numbers
            int[] ticket = new int[6];
            for (int j = 0; j < 6; j++) {
                ticket[j] = random.nextInt(49) + 1;
            }

            // Generate the winning numbers
            int[] winningNumbers = new int[6];
            for (int j = 0; j < 6; j++) {
                winningNumbers[j] = random.nextInt(49) + 1;
            }

            // Determine what prize was won
            int matches = 0;
            for (int j = 0; j < 6; j++) {
                if (ticket[j] == winningNumbers[j]) {
                    matches++;
                }
            }
            switch (matches) {
                case 1:
                case 2:
                    totalWinnings += TWO_MATCH_PRIZE;
                    totalOneMatch++;
                    break;
                case 3:
                    totalWinnings += THREE_MATCH_PRIZE;
                    totalThreeMatches++;
                    break;
                case 4:
                    totalWinnings += FOUR_MATCH_PRIZE;
                    totalFourMatches++;
                    break;
                case 5:
                    totalWinnings += FIVE_MATCH_PRIZE;
                    totalFiveMatches++;
                    break;
                case 6:
                    totalWinnings += JACKPOT_PRIZE;
                    totalJackpots++;
                    break;
                default:
                    break;
            }
            totalCost += TICKET_PRICE;
        }

        int netProfit = totalWinnings - totalCost;
        double profitPercentage = (double) netProfit / totalCost * 100;

        System.out.println("Total tickets purchased: " + MAX_TICKETS);
        System.out.println("Total cost of tickets purchased: $" + totalCost);
        System.out.println("Total winnings: $" + totalWinnings);
        System.out.println("Net profit/loss: $" + netProfit);
        System.out.printf("Profit percentage: %.2f%%\n", profitPercentage);
        System.out.println("Total jackpots won: " + totalJackpots);
        System.out.println("Total five-number matches won: " + totalFiveMatches);
        System.out.println("Total four-number matches won: " + totalFourMatches);
        System.out.println("Total three-number matches won: " + totalThreeMatches);
        System.out.println("Total two-number matches won: " + totalTwoMatches);
    }
}
