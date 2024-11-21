package Aula36Exec;

import Aula36Exec.Contato;
import Aula36Exec.Telefone;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Caçula");


        Endereco end = new Endereco();
        end.setNomeRua("Avatar");
        end.setNumero("18");
        end.setCep("22785000");
        end.setCidade("Rio");

       contato.setEndereco(end);

        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        Telefone tel = new Telefone();
        contato.setTelefone(tel);

        tel.setTipo("mobile");
        tel.setDdd("21");
        tel.setNumero(" 9 99999999");

        if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }

    }

}
