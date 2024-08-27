package exercicios.Main;

import exercicios.entities.Empresa.*;

public class EmpresaMain {
	public static void main(String[] args) {
		System.out.println("Atividade 5,6 e 9");
		System.out.println("------------------");
		//Exercício 5 e 6 e 9
        Funcionario f1 = new Funcionario("João", 1, new ComissaoVendedor());
        Funcionario f2 = new FuncionarioEnsinoBasico("Maria", 2, "Escola Estadual A", new ComissaoVendedor());
        Funcionario f3 = new FuncionarioEnsinoMedio("Pedro", 3, "Escola Estadual B", "Escola Técnica C", new ComissaoSupervisor());
        Funcionario f4 = new FuncionarioGraduado("Ana", 4, "Escola Estadual D", "Escola Estadual F", "Universidade F", new ComissaoGerente());

        System.out.println(f1 + "\n");
        System.out.println(f2 + "\n");
        System.out.println(f3 + "\n");
        System.out.println(f4 + "\n");
        
        System.out.println("Atividade 7,10 e 11");
        System.out.println("------------------");
        
        //Ecercício 7 e 10 e 11
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new FuncionarioEnsinoBasico("Julia", 5, "Escola Estadual A",new ComissaoVendedor());
        funcionarios[1] = new FuncionarioEnsinoBasico("João", 6, "Escola Estadual B", new ComissaoVendedor());
        funcionarios[2] = new FuncionarioEnsinoMedio("Marcio", 7, "Escola Estadual C", "Escola Técnica D", new ComissaoVendedor());
        funcionarios[3] = new FuncionarioEnsinoMedio("Carlos", 8, "Escola Estadual E", "Escola Técnica F", new ComissaoSupervisor());
        funcionarios[4] = new FuncionarioGraduado("Paula", 9, "Escola Estadual G", "Escola Técnica H", "Universidade I", new ComissaoGerente());
        funcionarios[5] = new FuncionarioEnsinoBasico("Juliana", 10, "Escola Estadual J", new ComissaoVendedor());
        funcionarios[6] = new FuncionarioEnsinoMedio("Lucas", 11, "Escola Estadual K", "Escola Técnica L", new ComissaoVendedor() );
        funcionarios[7] = new FuncionarioEnsinoMedio("Marcos", 12, "Escola Estadual M", "Escola N", new ComissaoVendedor());
        funcionarios[8] = new FuncionarioGraduado("Fernanda", 13, "Escola Estadual O", "Escola P", "Universidade Q",new ComissaoSupervisor());
        funcionarios[9] = new FuncionarioEnsinoBasico("Paulo", 14, "Escola Estadual R",new ComissaoVendedor());

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario func : funcionarios) {
            double salario = func.getRendaTotal();
            custoTotal += salario;

            if (func instanceof FuncionarioGraduado) {
                custoSuperior += salario;
            } else if (func instanceof FuncionarioEnsinoMedio) {
                custoMedio += salario;
            } else if (func instanceof FuncionarioEnsinoBasico) {
                custoBasico += salario;
            }
            System.out.println(func + "\n");
        }

        System.out.printf("Custo total da empresa: R$ %.2f", custoTotal);
        System.out.printf("\nCusto com funcionários de Ensino Básico: R$ %.2f", custoBasico);
        System.out.printf("\nCusto com funcionários de Ensino Médio: R$ %.2f", custoMedio);
        System.out.printf("\nCusto com funcionários de Ensino Superior: R$ %.2f", custoSuperior);
    }

}
