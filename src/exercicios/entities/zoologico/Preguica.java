package exercicios.entities.zoologico;

public class Preguica extends Animal {
	
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está emitindo um som.");
    }

    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em árvores.");
    }
}
