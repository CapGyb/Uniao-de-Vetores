import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor do vetor A na posicao " + (i + 1) + ": ");
            vetorA[i] = teclado.nextInt();

        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe o valor do vetor B na posicao " + (i + 1) + ": ");
            vetorB[i] = teclado.nextInt();

        }
        System.out.println();
        teclado.close();

        for (int j = 0; j < vetorA.length; j++) {
            vetorC[j] = vetorA[j];

        }
        for (int j = 0; j < vetorB.length; j++) {
            vetorC[vetorA.length + j] = vetorB[j];

        }
        System.out.println("A uniao dos vetores A e B no vetor C: ");

        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%d ", vetorC[i]);

        }

    }
}
