/*Exercício 6: Arrays
Crie um programa que declare um array de inteiros com 5 elementos, inicialize-o com valores e imprima todos os valores do array no console.
 */


 public class Exercicio6 {
    public static void main(String[] args) {
        // Declaração e inicialização do array de inteiros com 5 elementos
        int[] numeros = {10, 20, 30, 40, 50};

        // Imprimindo todos os valores do array no console
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }
    }
}
