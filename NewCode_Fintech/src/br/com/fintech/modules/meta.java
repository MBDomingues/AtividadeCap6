// package coreJava
package br.com.fintech.modules;

//import resorce
import br.com.fintech.resorce.resorceChat;

// class metas
public class meta extends conta {
    // criando vars privados
    private String nomeMeta;
    private String mesAnoMetaFinal;
    private double valorMeta;
    private double saldoInvstimento;
    private double investimento;


    // apresentação da sua meta
    public void showMeta() {
        System.out.println("Sua meta de investimetno se encontra assim:");
        System.out.println(resorceChat.breakLineResorc());
        System.out.println("Nome: " + getNomeMeta());
        System.out.println("Data final: " + getMesAnoMetaFinal());
        System.out.println("Valor da meta: " + getValorMeta());
        System.out.println("Saldo da meta: " + getSaldoInvstimento());
        System.out.println(resorceChat.breakLineResorc() + resorceChat.lineResorc());
    }


    // adionar investimento
    public void addInvestimento(double valorInvestimento) {
        // verificador valor saldo
        if (getSaldo() < valorInvestimento) {
            System.out.println("operação invalida!");
        } else {
            saldo -= valorInvestimento;
            investimento = valorInvestimento;
            saldoInvstimento += valorInvestimento;

            // apresentação das infos do investimento
            System.out.println(resorceChat.breakLineResorc());
            System.out.println("Valor acumulado atual: " + getSaldoInvstimento());
            System.out.println("Valor investido: " + investimento);
            System.out.println("Valor investido: " + getSaldo());
            System.out.println(resorceChat.breakLineResorc() + resorceChat.lineResorc());
        }
    }


    // setters
    public void setNomeMeta(String nome) { this.nomeMeta = nome; }

    public void setMesAnoMetaFinal(String mesAnoMetaFinal) { this.mesAnoMetaFinal = mesAnoMetaFinal; }

    public void setValorMeta(double valorMeta) { this.valorMeta = valorMeta; }

    public void setSaldoInvstimento(double saldoInvstimento) { this.saldoInvstimento = saldoInvstimento; }

    public void setInvestimento(double investimento) { this.investimento = investimento; }


    //getters
    public String getNomeMeta() { return nomeMeta; }

    public double getValorMeta() { return valorMeta; }

    public String getMesAnoMetaFinal() { return mesAnoMetaFinal; }

    public double getSaldoInvstimento() { return saldoInvstimento; }
}
