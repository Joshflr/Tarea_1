import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radio, area, perimetro;

        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble();
        area = Math.PI*radio*radio;
        perimetro = 2*Math.PI*radio;
        System.out.println("Area es: "+area);
        System.out.println("Perimetro es: "+perimetro);
        sc.close();

    }
}
