// package coreJava
package br.com.fintech.modules;

// import bibliotecas
import java.util.Scanner;

//import resorce
import br.com.fintech.resorce.ResorceChat;

// class metas
public class Meta extends Conta {
    // criando vars privados
    private static String nomeMeta;
    private static String mesAnoMetaFinal;
    private static double valorMeta;
    private static double saldoInvstimento;
    private static double investimento;

    // getters
    public static String getNomeMeta() { return nomeMeta; }

    public static double getValorMeta() { return valorMeta; }

    public static String getMesAnoMetaFinal() { return mesAnoMetaFinal; }

    public static double getSaldoInvstimento() { return saldoInvstimento; }

    // apresentação da sua meta
    public static void showMeta() {
        if (nomeMeta == null) {
            System.out.println("Você não possui metas cadastradas!");
        } else {
            System.out.println("Sua meta de investimetno se encontra assim:");
            System.out.println(ResorceChat.breakLineResorc());
            System.out.println("Nome: " + getNomeMeta());
            System.out.println("Data final: " + getMesAnoMetaFinal());
            System.out.println("Valor da meta: " + getValorMeta());
            System.out.println("Saldo da meta: " + getSaldoInvstimento());
            System.out.println(ResorceChat.breakLineResorc() + ResorceChat.lineResorc());
        }
    }

    //adicionar meta
    public static void addMeta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Atribua um nome para a sua meta:");
        nomeMeta = sc.nextLine();
        System.out.println("Informe a data final para atingir a meta:");
        mesAnoMetaFinal = sc.nextLine();
        System.out.println("Informe o quanto deseja alcançar");
        valorMeta = sc.nextDouble();
    
        // fechar scanner
        sc.close();
    }

    // adionar investimento
    public static void addInvestimento(double valorInvestimento) {
        // verificador valor saldo
        if (getSaldo() < valorInvestimento) {
            System.out.println("operação invalida!");
        } else {
            saldo -= valorInvestimento;
            investimento = valorInvestimento;
            saldoInvstimento += valorInvestimento;

            // apresentação das infos do investimento
            System.out.println(ResorceChat.breakLineResorc());
            System.out.println("Valor acumulado atual: " + getSaldoInvstimento());
            System.out.println("Valor investido: " + investimento);
            System.out.println("Valor investido: " + getSaldo());
            System.out.println(ResorceChat.breakLineResorc() + ResorceChat.lineResorc());
        }
    }


    // setters
    public void setNomeMeta(String nome) { this.nomeMeta = nome; }

    public void setMesAnoMetaFinal(String mesAnoMetaFinal) { this.mesAnoMetaFinal = mesAnoMetaFinal; }

    public void setValorMeta(double valorMeta) { this.valorMeta = valorMeta; }

    public void setSaldoInvstimento(double saldoInvstimento) { this.saldoInvstimento = saldoInvstimento; }

    public void setInvestimento(double investimento) { this.investimento = investimento; }
}


