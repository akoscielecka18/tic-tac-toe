package TicTacToeTests;

import TicTacToe.BoardClass;
import TicTacToe.WinDefeatTie;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WinDefeatTieTests {

    @Test
    void oWinInRow(){
        //given
        char[][] board = new char[3][3];
        BoardClass boardClass = new BoardClass();
        boardClass.isGameOver( board, 'O');
        if((board[0][0] == 'O') && (board[0][1] == 'O') && (board[0][2] == 'O') ||
                (board[1][0] == 'O') && (board[1][1] == 'O') && (board[1][2] == 'O') ||
                (board[2][0] == 'O') && (board[2][1] == 'O') && (board[2][2] == 'O'));
        //when
        WinDefeatTie winDefeatTie = new WinDefeatTie();
        //then
        assertEquals(true, winDefeatTie.isGameFinished(board));

    }
}
