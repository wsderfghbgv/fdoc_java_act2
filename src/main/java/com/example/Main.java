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

		// === VARIABLES, TIPOS Y OPERADORES (ADICIONALES) ===
		// Declaración simple y muestra
		int entero = 100;
		System.out.println("int entero = " + entero);

		// Declaración y asignación en una sola línea de double
		double miDouble = 3.1415;
		System.out.println("double miDouble = " + miDouble);

		// String simple
		String texto = "Hola desde Main";
		System.out.println("String: " + texto);

		// Tipos primitivos completos
		byte tb = 10;
		short ts = 3000;
		int ti = 50000;
		long tl = 1_000_000_000L;
		float tf = 2.5f;
		double td = 6.28;
		boolean tbool = true;
		char tchar = 'Z';
		System.out.println("byte=" + tb + " short=" + ts + " int=" + ti + " long=" + tl + " float=" + tf + " double=" + td + " boolean=" + tbool + " char=" + tchar);

		// Arreglo int[] tamaño 3
		int[] arr3 = new int[3];
		arr3[0] = 7;
		arr3[1] = 14;
		arr3[2] = 21;
		System.out.println("Arreglo int[3]: " + Arrays.toString(arr3));

		// Clase Persona local y uso (definida dentro de main para mantener todo en main)
		class Persona {
			String nombre;
			int edad;
			Persona(String n, int e) { this.nombre = n; this.edad = e; }
			public String toString() { return nombre + " (" + edad + " años)"; }
		}
		Persona p = new Persona("Mariana", 28);
		System.out.println("Persona creada: " + p);

		// Operadores aritméticos básicos
		int a = 10, b2 = 3;
		System.out.println("a + b = " + (a + b2));
		System.out.println("a - b = " + (a - b2));
		System.out.println("a * b = " + (a * b2));
		System.out.println("a / b (entera) = " + (a / b2));
		System.out.println("a / b (decimal) = " + ((double)a / b2));
		System.out.println("a % b = " + (a % b2));

		// Incremento / Decremento
		int inc = 5;
		System.out.println("inc = " + inc);
		inc++;
		System.out.println("inc++ -> " + inc);
		++inc;
		System.out.println("++inc -> " + inc);
		inc--;
		System.out.println("inc-- -> " + inc);

		// Operadores de asignación
		int asum = 10;
		asum += 5; // 15
		System.out.println("asum += 5 -> " + asum);
		asum -= 3; // 12
		System.out.println("asum -= 3 -> " + asum);
		int amul = 4;
		amul *= 3; // 12
		System.out.println("amul *= 3 -> " + amul);
		amul /= 2; // 6
		System.out.println("amul /= 2 -> " + amul);
		int amod = 10;
		amod %= 3; // 1
		System.out.println("amod %= 3 -> " + amod + " (resto de división)");

		// Operadores de comparación
		System.out.println("a == b? " + (a == b2));
		System.out.println("a != b? " + (a != b2));
		System.out.println("a > b? " + (a > b2));
		System.out.println("a < b? " + (a < b2));
		System.out.println("a >= b? " + (a >= b2));
		System.out.println("a <= b? " + (a <= b2));

		// Operadores lógicos
		boolean p1 = true, p2 = false;
		System.out.println("p1 && p2 = " + (p1 && p2));
		System.out.println("p1 || p2 = " + (p1 || p2));
		System.out.println("!p1 = " + (!p1));
		System.out.println("(p1 || p2) && (a > b) = " + ((p1 || p2) && (a > b2)));

		// If simples
		if (a > b2) {
			System.out.println("a es mayor que b2");
		}

		// If-else
		if (a % 2 == 0) {
			System.out.println("a es par");
		} else {
			System.out.println("a es impar");
		}

		// If-else if-else para tres rangos
		int numRange = 7;
		if (numRange < 5) {
			System.out.println(numRange + " es pequeño");
		} else if (numRange <= 10) {
			System.out.println(numRange + " es medio");
		} else {
			System.out.println(numRange + " es grande");
		}

		// Operador ternario
		int edad = 20;
		String mayor = (edad >= 18) ? "mayor de edad" : "menor de edad";
		System.out.println("Edad " + edad + ": " + mayor);

		int cantidad = 12;
		double descuento = (cantidad > 10) ? 0.1 : 0.0;
		System.out.println("Descuento aplicado: " + (descuento * 100) + "%");

		int numT = 7;
		String parImpar = (numT % 2 == 0) ? "par" : "impar";
		System.out.println(numT + " es " + parImpar);

		// Switch: día -> número
		String dia = "Martes";
		switch (dia.toLowerCase()) {
			case "lunes":
				System.out.println(dia + " -> 1");
				break;
			case "martes":
				System.out.println(dia + " -> 2");
				break;
			case "miercoles":
			case "miércoles":
				System.out.println(dia + " -> 3");
				break;
			case "jueves":
				System.out.println(dia + " -> 4");
				break;
			case "viernes":
				System.out.println(dia + " -> 5");
				break;
			default:
				System.out.println(dia + " -> día desconocido o fin de semana");
		}

		// Switch: calificación numérica a texto (agrupando casos)
		int grade = 9;
		switch (grade) {
			case 10:
			case 9:
				System.out.println("Calificación: Excelente");
				break;
			case 8:
				System.out.println("Calificación: Muy bueno");
				break;
			case 7:
				System.out.println("Calificación: Bueno");
				break;
			case 6:
				System.out.println("Calificación: Suficiente");
				break;
			default:
				System.out.println("Calificación: Insuficiente");
		}

		// Switch: estación del año según número
		int est = 3;
		switch (est) {
			case 1:
				System.out.println("Invierno");
				break;
			case 2:
				System.out.println("Primavera");
				break;
			case 3:
				System.out.println("Verano");
				break;
			case 4:
				System.out.println("Otoño");
				break;
			default:
				System.out.println("Número de estación inválido");
		}

		// Otros ejemplos: positivo/negativo/cero
		int valor = -5;
		if (valor > 0) {
			System.out.println(valor + " es positivo");
		} else if (valor < 0) {
			System.out.println(valor + " es negativo");
		} else {
			System.out.println(valor + " es cero");
		}

		// Validar contraseña (comparación directa simple)
		String claveEsperada = "abc123";
		String clavePrueba = "abc123";
		System.out.println("Clave válida? " + claveEsperada.equals(clavePrueba));

		// Clasificar una calificación con if-else if-else
		double nota = 7.5;
		if (nota < 5.0) {
			System.out.println("Insuficiente");
		} else if (nota < 7.0) {
			System.out.println("Suficiente");
		} else if (nota < 9.0) {
			System.out.println("Bueno");
		} else {
			System.out.println("Excelente");
		}

		sc.close();
	}
}

