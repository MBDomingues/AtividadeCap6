package br.com.fintech.modules;

// import modules
import br.com.fintech.resorce.ResorceChat;


public class Conta {
    // criar variaveis
    protected static double saldo; // protected para poder ser modificado
    private static String nome;

    // apresentaçao das contas
    public static void showAccount() {
        System.out.println(ResorceChat.lineResorc() + ResorceChat.breakLineResorc());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: " + getSaldo());
        System.out.println(ResorceChat.breakLineResorc() + ResorceChat.lineResorc());
    }


    // setters
    public static void setNome(String n) { nome = n; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // getters
    public static double getSaldo() { return saldo; }
    public static String getNome() { return nome; }
}
