package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        if (palavras.contains(palavra)) {
            System.out.printf("A palavra %s existe no conjunto%n", palavra);
            return;
        }
        System.out.printf("A palavra %s não existe no conjunto%n", palavra);
    }

    public  void exibirPalavrasUnicas(){
        for (String palavra: palavras){
            System.out.println(palavra);
        }
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Teste 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Teste 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Teste");
        conjuntoPalavrasUnicas.removerPalavra("Teste 1");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
