package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numerico:");
        double valorPrimitivo = sc.nextInt();
        System.out.printf("O valor inserido foi %f: ", valorPrimitivo);

        Double wrappred = valorPrimitivo;

        System.out.printf("O valor com a classe Wrapper: %f", wrappred);

    }
}
