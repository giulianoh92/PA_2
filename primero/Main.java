import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("dividir: ");
        int num1 = entrada.nextInt();
        System.out.print("por: ");
        int num2 = entrada.nextInt();
        double resultado = Calculadora.dividir(num1, num2);

        System.out.println("resultado: " + resultado);

        entrada.close(); //cerrar entrada
    }
}

class Calculadora {
    public static double dividir(int num1, int num2) {
        double dividendo = num1;
        double divisor = num2;
        if (divisor == 0) {
            System.out.println("división por cero...");
            return 0;
        }else{
            return dividendo / divisor;
        }
    }
}
