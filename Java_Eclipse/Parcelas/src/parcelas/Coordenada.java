package parcelas;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class Coordenada {

	private int coordX;
	private int coordY;

	public Coordenada(int coordX) {
		this.coordX = coordX;
	}

	public Coordenada(int coordX, int coordY) {
		this(coordX);
		this.coordY = coordY;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

}
