package main.java.set.Ordenacao;

import java.util.*;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }


    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        return new TreeSet<>(produtos);
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> ordenar = new TreeSet<>(new ComparatorPorpreco());
        ordenar.addAll(produtos);
        return ordenar;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(123, "pão", 0.7, 100);
        cadastroProdutos.adicionarProduto(124, "Arroz", 4.97, 10);
        cadastroProdutos.adicionarProduto(125, "Feijão", 8.19, 20);
        cadastroProdutos.adicionarProduto(126, "Mortadela", 12.32, 700);
        cadastroProdutos.adicionarProduto(127, "Macarrão", 2.45, 900);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
