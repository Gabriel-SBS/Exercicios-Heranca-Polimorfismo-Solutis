package exercicios.entities.zoologico;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(Animal animal, int jaula) {
        if (jaula >= 0 && jaula < jaulas.length) {
            jaulas[jaula] = animal;
        } else {
            System.out.println("Número de jaula inválido.");
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] != null) {
                System.out.println("Jaula " + (i + 1) + ":");
                jaulas[i].emitirSom();
                if (jaulas[i] instanceof Cachorro || jaulas[i] instanceof Cavalo) {
                    jaulas[i].correr();
                } else if (jaulas[i] instanceof Preguica) {
                    ((Preguica) jaulas[i]).subirEmArvores();
                }
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
            }
        }
    }
    
}
