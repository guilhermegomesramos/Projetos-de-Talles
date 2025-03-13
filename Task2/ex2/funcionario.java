package Task2.ex2;

public class funcionario {
    String nome;
    String sobrenome;
    int horasTrabalhadas;
    double valorHora;
    
    String nomeCompleto() {
        return nome+" "+sobrenome;
    }

    double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    int incrementarHoras(int horasAdicional) {
        return horasTrabalhadas += horasAdicional;
    }

}
