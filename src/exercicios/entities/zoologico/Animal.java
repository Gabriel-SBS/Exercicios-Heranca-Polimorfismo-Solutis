package exercicios.entities.zoologico;

public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void emitirSom();

    public void correr() {
        System.out.println("Este animal está correndo.");
    }
}