public class App {
    public static void main(String[] args) throws Exception {
        
        int idades[] ={10,17,40,87,18,25,7,77,56,15};
        
        System.out.println("Idades maiores de 18 anos: ");

        for (int i = 0; i < idades.length; i++) {
            if(idades[i]>18){
                System.out.println(idades[i]);
            }
        }
    }
}
