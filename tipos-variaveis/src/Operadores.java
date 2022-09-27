public class Operadores {
    public static void main(String[] args) {
       /*  String nomeCompleto = "Linguagem " + "Java";

        System.out.println(nomeCompleto);

        int numero =5;
        numero++;
        System.out.println(numero); */

        int a = 5;
        int b = 6;

        if (a==b){
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        String resultado = a==b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

    }
}