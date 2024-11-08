package br.com.jamazonasa;

import java.util.Scanner;

public class ConversaoWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        System.out.println("Número digitado: " + numero);

        Double numeroWrapper = (double) numero;

        System.out.println("Wrapper: " + numeroWrapper);
    }
}
