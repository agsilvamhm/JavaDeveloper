import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
           double altura = scanner.nextDouble();

           System.out.println("Olá, meu nome é " + nome + " " + sobreNome);
           System.out.println("Tenho " + idade + " anos");
           System.out.println("Minha altura é " + altura + " m");
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser númericos.");
        }
    }
}
