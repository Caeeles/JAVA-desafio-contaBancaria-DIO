import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //exibir mensagem para os usuários sobre os dados:
        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.next();
        
        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        //exibir mensagem de conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de: R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
