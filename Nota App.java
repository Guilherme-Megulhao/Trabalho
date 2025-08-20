public class App {
    public static void main(String[] args) throws Exception {
        
        double notas[]={7.0, 5.5, 9.0, 8.7};

        double soma=0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("A média é: " + media);

    }

}
