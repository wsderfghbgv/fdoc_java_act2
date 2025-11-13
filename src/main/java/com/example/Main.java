package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIOS DE ARRAYLIST ===\n");
        
        System.out.println("--- Ejercicio 1: Creación y Operaciones Básicas ---");
        ejercicio1();
        
        System.out.println("\n--- Ejercicio 2: Eliminación de Elementos ---");
        ejercicio2();
        
        System.out.println("\n--- Ejercicio 3: Recorrido con For Tradicional ---");
        ejercicio3();
        
        System.out.println("\n--- Ejercicio 4: Recorrido con For-Each ---");
        ejercicio4();
        
        System.out.println("\n--- Ejercicio 5: Iterator para Eliminación Segura ---");
        ejercicio5();
        
        System.out.println("\n--- Ejercicio 6: Métodos de Búsqueda ---");
        ejercicio6();
        
        System.out.println("\n--- Ejercicio 7: Ordenamiento de ArrayList ---");
        ejercicio7();
        
        System.out.println("\n--- Ejercicio 8: Operaciones con removeIf ---");
        ejercicio8();
        
        System.out.println("\n--- Ejercicio 9: Conversión a Arreglo ---");
        ejercicio9();
        
        System.out.println("\n--- Ejercicio 10: Sistema de Gestión de Estudiantes ---");
        ejercicio10();
    }
    
    // Ejercicio 1: Creación y Operaciones Básicas con ArrayList
    public static void ejercicio1() {
        // Crear ArrayList de String
        List<String> frutas = new ArrayList<>();
        
        // Añadir frutas
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");
        
        // Insertar "Uva" en la posición 2
        frutas.add(2, "Uva");
        
        // Obtener y mostrar la primera fruta
        System.out.println("Primera fruta (índice 0): " + frutas.get(0));
        
        // Modificar la fruta en posición 3
        frutas.set(3, "Kiwi");
        
        // Mostrar tamaño
        System.out.println("Tamaño de la lista: " + frutas.size());
        
        // Imprimir toda la lista
        System.out.println("Lista de frutas: " + frutas);
    }
    
    // Ejercicio 2: Eliminación de Elementos
    public static void ejercicio2() {
        // Crear ArrayList con números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(20);
        
        System.out.println("Lista inicial: " + numeros);
        
        // Eliminar elemento en posición 2
        numeros.remove(2);
        System.out.println("Después de eliminar posición 2: " + numeros);
        
        // Eliminar primera aparición del número 20
        numeros.remove(Integer.valueOf(20));
        System.out.println("Después de eliminar primer 20: " + numeros);
        
        // Verificar si contiene 40
        System.out.println("¿Contiene 40?: " + numeros.contains(40));
        
        // Mostrar tamaño final
        System.out.println("Tamaño final: " + numeros.size());
        
        // Imprimir lista resultante
        System.out.println("Lista resultante: " + numeros);
    }
    
    // Ejercicio 3: Recorrido con For Tradicional
    public static void ejercicio3() {
        // Crear ArrayList con nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Elena");
        
        // Recorrer con for tradicional
        int conteo = 0;
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición [" + i + "]: " + nombres.get(i));
            if (nombres.get(i).length() > 4) {
                conteo++;
            }
        }
        
        // Mostrar conteo de nombres con más de 4 caracteres
        System.out.println("Nombres con más de 4 caracteres: " + conteo);
    }
    
    // Ejercicio 4: Recorrido con For-Each
    public static void ejercicio4() {
        // Crear ArrayList de Double
        List<Double> valores = new ArrayList<>();
        valores.add(15.5);
        valores.add(23.8);
        valores.add(9.2);
        valores.add(31.7);
        valores.add(12.4);
        
        // Variables para cálculos
        double suma = 0;
        double maximo = valores.get(0);
        double minimo = valores.get(0);
        
        // Recorrer con for-each y calcular
        for (Double valor : valores) {
            suma += valor;
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
        }
        
        double promedio = suma / valores.size();
        
        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
    
    // Ejercicio 5: Uso de Iterator para Eliminación Segura
    public static void ejercicio5() {
        // Crear ArrayList con números del 1 al 10
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        System.out.println("Lista antes de eliminación: " + numeros);
        
        // Usar Iterator para eliminar números pares
        int eliminados = 0;
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            Integer numero = it.next();
            if (numero % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }
        
        System.out.println("Lista después de eliminación: " + numeros);
        System.out.println("Elementos eliminados: " + eliminados);
    }
    
    // Ejercicio 6: Métodos de Búsqueda
    public static void ejercicio6() {
        // Crear ArrayList de String
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");
        lenguajes.add("JavaScript");
        lenguajes.add("Python");
        lenguajes.add("Go");
        
        // Índice de primera aparición de "Python"
        int primerPython = lenguajes.indexOf("Python");
        System.out.println("Índice de primera aparición de 'Python': " + primerPython);
        
        // Índice de última aparición de "Python"
        int ultimoPython = lenguajes.lastIndexOf("Python");
        System.out.println("Índice de última aparición de 'Python': " + ultimoPython);
        
        // Verificar si contiene "Ruby"
        System.out.println("¿Contiene 'Ruby'?: " + lenguajes.contains("Ruby"));
        
        // Crear sublista desde índice 1 hasta 4 (no incluido)
        List<String> sublista = lenguajes.subList(1, 4);
        System.out.println("Sublista (índices 1-3): " + sublista);
    }
    
    // Ejercicio 7: Ordenamiento de ArrayList
    public static void ejercicio7() {
        // ArrayList de Integer
        List<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(23);
        numeros.add(67);
        numeros.add(34);
        numeros.add(89);
        numeros.add(56);
        
        // Ordenar en orden ascendente
        Collections.sort(numeros);
        System.out.println("Ordenado ascendente: " + numeros);
        
        // Ordenar en orden descendente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordenado descendente: " + numeros);
        
        // ArrayList de String con nombres
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Elena");
        nombres.add("Luis");
        
        // Ordenar alfabéticamente
        Collections.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente: " + nombres);
        
        // Ordenar por longitud (más corto al más largo)
        Collections.sort(nombres, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Nombres ordenados por longitud: " + nombres);
    }
    
    // Ejercicio 8: Operaciones con removeIf
    public static void ejercicio8() {
        // ArrayList de String con palabras
        List<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("auto");
        palabras.add("bicicleta");
        palabras.add("avión");
        palabras.add("barco");
        palabras.add("tren");
        
        System.out.println("Palabras iniciales: " + palabras);
        
        // Eliminar palabras con menos de 5 caracteres
        palabras.removeIf(p -> p.length() < 5);
        System.out.println("Después de eliminar palabras < 5 caracteres: " + palabras);
        
        // ArrayList de Integer con números del 1 al 20
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }
        
        System.out.println("Números iniciales: " + numeros);
        
        // Eliminar números divisibles por 3
        numeros.removeIf(n -> n % 3 == 0);
        System.out.println("Después de eliminar divisibles por 3: " + numeros);
    }
    
    // Ejercicio 9: Conversión a Arreglo
    public static void ejercicio9() {
        // Crear ArrayList de String
        List<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        
        // Convertir a arreglo de Object
        Object[] arregloObject = dias.toArray();
        System.out.println("Arreglo Object - Longitud: " + arregloObject.length);
        System.out.println("Elementos (Object): " + Arrays.toString(arregloObject));
        
        // Convertir a arreglo de String
        String[] arregloString = dias.toArray(new String[0]);
        System.out.println("Arreglo String - Longitud: " + arregloString.length);
        System.out.println("Elementos (String): " + Arrays.toString(arregloString));
        
        // Crear ArrayList desde un arreglo
        String[] arregloOriginal = {"Sábado", "Domingo"};
        List<String> diasDesdeArreglo = new ArrayList<>(Arrays.asList(arregloOriginal));
        System.out.println("ArrayList creado desde arreglo: " + diasDesdeArreglo);
    }
    
    // Ejercicio 10: Sistema de Gestión de Estudiantes
    
    // ArrayLists globales para el sistema de estudiantes
    private static List<String> nombresEstudiantes = new ArrayList<>();
    private static List<Double> calificacionesEstudiantes = new ArrayList<>();
    
    public static void ejercicio10() {
        // Limpiar listas
        nombresEstudiantes.clear();
        calificacionesEstudiantes.clear();
        
        // Agregar estudiantes
        agregarEstudiante("Ana", 4.5);
        agregarEstudiante("Luis", 2.8);
        agregarEstudiante("María", 3.7);
        agregarEstudiante("Carlos", 4.2);
        agregarEstudiante("Elena", 2.5);
        
        // Listar todos los estudiantes
        System.out.println("--- Estudiantes registrados ---");
        listarEstudiantes();
        
        // Calcular y mostrar promedio
        double promedio = calcularPromedio();
        System.out.println("\nPromedio general: " + String.format("%.2f", promedio));
        
        // Mostrar estudiantes aprobados
        System.out.println("\n--- Estudiantes aprobados (calificación >= 3.0) ---");
        estudiantesAprobados();
        
        // Eliminar estudiante en posición 1
        System.out.println("\nEliminando estudiante en posición 1 (" + nombresEstudiantes.get(1) + ")...");
        eliminarEstudiante(1);
        
        // Buscar a María
        int posicionMaria = buscarEstudiante("María");
        if (posicionMaria >= 0) {
            System.out.println("María se encuentra en la posición: " + posicionMaria);
        } else {
            System.out.println("María no se encuentra en la lista");
        }
        
        // Listar estudiantes finales
        System.out.println("\n--- Estudiantes finales ---");
        listarEstudiantes();
    }
    
    // Método auxiliar: agregar estudiante
    private static void agregarEstudiante(String nombre, Double calificacion) {
        nombresEstudiantes.add(nombre);
        calificacionesEstudiantes.add(calificacion);
    }
    
    // Método auxiliar: eliminar estudiante
    private static void eliminarEstudiante(int indice) {
        if (indice >= 0 && indice < nombresEstudiantes.size()) {
            nombresEstudiantes.remove(indice);
            calificacionesEstudiantes.remove(indice);
            System.out.println("Estudiante eliminado correctamente");
        } else {
            System.out.println("Índice fuera de rango");
        }
    }
    
    // Método auxiliar: buscar estudiante
    private static int buscarEstudiante(String nombre) {
        return nombresEstudiantes.indexOf(nombre);
    }
    
    // Método auxiliar: calcular promedio
    private static double calcularPromedio() {
        if (calificacionesEstudiantes.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Double calificacion : calificacionesEstudiantes) {
            suma += calificacion;
        }
        return suma / calificacionesEstudiantes.size();
    }
    
    // Método auxiliar: listar estudiantes
    private static void listarEstudiantes() {
        for (int i = 0; i < nombresEstudiantes.size(); i++) {
            System.out.println(i + ". " + nombresEstudiantes.get(i) + " - Calificación: " + 
                             String.format("%.1f", calificacionesEstudiantes.get(i)));
        }
    }
    
    // Método auxiliar: estudiantes aprobados
    private static void estudiantesAprobados() {
        for (int i = 0; i < nombresEstudiantes.size(); i++) {
            if (calificacionesEstudiantes.get(i) >= 3.0) {
                System.out.println("- " + nombresEstudiantes.get(i) + " - Calificación: " + 
                                 String.format("%.1f", calificacionesEstudiantes.get(i)));
            }
        }
    }
}