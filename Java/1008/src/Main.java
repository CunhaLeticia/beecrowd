import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int hora = sc.nextInt();
        int valor = sc.nextInt();
        double salarioHora = sc.nextDouble();

        double salario = valor * salarioHora;

        System.out.println("NUMBER = " + hora);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}