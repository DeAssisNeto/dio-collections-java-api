package main.java.list.Pesquisa.cruds;

import main.java.list.Pesquisa.modelos.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> pesquisa = new ArrayList<>();

        for (Livro livro: livros){
            if (livro.getAutor().equalsIgnoreCase(autor)) pesquisa.add(livro);
        }
        return pesquisa;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoIncial, int anoFinal){
        List<Livro> pesquisa = new ArrayList<>();

        for (Livro livro: livros){
            if (anoIncial <= livro.getAnoPublicacao() && livro.getAnoPublicacao() <= anoFinal){
                pesquisa.add(livro);
            }
        }

        return pesquisa;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for (Livro livro: livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) return livro;
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("A Menina que Roubava Livros", "Markus Zusak",  2005);
        catalogoLivros.adicionarLivro("O Ano das Bruxas", "ALEXIS HENDERSON",  2021);


        System.out.println(catalogoLivros.pesquisarPorTitulo("O Ano das Bruxas"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2005, 2006));
        System.out.println(catalogoLivros.pesquisarPorAutor("ALEXIS HENDERSON"));

    }
}
