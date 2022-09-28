public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        

        smartTv.ligada = true;
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

        smartTv.ligada = false;
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

    }
}