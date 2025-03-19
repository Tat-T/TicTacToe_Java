package org.example;

public class Main<T extends Comparable<T>> {
    public static void main(String[] args) {
TicTacToe game = new TicTacToe();
game.move(0, 0);
game.move(1,1);
game.move(0,1);
System.out.println(game.getBoard());
    }
//    private T maxOf(T a, T b, T c) {
//        return Stream
//                .of(a, b, c)
//                .max(Comparator.naturalOrder())
//                .orElse(null);
//
}