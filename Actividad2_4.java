import java.util.Scanner;

public class Actividad2_4 {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar numeros:");
        
        for (int i = 0; i < 6; i++) {
            System.out.print((i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        int [] invertido = new int[numeros.length];
        for(int i= 0; i < numeros.length; i++) {
        invertido[i]=numeros[numeros.length-1-i ];
        }
        System.out.println("El array invertido es: " + java.util.Arrays.toString(invertido) );
    }
}
