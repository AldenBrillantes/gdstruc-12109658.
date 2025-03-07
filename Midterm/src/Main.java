import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        CardStack playerDeck = new CardStack();
        String[] cardNames = {"Spade", "Club", "Heart", "Diamond"};

        for (int i = 0; i < 30; i++)
            playerDeck.push(new Card(cardNames[r.nextInt(4)], (r.nextInt(14) + 1)));

        CardStack discardedStack = new CardStack();

        int round = 1;

        while (!playerDeck.isEmpty()) {
            System.out.println("Round: " + round);
            System.out.println();

            System.out.println("List of Commands:");
            System.out.println("Draw a x amount of cards (1-5)");
            System.out.println("Discard x cards (1-5)");
            System.out.println("Get x cards from the discarded pile (1-5)");

            System.out.println();

            int action = (discardedStack.isEmpty()) ? r.nextInt(2) : r.nextInt(3);
            int numCards = r.nextInt(5) + 1;

            switch (action) {
                case 0:
                    if (playerDeck.countCards() < 5)
                        numCards = r.nextInt(playerDeck.countCards()) + 1;
                    System.out.println("The player drew " + numCards + " cards.");

                    for (int i = 0; i < numCards; i++)
                        playerDeck.push(new Card(cardNames[r.nextInt(4)], (r.nextInt(14) + 1)));
                    break;
                case 1:
                    if (playerDeck.countCards() < 5)
                        numCards = r.nextInt(playerDeck.countCards()) + 1;
                    System.out.println("The player discarded " + numCards + " cards.");

                    for (int i = 0; i < numCards; i++)
                        discardedStack.push(playerDeck.pop());
                    break;
                case 2:
                    if (discardedStack.countCards() < 5)
                        numCards = r.nextInt(discardedStack.countCards()) + 1;
                    System.out.println("The player got " + numCards + " cards from the discarded pile.");

                    for (int i = 0; i < numCards; i++)
                        playerDeck.push(discardedStack.pop());
            }

            System.out.println();
            System.out.println("GAME INFO");
            System.out.println("Current Player Deck:");

            playerDeck.printStack();

            System.out.println();

            System.out.println("Number of Remaining Cards in Player Deck: " + playerDeck.countCards());
            System.out.println("Number of Cards in Discarded Pile: " + discardedStack.countCards());
            System.out.println("Press enter to continue...");

            s.nextLine();

            round++;
        }

        s.close();
    }
}