package Task2.ex3;

import java.util.Scanner;

public class AnalisadorString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int numeroCaracteres = input.length();
        System.out.println("Número de caracteres: " + numeroCaracteres);

        String maiusculo = input.toUpperCase();
        System.out.println("String em maiúsculo: " + maiusculo);

        int numVogais = contarVogais(input);
        System.out.println("Número de vogais: " + numVogais);

        boolean comecaComUNI = input.toUpperCase().startsWith("UNI");
        System.out.println("Começa com 'UNI'? " + comecaComUNI);

        boolean terminaComRIO = input.toUpperCase().endsWith("RIO");
        System.out.println("Termina com 'RIO'? " + terminaComRIO);

        int numeroDigitos = contarDigitos(input);
        System.out.println("Número de dígitos: " + numeroDigitos);

        scanner.close();
    }

    public static int contarVogais(String str) {
        int contador = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static int contarDigitos(String str) {
        int contador = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                contador++;
            }
        }
        return contador;
    }
}
