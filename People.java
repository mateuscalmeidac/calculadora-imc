package Pessoa;

import java.util.Scanner;

public class People {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        Integer idade = Integer.valueOf(scanner.nextLine());

        System.out.println("Digite o seu peso: ");
        Double peso = Double.valueOf(scanner.nextLine());

        System.out.println("Digite a sua altura: ");
        Double altura = Double.valueOf(scanner.nextLine());

        //Cálculo IMC
        double imc = (peso * altura);
        System.out.printf("O seu IMC é de: " + imc);
    }


}
