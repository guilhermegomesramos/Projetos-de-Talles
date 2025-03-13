package Task2.ex2;

public class testarFuncionario {
    public static void main(String[] args) {
        funcionario novoFuncionario = new funcionario();

        novoFuncionario.nome = "Luiz";
        novoFuncionario.sobrenome = "Silva";
        novoFuncionario.horasTrabalhadas = 10;
        novoFuncionario.valorHora = 25.50;

        System.out.println("Nome completo: " + novoFuncionario.nomeCompleto());
        System.out.println("Salário: " + novoFuncionario.calcularSalario());
        novoFuncionario.incrementarHoras(8);
        System.out.println("Salário: " + novoFuncionario.calcularSalario());
    }
    
}
