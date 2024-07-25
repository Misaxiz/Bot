import java.util.Scanner;

public class Actividad2_2 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar numeros:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        
        System.out.println("La suma es: " + suma);

    }
}
