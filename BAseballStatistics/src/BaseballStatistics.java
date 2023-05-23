

import java.util.Scanner;

public class BaseballStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int teams = 0; // Counter for the number of teams processed

        while (true) {
            System.out.print("Enter the team id number (or 0 to exit): ");
            int teamId = scanner.nextInt();

            if (teamId == 0) {
                break; // Exit the loop if teamId is 0
            }

            System.out.print("Enter the number of wins: ");
            int wins = scanner.nextInt();

            System.out.print("Enter the number of losses: ");
            int losses = scanner.nextInt();

            System.out.println("\nTeam " + teamId);
            System.out.println(wins + " wins   " + losses + " losses");

            int totalGamesPlayed = wins + losses;
            int gamesRemaining = 25 - totalGamesPlayed;

            System.out.println("Total number of games played is " + totalGamesPlayed);

            if (totalGamesPlayed == 25) {
                System.out.println("The season is finished.");
            } else {
                System.out.println(gamesRemaining + " games remaining");
            }

            double winningAverage = (double) wins / totalGamesPlayed;
            System.out.printf("The winning average is %.4f\n", winningAverage);

            System.out.print("Number of games remaining is ");
            if (gamesRemaining >= wins) {
                System.out.println("greater than or equal to the number won");
            } else {
                System.out.println("not greater than the number won");
            }

            System.out.print("Number of games remaining is ");
            if (gamesRemaining > losses) {
                System.out.println("greater than the number lost");
            } else {
                System.out.println("not greater than or equal to the number lost");
            }

            System.out.println("\n");
            teams++;
        }

        System.out.println("Total number of teams: " + teams);
    }
}
