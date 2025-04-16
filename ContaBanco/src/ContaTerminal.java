import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Desafio:
        // https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        String numero = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta: ");
        String saldo = scanner.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner para evitar vazamento de recursos
        scanner.close();

    }
}
