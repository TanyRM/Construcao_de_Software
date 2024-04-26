package atividade08.questao4;

public class ContaBancaria {
    public Double saldo = 100.00;

    public Double depositar(Double valor) {
        this.saldo = this.saldo + valor;
        return this.saldo;
    }

    public Double sacar(Double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException();
        } else {
            this.saldo = this.saldo - valor;
        }
        return this.saldo;
    }
}
