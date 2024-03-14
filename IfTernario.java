package ifternario;

public class IfTernario {
	
	public static void main(String[] args) {
		
		int numero = 15;
		
		String resposta = numero<16 ?"Não pode votar":numero<18 ? "Voto opcional":"Voto obrigátorio";
		
		System.out.println(resposta);
		
	}

}
