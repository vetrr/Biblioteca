package application;

import java.util.Locale;

import entities.Hq;
import entities.Usuario;
import service.Biblioteca;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Biblioteca central = new Biblioteca();

        Usuario vitor = new Usuario("Vitor Hugo", 151);

        Hq hqAranha = new Hq("Macaco-Aranha", 2000, "Primataria", "Rick");

        System.out.println("--- ANTES DO EMPRÉSTIMO ---");
        System.out.println("O livro está: " + hqAranha.getStatus()); 

        System.out.println("\n--- REALIZANDO A OPERAÇÃO ---");
        central.emprestaItem(vitor, hqAranha);

        System.out.println("\n--- DEPOIS DO EMPRÉSTIMO ---");
        System.out.println("O livro agora está: " + hqAranha.getStatus());
        
        System.out.println("\n--- TENTANDO EMPRESTAR DE NOVO ---");
        central.emprestaItem(vitor, hqAranha);
    }
}