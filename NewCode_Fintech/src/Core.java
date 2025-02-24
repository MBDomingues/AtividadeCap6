// import modulos
import br.com.fintech.modules.*;
import br.com.fintech.resorce.ResorceChat;

// import bibliotecas
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Core {
    // main function
    public static void main(String[] args) {
        // inicar scanner
        Scanner vw = new Scanner(System.in);

        //Login e Cadastro
        do {
        int op;
            System.out.println("Bem vindo!" + ResorceChat.breakLineResorc() + "1. Fazer login" + ResorceChat.breakLineResorc() + "Cadastrar");
            op = vw.nextInt();

            switch (op) {
                case 1:
                    Login login = new Login();
                    System.out.println("Digite seu email:");
                    String email = vw.next();
                    System.out.println("Digite seu senha:");
                    String senha = vw.next();
                    System.out.println("Bm vindo de volta!");
                    break;
                case 2:
                    Cadastro cadastro = new Cadastro();
                    System.out.println("Digite seu email:");
                    String newEmail = vw.next();
                    System.out.println("Digite sua senha:");
                    String newSenha = vw.next();
                    System.out.println("Confirme a sua senha:");
                    String confirmSenha = vw.next();
                    System.out.println("Digite seu nome:");
                    String nome = vw.next();
                    System.out.println("Digite seu CPF:");
                    String cpf = vw.next();

                    System.out.println("Bem vindo ao ...... Somos uma plataforma especializada, com o objtivo de te ajuda a alcançar suas metas!");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + op);
            }

        }while (true);


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
                System.out.println("Digite o nome para a meta");
                String userName = sc.nextLine();
                System.out.println("Digite a data final para a meta:");
                String data = sc.nextLine();
                System.out.println("Digite o valor que deseja alcançar");
                double valorDesejado = sc.nextDouble();
                Meta.addMeta(userName, data, valorDesejado);

                break;
            case 6:
                System.out.println("Digite o valor que deseja adicionar para a meta:");
                double valorMeta = sc.nextDouble();
                Meta.addInvestimento(valorMeta);
                break;
            default:
                System.out.println("Valor selecionado inválido, digite apenas um dos 7 valores!" + ResorceChat.breakLineResorc());
                break;
        }

        // fechar o outro scanner
        sc.close();
    }
}