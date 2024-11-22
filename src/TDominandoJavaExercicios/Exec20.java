package TDominandoJavaExercicios;

public class Exec20 {


    public static void main(String[] args) {
        String palavra = "ovo";

        boolean palindromo = true;

        for(int i= 0; i < palavra.length(); i++){
            char a = palavra.charAt(i);
            char b = palavra.charAt(palavra.length() - i -1);
            if(a != b){
                palindromo = false;
                break;
            }
        }
        if(palindromo){
            System.out.println("A palavra é palindromo");
        }else{
            System.out.println("A palavra nao é palindromo");
        }
    }
}
