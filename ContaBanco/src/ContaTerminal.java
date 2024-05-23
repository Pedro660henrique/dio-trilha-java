//importando as bibliotecas do java
import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Bem vindo ao Banco dos Devs");
        System.out.println("Vamos seguir com seu cadastro abaixo!");
        /*Estou iniciando o Scanner e o Locale na mesma linha e também nomeando o Scanner de Sc
         * de acordo com as convenções do java https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html
         */
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o numero da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o numero da Agencia: ");
        //O nextLine vazio é para consumir a quebra de linha.
        sc.nextLine();
        String agenciaConta = sc.nextLine();
        System.out.print("Digite seu nome completo: ");
        String nomeConta = sc.nextLine();
        System.out.print("Deposite seu saldo inicial: ");
        double saldoInicialConta = sc.nextDouble();
        //Iniciei a nova classe banco terminal, e coloquei o valor inicial nele
        BancoTerminal minhaConta = new BancoTerminal(saldoInicialConta);
        System.out.println("Você deseja sacar? (S/N): ");
        char resposta = sc.next().charAt(0);
        //if para confirmação de resposta para saque
        if (resposta == 'S' || resposta == 's'){
            System.out.println("Quanto deseja sacar? ");
            double valorSaque = sc.nextDouble();
            minhaConta.sacar(valorSaque);
        } else {
            System.out.println("Olá " 
            + nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agenciaConta + ", conta "
            + numeroConta + " e seu saldo R$" 
            + saldoInicialConta + " já está disponível para saque");
        }

        sc.close();

    }
}
