package TesteTeste;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//Importar o gson para leitura: https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0

    public class Teste {

        private static String mensagem = "Bem vindo ao app de Metas";
        private static List<Meta> metas = new ArrayList<>();
        private static final String FILE_NAME = "metas.json";
        private static final Gson gson = new Gson();
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            carregarMetas();
            while (true) {
                mostrarMensagem();
                salvarMetas();
                System.out.println("Menu >");
                System.out.println("1. Cadastrar meta");
                System.out.println("2. Listar metas");
                System.out.println("3. Metas realizadas");
                System.out.println("4. Metas abertas");
                System.out.println("5. Deletar metas");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer

                switch (opcao) {
                    case 1:
                        cadastrarMeta();
                        break;
                    case 2:
                        listarMetas();
                        break;
                    case 3:
                        metasRealizadas();
                        break;
                    case 4:
                        metasAbertas();
                        break;
                    case 5:
                        deletarMetas();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }

        private static void carregarMetas() {
            try (FileReader reader = new FileReader(FILE_NAME)) {
                Type listType = new TypeToken<ArrayList<Meta>>() {}.getType();
                metas = gson.fromJson(reader, listType);
                if (metas == null) {
                    metas = new ArrayList<>();
                }
            } catch (IOException e) {
                metas = new ArrayList<>();
            }
        }

        private static void salvarMetas() {
            try (FileWriter writer = new FileWriter(FILE_NAME)) {
                gson.toJson(metas, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void cadastrarMeta() {
            System.out.print("Digite a meta: ");
            String metaValue = scanner.nextLine();

            if (metaValue.isEmpty()) {
                mensagem = "A meta não pode ser vazia!";
                return;
            }

            metas.add(new Meta(metaValue, false));
            mensagem = "Meta cadastrada com sucesso!";
        }

        private static void listarMetas() {
            if (metas.isEmpty()) {
                mensagem = "Não existem metas";
                return;
            }

            System.out.println("Metas:");
            metas.forEach(meta -> System.out.println(meta));
        }

        private static void metasRealizadas() {
            List<Meta> realizadas = new ArrayList<>();
            for (Meta meta : metas) {
                if (meta.isChecked()) {
                    realizadas.add(meta);
                }
            }

            if (realizadas.isEmpty()) {
                mensagem = "Não existem metas realizadas!";
            } else {
                System.out.println(realizadas.size() + " metas realizadas no total:");
                realizadas.forEach(System.out::println);
            }
        }

        private static void metasAbertas() {
            List<Meta> abertas = new ArrayList<>();
            for (Meta meta : metas) {
                if (!meta.isChecked()) {
                    abertas.add(meta);
                }
            }

            if (abertas.isEmpty()) {
                mensagem = "Não existem metas abertas!";
            } else {
                System.out.println(abertas.size() + " metas abertas no total:");
                abertas.forEach(System.out::println);
            }
        }

        private static void deletarMetas() {
            System.out.println("Selecione item para deletar:");
            for (int i = 0; i < metas.size(); i++) {
                System.out.println((i + 1) + ". " + metas.get(i).getValue());
            }
            System.out.print("Digite o número da meta que deseja deletar: ");
            int escolha = scanner.nextInt() - 1;
            scanner.nextLine();  // Limpar o buffer

            if (escolha >= 0 && escolha < metas.size()) {
                metas.remove(escolha);
                mensagem = "Meta deletada com sucesso!";
            } else {
                mensagem = "Meta inválida!";
            }
        }

        private static void mostrarMensagem() {
            if (!mensagem.isEmpty()) {
                System.out.println(mensagem);
                System.out.println();
                mensagem = "";
            }
        }

        // Classe Meta
        static class Meta {
            private String value;
            private boolean checked;

            public Meta(String value, boolean checked) {
                this.value = value;
                this.checked = checked;
            }

            public String getValue() {
                return value;
            }

            public boolean isChecked() {
                return checked;
            }

            @Override
            public String toString() {
                return value + (checked ? " [Realizada]" : " [Aberta]");
            }
        }
    }

