package main.java.list.Ordenacao.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        if (pessoas.isEmpty()) throw new RuntimeException("Lista vazia!");
        List<Pessoa> ordenar = new ArrayList<>(pessoas);
        Collections.sort(ordenar);
        System.out.println(ordenar);
        return ordenar;
    }

    public List<Pessoa> ordenarPorAltura(){
        if (pessoas.isEmpty()) throw new RuntimeException("Lista vazia!");
        List<Pessoa> ordenar = new ArrayList<>(pessoas);
        Collections.sort(ordenar, new ComparatorPorAltura());
        System.out.println(ordenar);
        return ordenar;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("José", 30, 1.78);
        ordenacaoPessoas.adicionarPessoa("Eduardo", 25, 1.71);
        ordenacaoPessoas.adicionarPessoa("José", 60, 1.82);
        ordenacaoPessoas.adicionarPessoa("Enzo", 14, 1.90);
        ordenacaoPessoas.ordenarPorIdade();
        ordenacaoPessoas.ordenarPorAltura();


    }

}
