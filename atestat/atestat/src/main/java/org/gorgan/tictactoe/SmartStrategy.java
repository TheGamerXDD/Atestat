package org.gorgan.tictactoe;

import java.util.stream.IntStream;

public class SmartStrategy implements Stratergy {
    @Override
    public String getName() {
        return "smart";
    }

    @Override
    public int determineMove(Board board, Mark mark) {
        //1. If the middle field is empty, this field is selected
        int middle = (Board.DIM * Board.DIM - 1) / 2;
        if (board.isEmptyField(middle)) {
            return middle;
        }

        //2. If there is a field that guarantees a direct win, this field is selected
        int win = win(board, mark);
        if (win != -1) {
            return win;
        }

        //3. If there is a field with which the opponent could win, this field is selected.
        int defend = win(board, mark.other());
        if (defend != -1) {
            return defend;
        }

        //4. If none of the cases above applies, a random field is selected
        return selectRandom(board);
    }

    private int win(Board board, Mark mark) {
        Board tempBoard = board.deepCopy();
        for (int i = 0; i < Board.DIM * Board.DIM; i++) {
            if (!tempBoard.isEmptyField(i)) {
                continue;
            }

            tempBoard.setField(i, mark);
            if (tempBoard.isWinner(mark)) {
                return i;
            }

            tempBoard.setField(i, Mark.EMPTY);
        }

        return -1;
    }

    private int selectRandom(Board board) {
        var empty = IntStream.range(0, Board.DIM * Board.DIM)
                .filter(board::isEmptyField)
                .toArray();

        int idx = (int) (Math.random() * (empty.length - 1));
        return empty[idx];
    }
}
