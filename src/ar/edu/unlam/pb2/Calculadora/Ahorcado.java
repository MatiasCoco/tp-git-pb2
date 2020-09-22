package ar.edu.unlam.pb2.Calculadora;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {

		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado = null;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println(
					"Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para dividir /n 4 para sumar");
			opcion = teclado.nextInt();

		} while (opcion < 1 && opcion > 4);

		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();

		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		switch (opcion) {
		case 1:
			

			break;
		case 2:
			resultado =Ahorcado.resta(a, b);
			break;
		case 3:
			
			break;
		case 4:
			resultado = Ahorcado.suma(a, b);;
			break;

		}

		System.out.println("El resultado es " + resultado.toString());
	}

	private static Integer suma(Integer a, Integer b) {

		Integer resultado;

		resultado = a + b;

		return resultado;
	}
	
	private static Integer resta(Integer a, Integer b) {

		Integer resultado;

		resultado = a - b;

		return resultado;
	}
	
	
	/*respuestas:
	
	1) En el segundo push lo que sucedio fue que cuando quisimos realizarlo nos tiro un error por estar mal parado en el directorio.
	
	2) Antes de realizar el push lo que hicimos fue agregar los cambios realizados con el comando "git add ." y luego utilizamos el comando "git commit -m "second commit"", para luego usar el "git push".
	
	
	
	/*
}
