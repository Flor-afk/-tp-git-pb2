package ar.edu.unlam.github.dom;

import java.util.Scanner;

public class CalculadoraTest {

	final static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Hola esta es mi branch");
		Integer a;
		Integer b;
		Integer opcion;
		
		do{
			
		System.out.println("Ingrese su operación \n1 para sumar \n2 para restar \n3 para multiplicar \n4 para dividir");
		opcion = teclado.nextInt();
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		switch(opcion) {
		
		case 1:
			sumar(a, b);
			break;
		case 2:
			restar(a, b);
			break;
		case 3:
			multiplicar(a, b);
			break;
		case 4:
			dividir(a, b);
			break;
		}
		}while(opcion < 1 && opcion > 4);
	}

	private static void dividir(Integer a, Integer b) {
		Integer resultado;
		resultado = a / b;
		System.out.println("El resultado es " + resultado.toString());
	}

	private static void multiplicar(Integer a, Integer b) {
		Integer resultado;
		resultado = a * b;
		System.out.println("El resultado es " + resultado.toString());
	}

	private static void restar(Integer a, Integer b) {
		Integer resultado;
		resultado = a - b;
		System.out.println("El resultado es " + resultado.toString());
	}

	private static void sumar(Integer a, Integer b) {
		Integer resultado;
		resultado = a + b;
		System.out.println("El resultado de la suma es " + resultado.toString());
	}
}
