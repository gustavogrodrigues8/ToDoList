package todolist; // essa coisa vem na linha 1

import java.util.Scanner; // o import vem depois do package

public class ToDoList {

    public static void menu() {
        System.out.println("\n=== LISTA DE TAREFAS ===");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Concluir tarefa");
        System.out.println("4 - Excluir tarefa");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // loop até sair
        do {
            menu(); // mostra o menu
            opcao = scanner.nextInt(); // le o que o cara digitou

            // aqui ve o que ele ecolheu tipo um if ese
            switch (opcao) {
                case 1:
                    System.out.println("escolheu a 1");
                    break;
                case 2:
                    System.out.println("escolheu a 2");
                    break;
                case 3:
                    System.out.println("escolheu a 3");
                    break;
                case 4:
                    System.out.println("escolheu a 4");
                    break;
                case 5:
                    System.out.println("voce saiu");
                    break;
                default:
                    System.out.println("nao digita errado seu burro do caralho");
            }

        } while (opcao != 5);

        scanner.close(); // Fecha a leitura
    }
}