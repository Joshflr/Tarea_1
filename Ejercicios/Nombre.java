import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Buenos dias "+nombre);
        sc.close();
    }
}
