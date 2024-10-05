package Aula36RelacionamentoClasses;

public class Program{
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("21 00000000");

        // objeto Endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Alazao");
        end.setNumero("10");
        end.setComplemento("Esquina");
        end.setCidade("Ali");
        end.setEstado("OndeJudasPerderAsBotas");
        end.setCep("99999999");

        contato.setEndereco(end);//se por acaso esquecer de declarar esse setEndereço.. a linha 24 retorna null para getEndereço, onde getCidade n tem valor algum
            //Endereco

        //objeto Telefone
        Telefone tel = new Telefone();

        tel.setTipo("Celular");
        tel.setDdd("21");
        tel.setNumero(" 9 99999999");

        Telefone tel2 = new Telefone();

        tel2.setTipo("casa");
        tel2.setDdd("21");
        tel2.setNumero(" 9 777777777");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        //contato.setTelefone(tel);
        contato.setTelefones(telefones);


        //saida console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());
        //System.out.println(contato.getEndereco().getCidade()); //codigo perigoso - aqui da o nullpointerexception

        //deixando ele seguro
        if(contato != null && contato.getEndereco() != null){ //deixa o codigo mais seguro
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

        if(contato != null & contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }




    }
}

