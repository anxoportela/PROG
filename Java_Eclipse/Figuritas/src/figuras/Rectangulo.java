package figuras;

public class Rectangulo {

	private double base;
	private double altura;

	protected Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculaArea() {
		return this.base*this.altura;
	}
	
	public double calculaPeri() {
		return 2*(this.base+this.altura);
	}

	public String pintaCuadrado() {
		String salida = "";
		for (int i = 0; i <= altura; i++) {
			for (int j = 0; j <= base*2; j++) {
				if (i == 0 || i == altura) {
					salida += "_";
				} else if (i != 0 && (j == 0 || j == base*2)) {
					salida += "|";
				} else {
					salida += " ";
				}
			}
			salida += "\n";
		}
		return salida;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

}
