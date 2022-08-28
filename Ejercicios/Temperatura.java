import java.util.Scanner;

public class Temperatura {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float C, F;

    System.out.print("Ingrese temperatura centigrados: ");
    C = sc.nextFloat();
    F = 32+(9*C/5);
    System.out.println("La temperatura en Fahrenheit es de: "+F);
    sc.close();
   }
}
