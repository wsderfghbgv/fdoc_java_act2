package com.example;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== WHILE ===");
		// 1) Imprimir números del 1 al 10 validando límites antes de cada iteración
		int i = 1;
		int limite = 10;
		while (i <= limite) {
			// validación simple de límites antes de usar el valor
			if (i < 1 || i > limite) {
				break;
			}
			System.out.println(i);
			i++;
		}

		// 2) Acumular la suma de 1 a n
		System.out.print("Ingrese n para sumar 1..n: ");
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		} else {
			// consumir entrada inválida
			sc.next();
			System.out.println("Entrada inválida, se usará n=0");
		}
		int suma = 0;
		int contador = 1;
		while (contador <= n) {
			suma += contador;
			contador++;
		}
		System.out.println("Suma de 1 a " + n + " = " + suma);

		// 3) Buscar si un número está en un arreglo; detener al encontrarlo
		int[] arregloBusqueda = {3, 7, 1, 9, 5};
		System.out.print("Ingrese número a buscar en el arreglo: ");
		int buscado = 0;
		if (sc.hasNextInt()) {
			buscado = sc.nextInt();
		} else {
			sc.next();
			System.out.println("Entrada inválida, se asumirá buscado=0");
		}
		boolean encontrado = false;
		int idx = 0;
		while (idx < arregloBusqueda.length) {
			if (arregloBusqueda[idx] == buscado) {
				encontrado = true;
				break; // detener al encontrar
			}
			idx++;
		}
		System.out.println(encontrado ? "Número encontrado en índice " + idx : "Número no encontrado");

		System.out.println("\n=== DO-WHILE ===");
		// 1) Menú interactivo que se muestra al menos una vez y termina al elegir '3 - Salir'
		int opcion;
		do {
			System.out.println("Menú:\n1) Saludar\n2) Mostrar fecha y hora\n3) Salir");
			System.out.print("Elija opción: ");
			if (sc.hasNextInt()) {
				opcion = sc.nextInt();
			} else {
				sc.next();
				opcion = -1;
			}
			switch (opcion) {
				case 1:
					System.out.println("¡Hola!");
					break;
				case 2:
					System.out.println("Fecha y hora: " + new Date());
					break;
				case 3:
					System.out.println("Saliendo del menú...");
					break;
				default:
					System.out.println("Opción inválida");
			}
		} while (opcion != 3);

		// 2) Leer números hasta que el usuario ingrese 0; mostrar suma acumulada
		int numero;
		int sumaAcumulada = 0;
		do {
			System.out.print("Ingrese un número (0 para terminar): ");
			if (sc.hasNextInt()) {
				numero = sc.nextInt();
			} else {
				sc.next();
				numero = 0;
			}
			sumaAcumulada += numero;
		} while (numero != 0);
		System.out.println("Suma acumulada: " + sumaAcumulada);

		// 3) Validación de contraseña que se ejecuta al menos una vez y repite hasta acertar
		final String CLAVE = "1234"; // clave de ejemplo
		String intento;
		do {
			System.out.print("Ingrese la contraseña: ");
			intento = sc.next();
			if (!CLAVE.equals(intento)) {
				System.out.println("Contraseña incorrecta. Intente nuevamente.");
			}
		} while (!CLAVE.equals(intento));
		System.out.println("Contraseña correcta.");

		System.out.println("\n=== FOR ===");
		// 1) Imprimir números pares del 2 al 20 usando incremento apropiado
		System.out.println("Números pares del 2 al 20:");
		for (int p = 2; p <= 20; p += 2) {
			System.out.print(p + " ");
		}
		System.out.println();

		// 2) Calcular factorial de un número ingresado
		System.out.print("\nIngrese un número para calcular su factorial: ");
		int factN = 0;
		if (sc.hasNextInt()) {
			factN = sc.nextInt();
		} else {
			sc.next();
			System.out.println("Entrada inválida, se usará 0");
		}
		long factorial = 1;
		if (factN < 0) {
			System.out.println("Factorial no definido para números negativos");
		} else {
			for (int f = 1; f <= factN; f++) {
				factorial *= f;
			}
			System.out.println(factN + "! = " + factorial);
		}

		// 3) Sumar elementos de un arreglo de enteros usando un contador en el ciclo
		int[] arregloEnteros = {2, 4, 6, 8, 10};
		int sumaArreglo = 0;
		for (int j = 0; j < arregloEnteros.length; j++) {
			sumaArreglo += arregloEnteros[j];
		}
		System.out.println("Suma del arreglo: " + sumaArreglo);

		System.out.println("\n=== FOR-EACH ===");
		// 1) Recorrer un arreglo de enteros y calcular la suma
		int sumaForEach = 0;
		for (int v : arregloEnteros) {
			sumaForEach += v;
		}
		System.out.println("Suma con for-each: " + sumaForEach);

		// 2) Listar cada palabra de una colección de cadenas predefinida
		String[] palabras = {"manzana", "banana", "cereza"};
		System.out.println("Listado de palabras:");
		for (String w : palabras) {
			System.out.println(w);
		}

		// 3) Calcular promedio de un arreglo de calificaciones y mostrar con dos decimales
		double[] calificaciones = {4.0, 3.5, 2.8, 4.7};
		double sumaCal = 0.0;
		for (double c : calificaciones) {
			sumaCal += c;
		}
		double promedio = sumaCal / calificaciones.length;
		System.out.printf("Promedio: %.2f%n", promedio);

		System.out.println("\n=== BREAK y CONTINUE ===");
		// 1) Break en un for para detener al cumplir condición específica
		System.out.println("Ejemplo break (detener al llegar a 5):");
		for (int b = 1; b <= 10; b++) {
			if (b == 5) {
				System.out.println("Break en " + b);
				break;
			}
			System.out.println("b = " + b);
		}

		// 2) Continue para omitir procesamiento de elementos que cumplan condición
		System.out.println("\nEjemplo continue (omitir múltiplos de 3):");
		for (int c = 1; c <= 10; c++) {
			if (c % 3 == 0) {
				continue;
			}
			System.out.println(c);
		}

		// 3) Combinar break y continue: omitir pares, detener al alcanzar un umbral de impares procesados
		System.out.println("\nCombinar break y continue (procesar impares hasta 5 impresiones):");
		int impresos = 0;
		for (int x = 1; x <= 20; x++) {
			if (x % 2 == 0) {
				continue; // omitir pares
			}
			System.out.println("Impar: " + x);
			impresos++;
			if (impresos >= 5) {
				System.out.println("Umbral alcanzado, deteniendo");
				break;
			}
		}

		sc.close();
	}
}

