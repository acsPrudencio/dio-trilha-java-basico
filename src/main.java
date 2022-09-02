import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, informe um valor de deposito incial!");
        double saldo = sc.nextDouble();

        System.out.println("Óla "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo R$ "+saldo+" já está disponível para saque.");

    }
}
