import java.util.Scanner;

public class Actividad1_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar una palabra: ");
        String entrada= teclado.nextLine();

        boolean palindromo= palindromo(entrada);
        if (palindromo) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
    public static boolean palindromo(String texto) {
        String  lap=texto.replaceAll("\\s+", "").toLowerCase();
        int longitud=lap.length();
        for (int i=0; i< longitud /2; i++) {
            if (lap.charAt(i) !=lap.charAt(longitud -i -1)) {
                return false;
            }
        }
        return true;
    }
}
