package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkmate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	
	public ChessMatch() {
		this.board = new Board(8, 8);
		initialSetup();
	}


	public int getTurn() {
		return turn;
	}


	public void setTurn(int turn) {
		this.turn = turn;
	}


	public Color getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(Color currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


	public boolean getCheck() {
		return check;
	}


	public void setCheck(boolean check) {
		this.check = check;
	}


	public boolean getCheckmate() {
		return checkmate;
	}


	public void setCheckmate(boolean checkmate) {
		this.checkmate = checkmate;
	}


	public ChessPiece getEnPassantVulnerable() {
		return enPassantVulnerable;
	}


	public void setEnPassantVulnerable(ChessPiece enPassantVulnerable) {
		this.enPassantVulnerable = enPassantVulnerable;
	}


	public ChessPiece getPromoted() {
		return promoted;
	}


	public void setPromoted(ChessPiece promoted) {
		this.promoted = promoted;
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
