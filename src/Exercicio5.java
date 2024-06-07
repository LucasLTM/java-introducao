import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou
         neutro.*/

        Scanner scanner = new Scanner(System.in);

        double numeroDecimal;

        System.out.println("Por favor, digite algum número: ");
        numeroDecimal = scanner.nextDouble();

        int numeroInteiro = (int) numeroDecimal;

        //Fazer uma variavel boolean para verificador

        if (numeroDecimal < 0)
            System.out.println("");
    }
}
