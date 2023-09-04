public class Circulo implements Comparable<Circulo> {
	private double coordX;
	private double coordY;
	private double raio;

	public Circulo(double coordX, double coordY, double raio) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.raio = raio;
	}

	public double circuferencia() {
		double circu;
		circu = (2 * Math.PI) * this.raio;
		return circu;
	}

	public double area() {
		double area;
		area = Math.PI * Math.pow(this.raio, 2);
		return area;
	}

	public double volume() {
		double volume;
		volume = Math.PI * Math.pow(this.raio, 2);
		return volume;
	}

	public void novo(double x, double y) {
		this.coordX = x;
		this.coordY = y;
	}

	public int compareTo(Circulo x) {
		if (this.raio > x.raio) {
			return 1;
		} else if (this.raio < x.raio) {
			return -1;
		}

		else {
			return 0;
		}
	}
	public String toString() {
		return "\ncoordX: "+ this.coordX + "\ncoordY: "+ this.coordY + "\nRaio: "+ this.raio;
	}

}
