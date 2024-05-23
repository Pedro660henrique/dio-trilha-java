//Declarando o saldo
public class BancoTerminal{
    private double saldo;

//Construtor para iniciar o saldo, a palavra this. serve para referenciar a instancia do metodo
public BancoTerminal(double saldoInicialConta){
    this.saldo = saldoInicialConta;
}
//Metodo para sacar dinheiro
public void sacar(double valorSolicitado){
    /*Se o saldo for maior que o valor solicitado, o saldo é atualizado subtraindo o valor solicitado */
    if(saldo > valorSolicitado){
        saldo -= valorSolicitado;
        System.out.println("Saque bem sucedido. Seu novo saldo: " + saldo);
        System.out.println("Obrigado por Utilizar nosso banco, até a proxima!");

    } else {
        System.out.println("Saldo insuficiente, desculpe!");
    }
}
}