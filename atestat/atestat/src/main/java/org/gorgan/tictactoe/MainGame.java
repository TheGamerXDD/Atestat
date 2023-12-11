package org.gorgan.tictactoe;

import com.sun.tools.javac.Main;
import org.gorgan.tictactoe.model.Game;
import org.gorgan.tictactoe.move.Move;
import org.gorgan.tictactoe.player.Player;

import java.util.List;

public class MainGame implements Game {
    Board board;
    Player[] players;

    Player currentPlayer;

    public MainGame(Player player1, Player player2)
    {
        board = new Board();
        players = new Player[]{player1, player2};
        currentPlayer = player1;
    }

    /**
     * Check if the game is over, i.e., there is a winner or no more moves are available.
     *
     * @return whether the game is over
     */
    @Override
    public boolean isGameover() {
        return board.gameOver();
    }

    /**
     * Query whose turn it is
     *
     * @return the player whose turn it is
     */
    @Override
    public Player getTurn() {
        return null;
    }

    /**
     * Get the winner of the game. If the game is a draw, then this method returns null.
     *
     * @return the winner, or null if no player is the winner or the game is not over
     */
    @Override
    public Player getWinner() {
        return null;
    }

    /**
     * Return all moves that are valid in the current state of the game
     *
     * @return the list of currently valid moves
     */
    @Override
    public List<Move> getValidMoves() {
        return null;
    }

    /**
     * Check if a move is a valid move
     *
     * @param move the move to check
     * @return true if the move is a valid move
     */
    @Override
    public boolean isValidMove(Move move) {
        return false;
    }

    /**
     * Perform the move, assuming it is a valid move.
     *
     * @param move the move to play
     */
    @Override
    public void doMove(Move move) {

    }
}
