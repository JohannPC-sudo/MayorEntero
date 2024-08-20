/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @Johann Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crear una instancia de la clase Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // Leer dos números enteros del usuario
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        // Llamar a la función para encontrar el mayor número
        int mayor = encontrarMayor(num1, num2);

        // Imprimir el mayor número
        System.out.println("El mayor numero es: " + mayor);
   }
    
    // Función para encontrar el mayor de dos números
    public static int encontrarMayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b; 
        }
    }
    
}
    
  
    

