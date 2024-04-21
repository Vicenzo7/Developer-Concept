package system_design.LLD.TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                PlayingPiece playingPiece = board[i][j];
                if (playingPiece != null) {
                    System.out.print(playingPiece.pieceType.name() + "  ");
                } else {
                    System.out.print("   ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<int[]> getFreeCells() {
        List<int[]> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new int[]{i, j});
                }
            }
        }

        return freeCells;
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {

        if (board[row][col] != null) {
            return false;
        }

        board[row][col] = playingPiece;
        return true;
    }
}
