package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    @Override
    public String toString() {
        return "ContagemPalavras{" +
                "palavras=" + palavras +
                '}';
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavras);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente(){
        Map<String, Integer> palavraMairFrequencia = new HashMap<>();
        Integer maiorFrequencia = Integer.MIN_VALUE;
        String palavra = "";
        for (Map.Entry<String, Integer> entry: palavras.entrySet()){
            if (entry.getValue() > maiorFrequencia) {
                maiorFrequencia = entry.getValue();
                palavra = entry.getKey();
            }
        }
        palavraMairFrequencia.put(palavra, maiorFrequencia);
        return palavraMairFrequencia;
    }

//    adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem
//    removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente
//    exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens
//    encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();


        contagemPalavras.adicionarPalavra("Pizza", 4);
        contagemPalavras.adicionarPalavra("Arroz", 10);
        contagemPalavras.adicionarPalavra("Pinha", 2);
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.removerPalavra("Pizza");
        contagemPalavras.exibirContagemPalavras();

    }

}
