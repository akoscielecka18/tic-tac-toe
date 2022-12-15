package TicTacToe;

public class BoardClass {
    public boolean isGameOver(char[][] board, char symbol) {

        if ((board[0][0] == symbol) && (board[0][1] == symbol) && (board[0][2] == symbol) ||
                (board[1][0] == symbol) && (board[1][1] == symbol) && (board[1][2] == symbol) ||
                (board[2][0] == symbol) && (board[2][1] == symbol) && (board[2][2] == symbol) ||

                (board[0][0] == symbol) && (board[1][0] == symbol) && (board[2][0] == symbol) ||
                (board[0][1] == symbol) && (board[1][1] == symbol) && (board[2][1] == symbol) ||
                (board[0][2] == symbol) && (board[1][2] == symbol) && (board[2][2] == symbol) ||

                (board[0][0] == symbol) && (board[1][1] == symbol) && (board[2][2] == symbol) ||
                (board[0][2] == symbol) && (board[1][1] == symbol) && (board[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    static boolean isATie(char[][] board){

        if(
                ((board[0][0] == 'X') || (board[0][0] == 'O')) && ((board[0][1] == 'X') || (board[0][1] == 'O')) && ((board[0][2] == 'X') || (board[0][2] == 'O')) &&
                        ((board[1][0] == 'X') || (board[1][0] == 'O')) && ((board[1][1] == 'X') || (board[1][1] == 'O')) && ((board[1][2] == 'X') || (board[1][2] == 'O')) &&
                        ((board[2][0] == 'X') || (board[2][0] == 'O')) && ((board[2][1] == 'X') || (board[2][1] == 'O')) && ((board[2][2] == 'X') || (board[2][2] == 'O'))){
            return true;
        }

        return false;
    }

}
