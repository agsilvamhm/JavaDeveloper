public class ExemploForArray {
    public static void main(String[] args) {
        String membros[] = {"Adalberto","Ana","Mayra","Heloyse","Miguel"};

        for(int i = 0; i < membros.length;i ++){
            System.out.println(membros[i]);
        }

        System.out.println("+--------------------------------+");

        for (String membro: membros){
            System.out.println(membro);
        }
    }
}
