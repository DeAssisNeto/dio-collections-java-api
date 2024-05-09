package main.java.list.Pesquisa.cruds;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> inteiros = new ArrayList<>();

    public SomaNumeros() {
        this.inteiros = new ArrayList<>();
    }


    public void adicionarNumero(int numero) {
        inteiros.add(numero);
    }

    public int calcularSoma(){
        int somaRet = 0;

        for (int num: inteiros){
            somaRet += num;
        }
        return somaRet;
    }

    public int encontrarMaiorNumero(){
        int maiorValor = 0;
        for (int num: inteiros){
            if (num > maiorValor) maiorValor = num;
        }
        return maiorValor;
    }

    public int encontrarMenorNumero(){
        int menorValor = inteiros.get(0);

        for (int num: inteiros){
            if (num < menorValor) menorValor = num;
        }
        return menorValor;
    }

    public List<Integer> exibirNumeros(){
        return inteiros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(1);

        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }

}
