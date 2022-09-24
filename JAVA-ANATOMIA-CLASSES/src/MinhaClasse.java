public class MinhaClasse {
    public static void main(String []args){
       // System.out.println("Olá turma, sejam bem vindos!");

       String primeiroNome = "Adalberto";
       String segundoNome = "Gonçalves";

       String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

       System.out.println (nomeCompleto);
    }

    public static String nomeCompleto(String x, String y){
        return "Resultado do método é" + x.concat(" ").concat(y);
    }
}
