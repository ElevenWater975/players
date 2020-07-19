public class Players {
    boolean canPlay;
    double playerCount;
    String game;

    public Players(boolean playable, double players, String videoGame) {
        if (playerCount < 2) {
            System.out.println("You cannot play this game with less than 2 people");
        } else {
            System.out.println("Ready to play?");
        }
        canPlay = playable;
        playerCount = players;
        game = videoGame; 
    }

    public void games() {
        if (canPlay) {
            System.out.println("Ready?");
        } else {
            System.out.println("You need 2 or more people to play");
        }


        System.out.println("Player count: ");
        System.out.println(playerCount);
    }
}