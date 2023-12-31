package com.Chess.engine.pieces;

import com.Chess.engine.Alliance;
import com.Chess.engine.board.Board;
import com.Chess.engine.board.Move;

import java.util.Collection;

public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;

    Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
        //TODO more work here
        this.isFirstMove = false;
    }

    public int getPiecePosition(){
        return this.piecePosition;
    }
    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }

    public boolean isFirstMove(){
        return this.isFirstMove;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);

    public enum PieceType{
        PAWN("P"),
        KNIGHT("N"),
        BISHOP("B"),
        ROOK("R"),
        QUEEN("Q"),
        KING("K");


        private String pieceName;

        PieceType(final String pieceName){
            this.pieceName = pieceName;
        }
        @Override
        public String toString(){
            return this.pieceName;
        }
    }

}