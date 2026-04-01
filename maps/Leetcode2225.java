package maps;

import java.util.*;

public class Leetcode2225 {

    public static void main(String args[]) {

        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};

        findWinners(matches);

        //Output: [[1,2,10],[4,5,7,8]]
    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lostMap = new HashMap<>();
        Set<Integer> allPlayers = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            allPlayers.add(winner);
            allPlayers.add(loser);

            lostMap.put(loser, lostMap.getOrDefault(loser, 0) + 1);
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int player : allPlayers) {
            int losses = lostMap.getOrDefault(player, 0);
            if (losses == 0) {
                noLoss.add(player);
            } else if (losses == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(noLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(noLoss);
        ans.add(oneLoss);
        return ans;
    }
}