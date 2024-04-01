package exemplo;

public class Parametros {
	static void myMethod(String sobrenome) {
		System.out.println(sobrenome + " Antunes");
	}
	
	public static void main(String[] args) {
		myMethod("Minha cachorra chama leleca");
		myMethod("Também tenho um gato que se chama timão");
		myMethod("Não poderia esquecer do meu peixe... Afonso");
	}
}
