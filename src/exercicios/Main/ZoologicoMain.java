package exercicios.Main;

import exercicios.entities.zoologico.*;

public class ZoologicoMain {
    public static void main(String[] args) {
    	//Exercicio 2
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 3);
        Animal preguica = new Preguica("Sid", 2);

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
        
        
        //Exercicio 3
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
        
        
        //Exercicio 4
        Zoologico zoologico = new Zoologico();
        
        zoologico.adicionarAnimal(cachorro, 0);
        zoologico.adicionarAnimal(cavalo, 1);
        zoologico.adicionarAnimal(preguica, 2);
        zoologico.adicionarAnimal(new Cachorro("Bolt", 4), 3);
        zoologico.adicionarAnimal(new Cavalo("Shadowfax", 8), 4);
        zoologico.adicionarAnimal(new Preguica("Flash", 1), 5);
        zoologico.adicionarAnimal(new Cachorro("Rakan", 6), 6);
        zoologico.adicionarAnimal(new Cavalo("Storm", 15), 7);
        zoologico.adicionarAnimal(new Preguica("Preguicila", 1), 8);
        zoologico.adicionarAnimal(new Cachorro("Barão", 7), 9);

        zoologico.percorrerJaulas();
    }
}
