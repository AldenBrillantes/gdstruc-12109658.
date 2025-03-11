import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        PlayerQueue queue = new PlayerQueue(20);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int GameCount = 0;
        int PlayerId = 1;

        while (GameCount < 10) {
            int newPlayers = random.nextInt(7) + 1;
            System.out.println("Match Found! Now adding " + newPlayers + " new players.");

            for (int i = 0; i < newPlayers; i++) {
                queue.enqueue(new Player(PlayerId, "Player " + PlayerId, random.nextInt(1000) + 1));
                PlayerId++;
            }

            queue.PrintQueue();
            System.out.println();

            if (queue.size() >= 5) {
                System.out.println("Starting a New Game with 5 players!");
                for (int i = 0; i < 5; i++) {
                    System.out.println(queue.dequeue());
                }
                GameCount++;
                System.out.println("Games played: " + GameCount);
            }

            System.out.println("[Press Enter to End Game]");
            scanner.nextLine();
        }

        System.out.println("10 Games have been Completed. Now Ending Matchmaking.");
        scanner.close();
    }
}