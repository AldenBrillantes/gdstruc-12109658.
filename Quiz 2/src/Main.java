
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();

        Player heathCliff = new Player(1, "HeathCliff", 100);
        Player asuna = new Player(2, "Asuna", 20);
        Player lethalBacon = new Player(3, "LethalBacon", 30);
        Player hpDeskJet = new Player(4, "HPDeskJet", 15);

        PlayerLinkedList linkedList = new PlayerLinkedList();

        linkedList.addToFront(hpDeskJet);
        linkedList.addToFront(lethalBacon);
        linkedList.addToFront(asuna);
        linkedList.addToFront(heathCliff);

        System.out.println("Before Removal: ");
        linkedList.printList();

        boolean HeathCliffExists = linkedList.contains(heathCliff);
        int HeathCliffIndex = linkedList.indexOf(heathCliff);
        System.out.println("Heathcliff Exists? " + HeathCliffExists + " At Index: " + HeathCliffIndex);

        linkedList.removeFront();
        System.out.println("=============================================================");


        System.out.println("After Removal: ");
        linkedList.printList();

        HeathCliffExists = linkedList.contains(heathCliff);
        HeathCliffIndex = linkedList.indexOf(heathCliff);
        System.out.println("Heathcliff Exists? " + HeathCliffExists + " At Index: " + HeathCliffIndex);



    }

}
