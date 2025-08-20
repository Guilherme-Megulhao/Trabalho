import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double maiorNota = Double.MIN_VALUE;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("A maior nota é: " + maiorNota);

        scanner.close();
    }
}

