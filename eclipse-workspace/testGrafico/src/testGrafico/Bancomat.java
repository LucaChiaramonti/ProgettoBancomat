package testGrafico;

public class Bancomat {
	
	public static boolean verificaPin(String pin2) {
		if (pin2.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
	}
}
