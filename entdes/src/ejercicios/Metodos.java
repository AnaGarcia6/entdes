package ejercicios;

public class Metodos {

	public static void main(String[] args) {
		
		System.out.println(metodo1());
		System.out.println(metodo2(76));
		System.out.println(metodo3('L'));
		
	}

	public static String metodo1 () {

		String var1 = "hola ";

		String var2 = "adios";

		String var3 = var1 + var2;

		return var3;
	}
	
	public static char metodo2 (int var1) {
		
		char var3 = (char) var1;
		return var3;
		
	}
	
	public static int metodo3 (char var1) {
		
		int var3 = (int) var1;
		return var3;
	}
	
}
