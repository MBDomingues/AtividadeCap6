import java.util.Scanner;

public class main {
    // main function
    public static void main(String[] args) {
        // Coleta o nome do usuário
        Scanner vw = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String userName = vw.nextLine();

        // Boas vindas
        System.out.println("\nSeja muito bem-vindo " + userName + "!");

        // Variável para armazenar a opção
        String option;

        // Verificador/analisador da opção selecionada
        boolean running = true;
        do {
            // Acessar funcionalidades
            System.out.println("\nO que vamos fazer hoje? Digite apenas o número da opção desejada.");
            System.out.println("1. Adicionar valor");
            System.out.println("2. Remover valor");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Consultar meta");
            System.out.println("5. Sair");

            // Coleta da escolha
            option = vw.nextLine();

            if (isInteger(option)) {
                int choice = Integer.parseInt(option);
                if (choice == 5) {
                    running = false;
                    System.out.println("Finalizando processo ...");
                } else {
                    functions(choice);
                }
            } else {
                System.out.println("Entrada inválida!");
            }

        } while (running);

        // Fecha o scanner
        vw.close();
    }

    // verifica se é ou nn inteiro
    public static boolean isInteger(String str) {
        try {
            // Tenta converter a string para int
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // ativa as opções
    private static void functions(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Adicionar valor!\n");
                break;
            case 2:
                System.out.println("Remover valor!\n");
                break;
            case 3:
                System.out.println("Consultar saldo!\n");
                break;
            case 4:
                System.out.println("Consultar meta!\n");
                break;
            default:
                System.out.println("Valor selecionado inválido, digite apenas um dos 5 valores!\n");
                break;
        }
    }
}