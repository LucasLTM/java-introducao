import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
        /*Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior
         deles.*/

        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;
        int valor3;
        int valor4;

        System.out.println("Digite o primeiro número: ");
        valor1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        valor3 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        valor4 = scanner.nextInt();

        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
            System.out.println("O número " + valor1 + " é o maior dos informados");

        } else if (valor2  >valor1 && valor2 > valor3) {
            System.out.println("O número " + valor2 + " é o maior dos informados");

        } else if (valor3>valor1 && valor3>valor2) {
            System.out.println("O número " + valor3 + " é o maior dos informados");

        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
            System.out.println("O número " + valor4 + " é o maior dos informados");

        } else if (valor1 == valor2 && valor2 == valor3 && valor3 == valor4) {
            System.out.println("Todos os números informados são iguais");
        }
    }
}
