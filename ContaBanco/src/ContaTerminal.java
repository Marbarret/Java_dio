import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        
        System.out.print("Número: ");
        int numero = scan.nextInt();
        
        System.out.print("Agencia: ");
        String agencia = scan.next();
        
        System.out.print("Nome: ");
        String nome = scan.next();

        System.out.print("Saldo: ");
        double saldo = scan.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque\n", nome, agencia, numero, saldo);
    }
}
