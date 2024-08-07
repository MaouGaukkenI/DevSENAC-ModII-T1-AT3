package Atividade3;

import java.util.Scanner;

public class Horista extends Funcionario {
    private float _horas;
    private float _valorh;
    private float _total;

    public Horista(String nome, String CPF, String endereco, String telefone, String setor, float horas, float valorh, float total) {
        super(nome, CPF, endereco, telefone, setor);
        _horas = horas;
        _valorh = valorh;
        _total = total;
    }

    public void MostrarDados_h(int i) {
        System.out.println("\nFuncionario" + i + ":\nNome: " + getNome() + "\nCPF: " + getCPF() + "\nEndereço: " + getEndereco() + "\nTelefone: " + getTelefone());
        System.out.println("Setor em que o funcionario atua: " + getSetor() + "\nPagamento: " + _total);
        System.out.println("\n");
    }

    // Método para aplicar o aumento salarial
    public void AplicarAumento(double aumentoPercentual) {
        this._total = (int) (this._total * (1 + aumentoPercentual / 100));
    }
}
