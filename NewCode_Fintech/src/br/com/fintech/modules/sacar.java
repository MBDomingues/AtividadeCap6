package br.com.fintech.modules;

//import resorce
import br.com.fintech.resorce.resorceChat;

public class sacar extends conta {
    public void sacarValor(double valorSaque) {
        // verifica o valor pra saque
        if (saldo < valorSaque) {
            System.out.println("Operação invalida! Valor maior que saldo!");
        } else if (valorSaque < 0) {
            System.out.println("Operação invalida! Valor deve ser maior que 0");
        } else {
            saldo =- valorSaque;

            // novo saldo
            System.out.println("Saldo: " + getSaldo());
            System.out.println(resorceChat.breakLineResorc() + resorceChat.lineResorc());
        }
    }
}
