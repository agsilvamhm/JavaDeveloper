public class FormatadorDeCepExemplo {
    public static void main(String[] args) throws CepInvalidException {
        try {
            String cepFormatado = formatarCep("58401462");
            System.out.println(cepFormatado);
        }catch (CepInvalidException e){
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep (String cep) throws CepInvalidException{
        if (cep.length() != 8) 
            throw new CepInvalidException();

            return "58.404-462";
       
    }
}
