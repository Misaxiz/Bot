import java.util.Scanner;

public class Actividad2_6 {
    public static void main(String [] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("ingresar numero");
        double numero=teclado.nextDouble();
        
        double Raiz = Math.sqrt(numero);

        System.out.println("Raiz cuadrada: " + Raiz);
    }
    
}
