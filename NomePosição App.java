public class App {
    public static void main(String[] args) throws Exception {
        
        String [] nome = new String[6];

        nome[3] = "Guilherme";

        System.out.println("Vetor:");

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Posição " + i + ": " + nome[i]);
        }

    }
}
