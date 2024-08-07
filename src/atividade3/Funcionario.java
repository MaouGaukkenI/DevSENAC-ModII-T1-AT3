package Atividade3;

import java.util.Scanner;

public class Funcionario {
    private String _nome;
    private String _CPF;
    private String _endereco;
    private String _telefone;
    private String _setor;

    public Funcionario(String nome, String CPF, String endereco, String telefone, String setor) {
        _nome = nome;
        _CPF = CPF;
        _endereco = endereco;
        _telefone = telefone;
        _setor = setor;
    }
    
    public String getNome() {
        return _nome;
    }

    public String getCPF() {
        return _CPF;
    }

    public String getEndereco() {
        return _endereco;
    }

    public String getTelefone() {
        return _telefone;
    }

    public String getSetor() {
        return _setor;
    }
}
