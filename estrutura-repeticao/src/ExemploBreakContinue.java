public class ExemploBreakContinue{
    public static void main(String args[]){
        for(int i = 0; i < 5 ; i++){
            if (i == 3) {
              //  break;  //  Sai da interação
                continue; //  Pula a interação corrente, indo para a próxima, neste exemplo não foi impresso o número 3
            }
            System.out.println(i);
        }
        
    }
}