package org.aprendiendoaprogramar.mundo;

public class ClasePersona {

	/**
	 * Es la edad de la persona
	 */
	private int edad;

	/**
	 * Nombre
	 */
	private String nombre;

	/**
	 * Genero
	 */
	private String genero;

	/**
	 * metodo constructor de la clase. Instrucciones de como crear una instancia de la Clase.
	 * @param paramEdad, parmetro de asignacion del atributo edad
	 * @param paramNombre, parametro de asignacion del atributo nombre
	 * @param paramGenero, parametro de adignacion del atributo genero
	 */
	public ClasePersona(int paramEdad, String paramNombre, String paramGenero) {
		edad = paramEdad;
		nombre  = paramNombre;
		genero = paramGenero;
	}

	/**
	 * metodo que hce que retorne dato que quiero y en la que se desea
	 * @return Retrona los datos en el formato
	 * 			"Edad: " + (edad) + "\n" +
	 *			"Nombre: " + (nombre) + "\n" +
	 *			"Genero: " + (genero)
	 */
	public String darDatos() {
		return "Edad: " + edad + "\n" +
				"Nombre: " + nombre + "\n" +
				"Genero: " + genero;
	}

	/**
	 * Metodo Main
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * creacion de la instancia p1 basado en la clase clasePersona.
		 * 
		 * para crear una instancia se usa la palabra reservada "new"
		 * y se invoca el metodo constructor
		 */
		ClasePersona p1 = new ClasePersona(55, "juan carlos", "masculino");

		/**
		 * creacion de la instancia p2 basado en la clase clasePersona.
		 * 
		 * para crear una instancia se usa la palabra reservada "new"
		 * y se invoca el metodo constructor
		 */
		ClasePersona p2 = new ClasePersona(32, "carlitos", "indefinido");

		//		System.out.println(p1.edad);
		//		System.out.println(p1.nombre);
		//		System.out.println(p1.genero);

		//		System.out.println("");

		//		System.out.println(p2.edad);
		//		System.out.println(p2.nombre);
		//		System.out.println(p2.genero);

		/**
		 * se imprime los datos de la instancia p2 segun el metodo "darDatos()" declarado en la clase clasePersona.
		 * de esta forma se reducen las lineas de codigo a compracion de las lineas impresas arriba
		 */
		System.out.println(p2.darDatos());
	}

}
