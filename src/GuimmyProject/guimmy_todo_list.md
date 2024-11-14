Vamos criar um sistema de console simples que simule um gerenciamento de biblioteca, utilizando os principais conceitos da Programação Orientada a Objetos (POO). Esse sistema deve conter as seguintes funcionalidades:

## Cadastro de livros.
Empréstimo e devolução de livros.
Listagem de livros disponíveis.
Registro de histórico de empréstimos.
Conceitos da Programação Orientada a Objetos

Classes: São moldes que definem as características e comportamentos de um objeto. No nosso caso, teremos classes como Livro, Usuario, Biblioteca, etc.

Objetos: São instâncias de uma classe. Cada livro, por exemplo, será um objeto criado a partir da classe Livro.

Encapsulamento: Significa esconder os detalhes internos de uma classe e expor apenas o necessário. Por exemplo, alguns atributos da classe Livro podem ser privados, e só poderão ser acessados através de métodos públicos.

Herança: Permite que uma classe herde atributos e métodos de outra classe. No exemplo, poderíamos ter uma classe Pessoa, e a classe Usuario herdaria suas propriedades.

Polimorfismo: Permite que métodos com o mesmo nome se comportem de maneira diferente dependendo da classe em que estão ou dos parâmetros passados. Um exemplo seria o método exibirInfo, que poderia ser definido tanto na classe Livro quanto na classe Usuario, mas com comportamentos diferentes.

Abstração: Enfatiza os aspectos essenciais e esconde detalhes supérfluos. No nosso exemplo, abstraímos o funcionamento detalhado de um sistema de gerenciamento real, simplificando o processo de empréstimo.

## Estrutura do Sistema

Classes Principais

Livro

Atributos: título, autor, ano, disponível (booleano).
Métodos: emprestar, devolver, exibirInfo.

Usuario

Atributos: nome, livrosEmprestados (lista de livros).
Métodos: pegarEmprestado, devolverLivro, exibirInfo.

Biblioteca

Atributos: listaDeLivros, historicoEmprestimos.
Métodos: adicionarLivro, listarLivrosDisponiveis, registrarEmprestimo, listarHistorico.

## Explicação do Código

Classe Livro:

Define os atributos do livro (titulo, autor, ano, disponivel).
Métodos como emprestar e devolver manipulam a disponibilidade do livro.
Classe Usuario:

Cada usuário tem um nome e uma lista de livros que pegou emprestado.
Métodos para pegar emprestado e devolver livros foram criados.
Classe Biblioteca:

Gerencia a lista de livros e mantém um histórico de empréstimos.
Tem métodos para listar livros disponíveis, registrar empréstimos e exibir o histórico.
Dicas para Evoluir
Validação: Adicione validações extras, como garantir que um livro não possa ser emprestado duas vezes consecutivas sem ser devolvido.

Persistência de Dados: Expanda o projeto para salvar os dados em um banco de dados ou arquivo de texto, garantindo que os livros e usuários sejam persistidos entre execuções do programa.

Interface Gráfica: Se quiser avançar mais, considere implementar uma interface gráfica simples utilizando bibliotecas como Tkinter ou PyQt.

Com esse código, você já cobre os principais pilares da POO e tem uma boa base para expandir conforme suas necessidades!