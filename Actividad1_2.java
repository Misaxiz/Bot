import java.util.Scanner;
public class Actividad1_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresar un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingresar otro numero: ");
        int num2 = teclado.nextInt();
        int operacion = MCD(num1, num2);

        System.out.println("El MCD es: "     + operacion);
    }
    public static int MCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
 
    }

}
