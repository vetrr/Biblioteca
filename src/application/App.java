package application;

import java.util.Locale;

import entities.Hq;
import entities.ItemBiblioteca;
import entities.Livro;
import entities.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("------Imprimindo a classe ItemBiblioteca------");
        ItemBiblioteca itemBibli = new ItemBiblioteca("Macaco-Aranha", 2000);
        System.out.println(itemBibli);
        System.out.println();

        System.out.println("------Imprimindo a classe Hq------");
        Hq quadrinho = new Hq("Macaco-Aranha", 2000, "Primataria", "Rick");
        System.out.println(quadrinho);
        System.out.println();
        
        System.out.println("------Imprimindo o Livro------");
        Livro livro1 = new Livro("Livro", 2015, 131415, 235);
        System.out.println(livro1);
        System.out.println();

        System.out.println("------Imprimindo o Usuario------");
        Usuario usuario = new Usuario("Vitor Hugo", 151);
        System.out.println(usuario);
        System.out.println();
        
    }
}
