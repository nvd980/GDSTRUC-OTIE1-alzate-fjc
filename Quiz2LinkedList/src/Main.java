public class Main {
    public static void main(String[] args) {
        PlayerLinkedList playerList = new PlayerLinkedList();

        playerList.add(new Player(1, "Lumi", 500));
        playerList.add(new Player(2, "Matthias", 999));
        playerList.add(new Player(3, "Béatrice", 10));

        playerList.printList();

        System.out.println("\n\nNumber of players: " + playerList.size());

        System.out.println("Is [Matthias] here? : " +
                playerList.contains(new Player(2, "Matthias", 999)));

        System.out.println("Index: " +
                playerList.indexOf(new Player(2, "Matthias", 999)));

        Player removedPlayer = playerList.remove();

        System.out.println("\nRemoved player: " + removedPlayer);

        System.out.println("\nAfter removing [Lumi]:");
        playerList.printList();

        System.out.println("\n\nNumber of players now: " + playerList.size());
    }
}
