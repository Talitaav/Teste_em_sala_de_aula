package metodo;

public class Metodo {

	public void fullTrottle() {
		System.out.println("O carro está indo o mais rápido que pode");
	}

	public void speed(int maxSpeed) {
		System.out.println("O carro está indo o mais rápido que pode: " + maxSpeed);

	}

	public static void main(String[] args) {
		Metodo myCar = new Metodo();
		myCar.fullTrottle();
		myCar.speed(200);
	}

}
