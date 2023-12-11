package org.gorgan.tictactoe;

public interface Stratergy {
    String getName();
    int determineMove(ss.week5.tictactoe.Board board, Mark mark);
}
