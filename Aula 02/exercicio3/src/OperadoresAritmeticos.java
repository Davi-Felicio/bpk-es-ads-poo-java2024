import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar as operações aritméticas
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = 0;
        if (numero2 != 0) {
            divisao = numero1 / numero2;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        // Exibir os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if (numero2 != 0) {
            System.out.println("Divisão: " + divisao);
        }
        
        // Fechar o Scanner
        scanner.close();
    }
}
