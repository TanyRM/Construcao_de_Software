package atividade08.questao4;

public class Main4 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        try {
            System.out.println(conta.depositar(100.00));

            System.out.println(conta.sacar(50.00));

            System.out.println(conta.sacar(200.00));

        } catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente: " + conta.saldo);
        }
    }
}
