import java.util.*;

public class Actiadad2_5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);


    System.out.println("Ingrear una palabra");
    String palabra=teclado.nextLine(); 
    System.out.println("ingresar letra a remplazar");
    String remplazar=teclado.nextLine();
    System.out.println("ingrear nueva letra");
    String nueva=teclado.nextLine();
    
    System.out.println("Remplazar: " + palabra.replace(remplazar, nueva)); 
    }
}
