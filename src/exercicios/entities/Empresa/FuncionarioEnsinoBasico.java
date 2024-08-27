package exercicios.entities.Empresa;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasica, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaBasica = escolaBasica;
    }
    
    @Override
    public double getRendaTotal() {
        return super.getRendaTotal() * 1.10;
    }


    @Override
    public String toString() {
        return super.toString()  
        		+ "\nEscola Básica: " + escolaBasica;
    }
}
