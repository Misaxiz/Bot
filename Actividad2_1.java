import java.util.Scanner;

public class Actividad2_1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int pares = 0;
        int impares = 0;
        for (int num:numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("pares: " + pares);
        System.out.println("impares: " + impares);
    }
}
