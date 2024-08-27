package exercicios.entities.Empresa;

public class Funcionario {
    private String nome;
    private int codigoFuncionario;
    private double rendaBasica = 1000;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncionario, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncionario = codigoFuncionario;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }
    
    public double getRendaTotal() {
        return rendaBasica + (comissao != null ? comissao.getValorComissao() : 0);
    }

    public String toString() {
        return String.format("Nome: %s\n"
        		+ "Código Funcional: %d\n"
        		+ "Comissão: R$ %.2f\n"
        		+ "Salário Total: R$ %.2f\n", getNome(), getCodigoFuncionario(), comissao != null ? comissao.getValorComissao() : 0 ,getRendaTotal());
        
    }

}

