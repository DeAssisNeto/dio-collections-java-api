package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Dicionario{" +
                "palavras=" + palavras +
                '}';
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavras);
    }

    public String pesquisarPorPalavra(String palavra){
        return palavras.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();


        dicionario.adicionarPalavra("Jose", "Nome do meu amigo José");
        dicionario.adicionarPalavra("Pão", "Nome de um produto comestível");
        System.out.println(dicionario.pesquisarPorPalavra("Jose"));
        dicionario.removerPalavra("Pão");

        dicionario.exibirPalavras();
    }
}
