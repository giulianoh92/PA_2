import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el número a dividir: ");
        int num1 = scanner.nextInt();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el divisor: ");
        int num2 = scanner.nextInt();

        // Calcular el resultado de la división usando el método de la clase Calculadora
        double resultado = Calculadora.dividir(num1, num2);

        // Mostrar el resultado de la división
        System.out.println("Resultado: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

class Calculadora {
    public static double dividir(int num1, int num2) {
        // Convertir los números enteros a dobles para la división
        double dividendo = num1;
        double divisor = num2;

        // Verificar si el divisor es cero para evitar la división por cero
        if (divisor == 0) {
            System.out.println("Error: División por cero.");
            return 0; // Retornar 0 en caso de división por cero
        } else {
            // Retornar el resultado de la división
            return dividendo / divisor;
        }
    }
}
