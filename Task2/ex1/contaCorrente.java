package Task2.ex1;

public class contaCorrente {
    double saldo;

    void definirSaldoInicial(double valorInicial) {
        saldo = valorInicial;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }
    
}
