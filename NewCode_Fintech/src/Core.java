// import modulos
import br.com.fintech.modules.Conta;
import br.com.fintech.resorce.ResorceChat;
import br.com.fintech.modules.Sacar;
import br.com.fintech.modules.Depositar;
import br.com.fintech.modules.Meta;

// import bibliotecas
import java.util.Scanner;


public class Core {
    // main function
    public static void main(String[] args) {
        // inicar scanner
        Scanner vw = new Scanner(System.in);
        System.out.print("Qual é o seu nome? " + ResorceChat.breakLineResorc());

        // Coleta o nome do usuário
        String userName = vw.nextLine();
        Conta.setNome(userName);

        // Boas vindas
        System.out.println(ResorceChat.lineResorc() + ResorceChat.breakLineResorc());
        System.out.println(ResorceChat.breakLineResorc() + "Seja muito bem-vindo " + Conta.getNome() + "!");

        String option;

        // Verificador/analisador da opção selecionada
        boolean running = true;
        do {
            // Acessar funcionalidades
            System.out.println(ResorceChat.breakLineResorc() + "O que vamos fazer hoje? Digite apenas o número da opção desejada.");
            System.out.println("1. Depositar valor");
            System.out.println("2. Sacar valor");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Consultar meta");
            System.out.println("5. Adicionar meta");
            System.out.println("6. Adicionar valor para a meta");
            System.out.println("7. sair");

            // Coleta da escolha
            option = vw.nextLine();

            if (isInteger(option)) {
                int choice = Integer.parseInt(option);
                if (choice == 7) {
                    running = false;
                    System.out.println("Finalizando processo ...");
                } else {
                    functions(choice);
                }
            } else {
                System.out.println("Entrada inválida!");
            }

        } while (running);

        // fechar scanner
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
    Depositar depositar = new Depositar();
    Sacar sacar = new Sacar();
    Meta meta = new Meta();
    // novo scanner
    Scanner sc = new Scanner(System.in);
        // switch das opções
        switch (choice) {
            case 1:
                System.out.println("Quanto deseja adcicionar ?");
                double valorDeposito = sc.nextDouble();
                Depositar.depositarValor(valorDeposito);
                break;
            case 2:
                System.out.println("Quanto deseja sacar ?");
                double x = sc.nextDouble();
                Sacar.sacarValor(x);
                break;
            case 3:
                Conta.showAccount();
                break;
            case 4:
                System.out.println("Consultando Meta ..." + ResorceChat.breakLineResorc());
                Meta.showMeta();
                break;
            case 5:
                Meta.addMeta();
                break;
            case 6:
                System.out.println("Digite o valor que deseja adicionar para a meta:");
                double valorMeta = sc.nextDouble();
                Meta.addInvestimento(valorMeta);
                break;
            default:
                System.out.println("Valor selecionado inválido, digite apenas um dos 5 valores!" + ResorceChat.breakLineResorc());
                break;
        }

        // fechar o outro scanner
        sc.close();
    }
}