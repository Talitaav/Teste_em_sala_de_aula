package exemplo;

public class ParametrosdoConstrutor {
	int x;

	public ParametrosdoConstrutor(int y) {
		x = y;
	}

	public static void main(String[] args) {
		ParametrosdoConstrutor myObj = new ParametrosdoConstrutor(5);
		System.out.println(myObj.x);
	}

}
