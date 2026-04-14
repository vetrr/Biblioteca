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
    
    // Verifica se o livro está disponível
    if(item.getStatus() == Status.DISPONIVEL) {
        
        // Passo 1: Muda a etiqueta do livro para emprestado
        item.setStatus(Status.EMPRESTADO); 
        
        // Passo 2: Usa o método que você acabou de criar no Usuário para guardar o livro
        usuario.adicionarItem(item); 
        
        System.out.println("Empréstimo realizado com sucesso!");
    } else {
        System.out.println("Este item não está disponível.");
    }
}

}
