package com.Chess.engine.player;

import com.Chess.engine.board.Board;
import com.Chess.engine.board.Move;
import com.Chess.engine.pieces.King;

import java.util.Collection;

public abstract class Player {

    protected final Board board;
    protected final King playerKing;
    protected final Collection<Move> legalMoves;

    protected Player(Board board, King playerKing,Collection<Move> legalMoves) {
        this.board = board;
        this.playerKing = playerKing;
        this.legalMoves = legalMoves;
    }
    private King establishKing(){
        for(final Piece piece : getActivePieces()){
            if(piece.getPieceType().isKing()){
                return (King) piece;
            }
        }
    }
    public abstract Collection<>
}
