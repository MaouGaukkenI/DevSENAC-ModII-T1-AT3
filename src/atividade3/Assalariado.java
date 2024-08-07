package Atividade3;

import java.util.Scanner;

public class Assalariado extends Funcionario {
    private float _salario;

    public Assalariado(String nome, String CPF, String endereco, String telefone, String setor, float salario) {
        super(nome, CPF, endereco, telefone, setor);
        _salario = salario;
    }

    public void MostrarDados_a(int i) {
        System.out.println("\nFuncionario" + i + ":\nNome: " + getNome() + "\nCPF: " + getCPF() + "\nEndereço: " + getEndereco() + "\nTelefone: " + getTelefone());
        System.out.println("Setor em que o funcionario atua: " + getSetor() + "\nSalario: " + _salario);
        System.out.println("\n");
    }
    
    public void AplicarAumento(double aumentoPercentual) {
        this._salario = (int) (this._salario * (1 + aumentoPercentual / 100));
    }
}
