package main.java.list.OperacoesBasicas.cruds;

import main.java.list.OperacoesBasicas.modelos.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> items;

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removerItems = new ArrayList<>();

        for (Item item: items){
            if (item.getNome().equalsIgnoreCase(nome)) removerItems.add(item);
        }
        items.removeAll(removerItems);
    }

    public double calcularValorTotal() {
        double total = 0.0;

        for (Item item: items){
            total += (item.getPreco()*item.getQuantidade());
        }
        return total;
    }

    public void exibirItens(){
        for (Item item: items){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Feijão", 8.1, 3);
        carrinhoDeCompras.adicionarItem("Arroz", 5.1, 5);
        carrinhoDeCompras.adicionarItem("Leite", 5.67, 7);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("feijão");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }



}
