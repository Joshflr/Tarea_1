import java.util.Scanner;

public class Numeros {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese primer numero:" );
    int numero1 = sc.nextInt();
    System.out.print("Ingrese segundo numero: ");
    int numero2 = sc.nextInt();

    System.out.println(numero1 +" - "+ numero2);
    sc.close();
  }
}
