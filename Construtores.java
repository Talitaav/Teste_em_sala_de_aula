package exemplo;

public class Celular {
	String marca;
	String modelo;
	float tamanho;
	float preco;

	public Celular() {
		marca = "Motorola";
		modelo = "Moto G";
		tamanho = 6.5f;
		preco = 2.000f;
	}

	public static void main(String[] args) {
		Celular c = new Celular();

		System.out.println("A marca do celular adquirido é: " + c.marca);
		System.out.println("O modelo do celular adquirido é: " + c.modelo);
		System.out.println("O tamanho do celular adquirido é: " + c.tamanho);
		System.out.println("o preço do celular adquirido é: " + c.preco);
	}

}
