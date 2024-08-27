package exercicios.entities.Empresa;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, comissao);
        this.escolaMedia = escolaMedia;
    }
    
    @Override
    public double getRendaTotal() {
    	return super.getRendaTotal() * 1.50;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEscola Média: " + escolaMedia;
    }
}