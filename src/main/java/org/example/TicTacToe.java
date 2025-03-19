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

//    public boolean checkWin(){
//
//    }






    public boolean checkWin() {
        // строки
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // столбцы
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }

        // главную диагональ
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        // Проверяем побочную диагональ
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
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
