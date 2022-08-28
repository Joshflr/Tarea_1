import java.util.Scanner;

public class NumeroDobleYTriple {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero, doble, triple;
        System.out.println("Ingrese numero: ");
        numero = sc.nextInt();

        doble = numero *2;
        triple = numero *3;

        System.out.println("El doble del numero "+numero+" es: "+doble);
        System.out.println("El triple del numero "+numero+" es: "+triple);
        sc.close();


    }
}
