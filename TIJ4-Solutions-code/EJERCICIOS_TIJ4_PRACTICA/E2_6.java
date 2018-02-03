package EJERCICIOS_TIJ4_PRACTICA;

public class E2_6 {
	
	static String s = "ne";
	static String ss = "neneeee!";
	int storage(String s) {		
		return s.length() * 2;
	}													
	
	void print() {		
		System.out.println(storage(s));	
	}
	
	public static void hola() {
		
		System.out.println("Hola nene");
		E2_6.ss = "qué pazaaaaa!";
	}

	public static void main (String[] args) {
		
		String t = "222";
		E2_6 miE2_6 = new E2_6();
		miE2_6.print();
		System.out.println(miE2_6.storage(t));
		System.out.println(E2_6.ss);
		hola();
		System.out.println(E2_6.ss);
		System.out.println(s+"1");
		System.out.println(E2_6.s+"2");
		System.out.println(miE2_6.s+"3");
		
		//		
	}
	

}
 