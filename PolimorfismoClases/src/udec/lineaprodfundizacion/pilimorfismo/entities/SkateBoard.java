package udec.lineaprodfundizacion.pilimorfismo.entities;

public class SkateBoard extends Vehicle{
	
	private int boardLength;
	
	public SkateBoard(String brand, String model, int boardLendth) {
		super(brand, model);
		this.boardLength = boardLendth;
	}
	
	public void printSkateBorad() {
		System.out.println(" BoardLength: " + boardLength);
	}
	
	/**
	 * getters y setters de las variables de la clase
	 */
	
	public int getBoardLength() {
		return boardLength;
	}

	public void setBoardLength(int boardLength) {
		this.boardLength = boardLength;
	}
	
}
