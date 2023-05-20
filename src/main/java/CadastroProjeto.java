import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
public class CadastroProjeto {
    private static ArrayList<Usuario> listaUsuario = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;

        while (executando){
            exibirMenu();
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> adicionarUsuario();
                case 2 -> exibirUsuario();
                case 3 -> editarUsuario();
                case 4 -> excluirUsuario();
                case 5 -> {
                    executando = false;
                    System.out.println("Encerrando o programa. Até logo!");
                }
            }
        }
        entrada.close();
    }

    private static void exibirMenu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Adicionar Usuário");
        System.out.println("2. Exibir Usuários");
        System.out.println("3. Editar Usuário");
        System.out.println("4. Excluir Usuário");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarUsuario() {
        System.out.println("Olá, bem vindo ao cadastro!");
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite seu melhor Email: ");
        String email = entrada.nextLine();
        System.out.print("Digite agora sua senha: ");
        int senha = entrada.nextInt();

       Usuario usuario = new Usuario(nome, email, senha);
        listaUsuario.add(usuario);

        System.out.println("Usuário adicionado com sucesso!");
        System.out.println();


    }

    private static void exibirUsuario() {
        if (listaUsuario.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
        } else {
            System.out.println("=== Lista Usuários ===");
                for (Usuario usuario : listaUsuario){
                    System.out.println(usuario.toString());
                }
        }
        System.out.println();
    }

    private static void editarUsuario(){
        if (listaUsuario.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
        } else {
            exibirUsuario();
            System.out.print("Digite o índice do usuário que deseja editar: ");
            int indice = entrada.nextInt();
            entrada.nextLine();

            if (indice >= 0 && indice < listaUsuario.size()) {
                Usuario usuario = listaUsuario.get(indice);

                System.out.print("Digite o novo nome do usuário: ");
                String novoNome = entrada.nextLine();
                System.out.print("Digite a nova idade do usuário: ");
                String novoEmail = entrada.nextLine();
                System.out.print("Digite o novo email do usuário: ");
                int novaSenha = entrada.nextInt();

                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
                usuario.setSenha(novaSenha);

                System.out.println("Usuário editado com sucesso!");
            }
            else {
                System.out.println("Índice inválido.");
            }
        }
        System.out.println();

        entrada.close();
    }

    private static void excluirUsuario(){
        if (listaUsuario.isEmpty()){
            System.out.println("não há usuários cadastrados.");
        } else {
            exibirUsuario();
            System.out.println("Digite o índice do usuário que deseja excluir: ");
            int indicie = entrada.nextInt();

            if (indicie >= 0 && indicie < listaUsuario.size()) {
                listaUsuario.remove(indicie);
                System.out.println("Usuário excluído com sucesso!");
            } else {
                System.out.println("Índicie inválido.");
            }
        }
        System.out.println();
        entrada.close();
    }
}


