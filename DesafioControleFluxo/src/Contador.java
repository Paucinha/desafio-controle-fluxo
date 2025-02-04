import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita os dois números inteiros
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
            
            // Chama o método contar para exibir os números
            contar(num1, num2);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = num2 - num1;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}