package com.Chess.engine.player;

import com.Chess.engine.board.Board;
import com.Chess.engine.board.Move;
import com.Chess.engine.pieces.Piece;

import java.util.Collection;

public class BlackPlayer extends Player{
    public BlackPlayer(Board board,
                       Collection<Move> whiteStandardLegalMoves,
                       Collection<Move> blackStandardLegalMoves) {
        super(board, black)
    }

    @Override
    public Collection<Piece> get ActivePieces(){
        return this.board.getBlackPieces();
    }
}
