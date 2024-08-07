package Atividade3;

import java.util.Scanner;
import java.util.ArrayList;

public class Atividade3 {
    public static void main(String[] args) {
        String nome;
        String CPF;
        String endereco;
        String telefone;
        String setor;
        float horas;
        float valorh;
        float total;
        float salario;
        int i;

        Scanner input = new Scanner(System.in);
        Scanner TipoF = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<>(10);
        
        while (funcionarios.size() < 2){
            System.out.println("Tipo de pagamento (horista/assalariado):");
            String funcT = TipoF.nextLine();

            if ("horista".equals(funcT)) {
                System.out.println("Dados do funcionario:");
                System.out.println("Nome:");
                nome = input.nextLine();
                System.out.println("CPF:");
                CPF = input.nextLine();
                System.out.println("Endereço:");
                endereco = input.nextLine();
                System.out.println("Telefone:");
                telefone = input.nextLine();
                System.out.println("Setor:");
                setor = input.nextLine();
                System.out.println("Valor da hora de trabalho:");
                valorh = input.nextFloat();
                System.out.println("Quantas horas o funcionario trabalhou?:");
                horas = input.nextFloat();
                total = horas * valorh;

                Horista horista = new Horista(nome, CPF, endereco, telefone, setor, horas, valorh, total);
                funcionarios.add(horista);
                
                input.nextLine(); // Limpeza do buffer.
            } else if ("assalariado".equals(funcT)) {
                System.out.println("Dados do funcionario:");
                System.out.println("Nome:");
                nome = input.nextLine();
                System.out.println("CPF:");
                CPF = input.nextLine();
                System.out.println("Endereço:");
                endereco = input.nextLine();
                System.out.println("Telefone:");
                telefone = input.nextLine();
                System.out.println("Setor:");
                setor = input.nextLine();
                System.out.println("Valor do salario:");
                salario = input.nextFloat();

                Assalariado assalariado = new Assalariado(nome, CPF, endereco, telefone, setor, salario);
                funcionarios.add(assalariado);
                
                input.nextLine(); // Limpeza do buffer.
            } else {
                System.out.println("Valor incorreto, tente novamente");
            }
        }

        i = 1;
        for (Funcionario funcionario : funcionarios) {
            
            if (funcionario instanceof Horista) {
                ((Horista) funcionario).MostrarDados_h(i);
            } else if (funcionario instanceof Assalariado) {
                ((Assalariado) funcionario).MostrarDados_a(i);
            }
            i++;
        }

        System.out.println("Informe o aumento geral (em porcentagem):");
        double aumentoGeral = input.nextDouble();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Horista) {
                ((Horista) funcionario).AplicarAumento(aumentoGeral);
            } else if (funcionario instanceof Assalariado) {
                ((Assalariado) funcionario).AplicarAumento(aumentoGeral);
            }
        }

        i = 1;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Horista) {
                ((Horista) funcionario).MostrarDados_h(i);
            } else if (funcionario instanceof Assalariado) {
                ((Assalariado) funcionario).MostrarDados_a(i);
            }
            i++;
        }
         input.close();
    }
}
