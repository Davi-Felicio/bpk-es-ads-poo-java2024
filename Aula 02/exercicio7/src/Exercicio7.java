/*Exercício 7: Métodos
Escreva um programa que contenha um método chamado soma que receba dois números inteiros como parâmetros e retorne a soma deles. 
Chame esse método a partir do método main e exiba o resultado.
 */



 public class Exercicio7 {
    
    // Método que recebe dois inteiros e retorna a soma deles
    public static int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Chama o método soma e armazena o resultado
        int resultado = soma(10, 20);

        // Exibe o resultado no console
        System.out.println("A soma de 10 e 20 é: " + resultado);
        
    }
}

