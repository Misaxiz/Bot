import java.util.Scanner;

public class Actividad1_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = teclado.nextInt();

        boolean resultado = Primo(numero);
        if (resultado) {
            System.out.println(numero+" es primo.");
        }
         else {
            System.out.println(numero+" no es primo.");
        }
    }
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
