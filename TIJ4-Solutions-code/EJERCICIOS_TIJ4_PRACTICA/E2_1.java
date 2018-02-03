/*(2) Cree una clase que contenga una variable int y otra char que no estén inicializadas e imprima sus valo¬
res para verificar que Java se encarga de realizar una inicialización predeterminada.*/

package EJERCICIOS_TIJ4_PRACTICA;

public class E2_1{
	
	int i;
	char c;

	public E2_1(){
		System.out.println("i="+i);
		System.out.println("c= " + "["+ c + ']');
	}
	
	public static void main(String[] args) {
		new E2_1();
	}
}