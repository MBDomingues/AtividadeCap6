package br.com.fintech.modules;

public class Cadastro extends Login {
     private String nome;
     private String cpf;
     private String confirmaSenha;
     private String newEmail = getEmail();
     private String newSenha = getSenha();


    public String getNewSenha() {
        return newSenha;
    }

    public void setNewSenha(String newSenha) {
        this.newSenha = newSenha;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Cadastro() {}
}

