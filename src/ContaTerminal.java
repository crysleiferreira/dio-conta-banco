import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite sua conta:");
        int conta = scanner.nextInt();

        double saldo = 237.58;

        System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + 
        " conta " + conta + " e seu saldo "+ saldo +
        " já está disponível para saque.");
    }
}
