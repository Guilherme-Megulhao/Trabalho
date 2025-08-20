public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 5, 29, 18, 30, 12, 77, 140};

        System.out.println("Números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
