package org.gorgan.tictactoe.move;

/**
 * A move in a turn-based game.
 */
public interface Move {
    int getRow();

    int getColumn();
}
