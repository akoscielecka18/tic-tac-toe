package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class BoardClass {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();

    public static boolean isGameOver() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l: winning){
            if(playerPositions.containsAll(l)){
                System.out.println("Congratulations you won");
                return true;
            }else if(playerPositions.size() == 9){
                System.out.println("It's a tie");
                return true;
            }
        }
        return false;
    }
}
