package service;

import java.util.ArrayList;
import java.util.List;

import entities.ItemBiblioteca;
import entities.Usuario;
import entities.enums.Status;

public class Biblioteca {
    List <ItemBiblioteca> item = new ArrayList<>();
    List <Usuario> usuarios = new ArrayList<>();

    public void emprestaItem(Usuario usuario, ItemBiblioteca item) {
    
    if(item.getStatus() == Status.DISPONIVEL) {
        
        item.setStatus(Status.EMPRESTADO); 
        
        usuario.adicionarItem(item); 
        
        System.out.println("Empréstimo realizado com sucesso!");
    } else {
        System.out.println("Este item não está disponível.");
    }
    
    }
}
