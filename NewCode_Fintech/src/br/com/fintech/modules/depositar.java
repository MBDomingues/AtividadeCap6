package br.com.fintech.modules;

//import resorce
import br.com.fintech.resorce.resorceChat;


public class depositar extends conta {
    public void depositarValor(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Operação invalida! valor deve ser maior que 0!");
        } else {
            saldo += valorDeposito;

            // novo saldo
            System.out.println("Saldo: " + getSaldo());
            System.out.println(resorceChat.breakLineResorc() + resorceChat.lineResorc());
        }
    }
}
