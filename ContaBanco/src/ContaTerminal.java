import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = obj.nextLine();

        System.out.println("Informe o número da agência: ");
        String agencia = obj.nextLine();

        System.out.println("Informe o número da sua conta: ");
        int numero = obj.nextInt();

        System.out.println("Informe o seu saldo: ");
        double saldo = obj.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +". conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");
    }
}