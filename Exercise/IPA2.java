//TCS IPA sample questions

package b1.Exercise;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;


class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}

public class IPA2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("PLayer ID: ");
            int playerId = sc.nextInt();
            sc.nextLine();
            System.out.print("PLayer Name: ");
            String playerName = sc.nextLine();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            sc.nextLine();
            System.out.print("PLayer Type: ");
            String playerType = sc.nextLine();
            System.out.print("Match Type: ");
            String matchType = sc.nextLine();

            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }
        System.out.print("PLayer Type to Search: ");
        String playerTypeSearch = sc.nextLine();
        System.out.print("Match Type to Search: ");
        String matchTypeSearch = sc.nextLine();

        int lowestRuns = findPlayerWithLowestRuns(players, playerTypeSearch);
        if (lowestRuns > 0) {
            System.out.println(lowestRuns);
        } else {
            System.out.println("Such player");
        }

        Player[] playersByMatchType = findPlayerByMatchType(players, matchTypeSearch);
        if (playersByMatchType != null) {
            for (Player player : playersByMatchType) {
                System.out.println(player.getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();

    }
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int minRuns = Integer.MAX_VALUE;
        boolean playerFound = false;

        for (Player player : players) {
            if (player.getPlayerType().equalsIgnoreCase(playerType)) {
                playerFound = true;
                if (player.getRuns() < minRuns) {
                    minRuns = player.getRuns();
                }
            }
        }

        return playerFound ? minRuns : 0;
    }

    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        ArrayList<Player> matchedPlayers = new ArrayList<>();

        for (Player player : players) {
            if (player.getMatchType().equalsIgnoreCase(matchType)) {
                matchedPlayers.add(player);
            }
        }

        if (matchedPlayers.isEmpty()) {
            return null;
        }

        matchedPlayers.sort(Comparator.comparingInt(Player::getPlayerId).reversed());

        return matchedPlayers.toArray(new Player[0]);
    }
}

