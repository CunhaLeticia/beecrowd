import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        double mediaPonderada = (pesoA * a + pesoB * b + pesoC * c) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", mediaPonderada);
    }
}