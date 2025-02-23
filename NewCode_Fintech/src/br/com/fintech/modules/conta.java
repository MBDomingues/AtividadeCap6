package br.com.fintech.modules;

// import modules
import br.com.fintech.resorce.resorceChat;


public class conta {
    // criar variaveis
    protected static double saldo; // protected para poder ser modificado
    private static String nome;

    // apresentaçao das contas
    void showAccount() {
        System.out.println(resorceChat.lineResorc() + resorceChat.breakLineResorc());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: " + getSaldo());
        System.out.println(resorceChat.breakLineResorc() + resorceChat.lineResorc());
    }


    // setters
    public static void setNome(String n) { this.nome = n; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // getters
    public static double getSaldo() { return saldo; }
    public static String getNome() { return nome; }
}
