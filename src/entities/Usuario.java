package entities;

import java.util.ArrayList;
import java.util.List;

import service.Biblioteca;

public class Usuario {
    private String nome;
    private int id;

    private List <ItemBiblioteca> itensEmprestados = new ArrayList<>();



    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void adicionarItem(ItemBiblioteca novoItem){
        itensEmprestados.add(novoItem);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Id: " + id;
    }
    
}
