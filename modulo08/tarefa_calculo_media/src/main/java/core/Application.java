package core;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        int[] notas = new int[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.printf("Informe a nota %d: ", i+1);
            notas[i] = sc.nextInt();
        }

        int media = IntStream.of(notas).sum() / notas.length;

        System.out.printf("A media das %d notas inseridas e de: %d pontos", notas.length, media);
    }
}
