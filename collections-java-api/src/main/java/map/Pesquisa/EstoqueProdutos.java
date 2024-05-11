package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for (Produto produto: produtos.values()){
            valorTotal += produto.getQuantidade() * produto.getPreco();
        }
        return  valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        double maisCaro = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        for (Produto produto: produtos.values()){
            if (produto.getPreco() > maisCaro) {
                maisCaro = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        double maisBarato = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        for (Produto produto: produtos.values()){
            if (produto.getPreco() < maisBarato) {
                maisBarato = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double maisCaro = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        for (Produto produto: produtos.values()){
            if ((produto.getPreco() * produto.getQuantidade()) > maisCaro) {
                maisCaro = produto.getPreco() * produto.getQuantidade();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(123L,"Feijão" , 32, 8.97);
        estoqueProdutos.adicionarProduto(124L,"Arroz" , 100, 4.99);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    }
}
