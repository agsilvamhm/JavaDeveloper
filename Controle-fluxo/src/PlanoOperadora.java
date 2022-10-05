public class PlanoOperadora {
    public static void main(String[] args) {
/* 
 *  Aqui temos a ideia que utilizar o switch case sem o break, onde o que for comum a todos fica na última posição, o intermediário fica no meio e top em primeiro.
 *  Aqui sera o exemplo de um plano de operadora, onde o plano máximo teria todos os produtos e o plano básico só o simples, a ideia é economizar código deixando o sistema mais ágil.
 * 
 */

        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Intragram gratis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
