import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       String texto;
        while (true) {
            
    System.out.println("Ingrear una palabra");
    String palabra=teclado.nextLine();
    
    if (palabra.trim().isEmpty()) {
        break;
    }

     String mayusculas = palabra.toUpperCase();
     System.out.println(mayusculas);
        
    }
}
}
