package Clase1Mundo;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class PrimerPrograma {

	/**
	 * Atributo que lee la entrada del usuario en el teclado
	 */
	private Scanner teclado;
	
//	/**
//	 * Numero a
//	 */
//	private int a;
//	
//	/**
//	 * Numero b
//	 */
//	private int b;
	
	/**
	 * Constructor de la clase PrimerPrograma
	 */
	public PrimerPrograma() {
		teclado = new Scanner(System.in);
		
		/**
		 *  Asignacion de atributo por medio de la palabra reservada "this"
		 *  this: Esta clase, la clase actual.
		 */
		// this.a = a;
		
		/**
		 *  Asignacion de atributo por medio de parametro con distinto nombre
		 */
		// b = pB;
	}
	
	public Scanner darTeclado() {
		return teclado;
	}
	
	//-------------------------------------------------
	// Operadores aritmeticos
	//-------------------------------------------------
	
	/**
	 * Metodo que suma dos numeros que ingresan por parametro
	 * @param a, numero a
	 * @param b, numero b
	 * @return resultado: a + b
	 */
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public String sumarStr(int a, int b) {
		return "La suma es: " + sumar(a, b);
	}
	
	public int restar(int a, int b) {
		return a - b;
	}
	
	public String restarStr(int a, int b) {
		return "La resta es: " + restar(a, b);
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public String multiplicarStr(int a, int b) {
		return "El producto es: " + multiplicar(a, b);
	}
	    
	public int dividir(int a, int b) {
		return a / b;
	}
	
	public String dividirStr(int a, int b) {
		return "El cociente es: " + dividir(a, b);
	}
	
	//-------------------------------------------------
	// Operadores logicos
	//-------------------------------------------------
	
	public boolean and(boolean p, boolean q) {
		return p && q;
	}
	
	
	
	public static void main(String[] args) {
		PrimerPrograma calculadora = new PrimerPrograma();
		
		System.out.println("Ingrese 1er numero: ");
		int a = calculadora.teclado.nextInt();
		
		System.out.println("Ingrese 2do numero: ");
		int b = calculadora.teclado.nextInt();
		
		int equiv = 6;
		
		//System.out.println(calculadora.and(true, true));
		System.out.println(a + " + " + b + " = " + equiv + "?");
		
		System.out.println("\nOpciones: ");
		System.out.println("1.) Verdadero");
		System.out.println("2.) Falso");
		
		String opcion = calculadora.teclado.next();
		
		boolean resp = equiv == calculadora.sumar(a, b);
		
		System.out.println("Respuesta: " + resp);
	}

}
