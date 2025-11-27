package com.example;

public class EjerciciosActividad2 {
    public static void main(String[] args) {
        // --- While ---
        
        // Ejercicio 1: Imprimir números del 1 al 10 validando límites
        System.out.println("=== While - Ejercicio 1 ===");
        int i = 1;
        while (i <= 10) { // Validación de límite antes de cada iteración
            System.out.println("Número: " + i);
            i++;
        }
        
        // Ejercicio 2: Acumular suma de 1 a n
        System.out.println("\n=== While - Ejercicio 2 ===");
        int n = 5; // Valor predefinido para n
        int suma = 0;
        int contador = 1;
        while (contador <= n) { // Validación de límite
            suma += contador;
            contador++;
        }
        System.out.println("La suma de 1 a " + n + " es: " + suma);
        
        // Ejercicio 3: Buscar número en arreglo
        System.out.println("\n=== While - Ejercicio 3 ===");
        int[] numeros = {2, 5, 8, 10, 15, 20};
        int numeroBuscado = 10; // Número a buscar
        boolean encontrado = false;
        int indice = 0;
        while (indice < numeros.length && !encontrado) { // Validación de límite y condición
            if (numeros[indice] == numeroBuscado) {
                encontrado = true;
                System.out.println("Número " + numeroBuscado + " encontrado en posición: " + indice);
            }
            indice++;
        }
        if (!encontrado) {
            System.out.println("Número " + numeroBuscado + " no encontrado");
        }

        // --- Do-while ---
        
        // Ejercicio 1: Menú interactivo
        System.out.println("\n=== Do-while - Ejercicio 1 ===");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Opción C");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1: System.out.println("Ejecutando Opción A"); break;
                case 2: System.out.println("Ejecutando Opción B"); break;
                case 3: System.out.println("Ejecutando Opción C"); break;
                case 4: System.out.println("Saliendo del menú..."); break;
                default: System.out.println("Opción inválida");
            }
        } while (opcion != 4); // Se ejecuta al menos una vez
        
        // Ejercicio 2: Lectura de números hasta ingresar 0
        System.out.println("\n=== Do-while - Ejercicio 2 ===");
        int numero;
        int sumaNumeros = 0;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            sumaNumeros += numero;
        } while (numero != 0); // Se ejecuta hasta que se ingrese 0
        System.out.println("La suma total es: " + sumaNumeros);
        
        // Ejercicio 3: Validación de contraseña
        System.out.println("\n=== Do-while - Ejercicio 3 ===");
        String contraseñaCorrecta = "secreto123";
        String intento;
        do {
            System.out.print("Ingrese la contraseña: ");
            intento = scanner.next();
            if (!intento.equals(contraseñaCorrecta)) {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }
        } while (!intento.equals(contraseñaCorrecta)); // Se repite hasta acertar
        System.out.println("¡Contraseña correcta! Acceso concedido.");

        // --- For ---
        
        // Ejercicio 1: Números pares del 2 al 20
        System.out.println("\n=== For - Ejercicio 1 ===");
        System.out.print("Números pares del 2 al 20: ");
        for (int j = 2; j <= 20; j += 2) { // Incremento de 2 en 2
            System.out.print(j + " ");
        }
        System.out.println();
        
        // Ejercicio 2: Factorial de un número
        System.out.println("\n=== For - Ejercicio 2 ===");
        int numeroFactorial = 5;
        long factorial = 1;
        for (int k = 1; k <= numeroFactorial; k++) {
            factorial *= k;
        }
        System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);
        
        // Ejercicio 3: Suma de elementos de un arreglo
        System.out.println("\n=== For - Ejercicio 3 ===");
        int[] arregloEnteros = {3, 7, 2, 9, 5};
        int sumaArreglo = 0;
        for (int l = 0; l < arregloEnteros.length; l++) { // Usando contador l
            sumaArreglo += arregloEnteros[l];
        }
        System.out.println("La suma de los elementos del arreglo es: " + sumaArreglo);

        // --- For-each ---
        
        // Ejercicio 1: Suma de arreglo de enteros
        System.out.println("\n=== For-each - Ejercicio 1 ===");
        int[] numerosArray = {10, 20, 30, 40, 50};
        int sumaForEach = 0;
        for (int num : numerosArray) { // Sintaxis for-each
            sumaForEach += num;
        }
        System.out.println("Suma con for-each: " + sumaForEach);
        
        // Ejercicio 2: Listar palabras de colección
        System.out.println("\n=== For-each - Ejercicio 2 ===");
        String[] palabras = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        System.out.println("Lenguajes de programación:");
        for (String palabra : palabras) { // Recorrido simplificado
            System.out.println("- " + palabra);
        }
        
        // Ejercicio 3: Promedio de calificaciones
        System.out.println("\n=== For-each - Ejercicio 3 ===");
        double[] calificaciones = {8.5, 9.0, 7.5, 8.0, 9.5};
        double sumaCalificaciones = 0;
        for (double calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }
        double promedio = sumaCalificaciones / calificaciones.length;
        System.out.printf("El promedio de calificaciones es: %.2f\n", promedio); // Dos decimales

        // --- Break y Continue ---
        
        // Ejercicio 1: Break para detener ciclo
        System.out.println("\n=== Break y Continue - Ejercicio 1 ===");
        System.out.print("Números hasta encontrar el primero mayor a 8: ");
        for (int m = 1; m <= 15; m++) {
            if (m > 8) { // Condición específica
                System.out.print(m + " (se detiene aquí)");
                break; // Detiene el ciclo
            }
            System.out.print(m + " ");
        }
        System.out.println();
        
        // Ejercicio 2: Continue para omitir elementos
        System.out.println("\n=== Break y Continue - Ejercicio 2 ===");
        System.out.print("Números del 1 al 10 omitiendo múltiplos de 3: ");
        for (int o = 1; o <= 10; o++) {
            if (o % 3 == 0) { // Condición para omitir
                continue; // Omite esta iteración
            }
            System.out.print(o + " ");
        }
        System.out.println();
        
        // Ejercicio 3: Combinar break y continue
        System.out.println("\n=== Break y Continue - Ejercicio 3 ===");
        System.out.print("Procesando números (omite pares, se detiene en 12): ");
        for (int p = 1; p <= 20; p++) {
            if (p % 2 == 0) {
                continue; // Omite números pares
            }
            if (p > 12) {
                break; // Se detiene al superar 12
            }
            System.out.print(p + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}



        // Sugerencia: copie y adapte el bloque anterior por cada ejercicio de las secciones de bucles.
        // Recomendaciones generales
        // - Ejecute y valide cada ejercicio de forma independiente.
        // - Si la salida interfiere entre ejercicios, comente temporalmente los anteriores.
        // - Mantenga coherencia en mensajes y formato de salida.


