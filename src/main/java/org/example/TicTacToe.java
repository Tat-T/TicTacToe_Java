package org.example;

public class TicTacToe {
    private final char[][] board = new char[3][3];
  //x: true; 0: false;
    private Boolean player = true;
    TicTacToe() {
        newGame();
    }

    private void newGame() {
        for (int i =0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                board [i] [j] = '-';
            }
        }
    }

    public boolean move(Integer row, int cell) {
        if(board[row][cell] == '-') {
            board[row][cell] = player ? 'x' : '0';
            player = !player;
            return true;
        }
        return false;
    }

    public String getBoard() {
        StringBuilder out = new StringBuilder();
        for (char[] row: board){
            for (char cell: row) {
                out.append(cell).append(" ");
            }
            out.append("\n");
        }
        return  out.toString();
    }
}
