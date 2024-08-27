package exercicios.entities.Empresa;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia, comissao);
        this.universidade = universidade;
    }

    @Override
    public double getRendaTotal() {
    	return super.getRendaTotal() * 2;
    }
    
    @Override
    public String toString() {
        return super.toString() 
        		+ "\nUniversidade: " + universidade;
    }
}
