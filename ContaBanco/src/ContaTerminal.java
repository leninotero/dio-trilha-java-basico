import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta, cont=0;
        String nomeCliente, agencia;
        double saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindos ao Banco DIO");
        System.out.println("Por favor, digite o número da Agência");
        agencia = entrada.next();
        System.out.println("Por favor, digite o número da Conta");
        numeroConta = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Por favor, digite o seu Nome");
        nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o saldo da sua Conta:");
        saldo = entrada.nextDouble();

        do {
            System.out.println("Pocessando seus dados....");
            cont++;
        } while (cont == 3);

        System.out.println("===== BANCO DIO ======");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco" +
                ", sua agencia é: " + agencia + ", conta: " + numeroConta + " e seu saldo R$ " +
                saldo + " já está disponível para saque");
        entrada.close();
    }
}
