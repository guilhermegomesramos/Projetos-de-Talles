package Task2.ex1;

public class testarContaCorrente {
    public static void main(String[] args) {
        contaCorrente novaConta = new contaCorrente();
        
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo: " + novaConta.saldo);
        
        novaConta.sacar(500);

        novaConta.depositar(50);
        System.out.println("Saldo: " + novaConta.saldo);

        novaConta.sacar(600);
        System.out.println("Saldo: " + novaConta.saldo);
    }
}
