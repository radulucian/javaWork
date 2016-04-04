package exercise4;

/**
 * 
 * @author aandrei
 *
 */
class PointCoordinates {

	private int coordX, coordY;

	public PointCoordinates(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public int getCoordX() {
		return coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	// Custom toString() Method.
	@Override
	public String toString() {
		return "Coordinates [coordX, coordY] = [" + this.coordX + ", " + this.coordY + "]";
	}
}

public class ToStringExample {
	public static void main(String args[]) {
		PointCoordinates point = new PointCoordinates(10, 10);
		// using the Default Object.toString() Method
		System.out.println("Object toString() method : " + point);
		// implicitly call toString() on object as part of string concatenation
		String objectStringRepresentation = point + " demo";
		System.out.println(objectStringRepresentation);
	}
}
