package br.com.fintech.modules;
//import resorce
import br.com.fintech.resorce.ResorceChat;


public class Depositar extends Conta {
    public static void depositarValor(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Operação invalida! valor deve ser maior que 0!");
        } else {
            saldo += valorDeposito;

            // novo saldo
            System.out.println("Saldo: " + getSaldo());
            System.out.println(ResorceChat.breakLineResorc() + ResorceChat.lineResorc());
        }
    }
}
