import java.util.Scanner;

public class Actividad2_3 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar numeros:");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}
