package udec.lineaprodfundizacion.pilimorfismo.entities;
/**
 * clse que representa al objeto Skate Board
 * @author Andres Cadena
 *
 */
public class SkateBoard extends Vehicle{
	
	/**
	 * variable quer almacena el Board Length
	 */
	
	private int boardLength;
	
	/**
	 * constructor de la clase
	 * @param brand
	 * @param model
	 * @param boardLendth
	 */
	
	public SkateBoard(String brand, String model, int boardLendth) {
		super(brand, model);
		this.boardLength = boardLendth;
	}
	
	/**
	 * metodo que imprime las variables propias de la clase
	 */
	
	public void printSkateBorad() {
		System.out.println(" BoardLength: " + boardLength);
	}
	
	/**
	 * metodo para obtener el valor de la variable boardLength
	 * @return boardLength 
	 */
	
	public int getBoardLength() {
		return boardLength;
	}
	
	/**
	 * metodo para asignmar valor a la variable boardLength
	 * @param boardLength
	 */
	
	public void setBoardLength(int boardLength) {
		this.boardLength = boardLength;
	}
	
}
