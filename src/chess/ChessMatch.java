package chess;

import boardgame.Board;

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
}
