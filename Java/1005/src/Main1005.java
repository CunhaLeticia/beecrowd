import java.util.Locale;
import java.util.Scanner;

public class Main1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new  Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double pesoA = 3.5;
        double pesoB = 7.5;

        double mediaPonderada = (pesoA * a + pesoB * b) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", mediaPonderada);
    }
}