package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencaoNumeros {
    private List<Integer> numeros;

    public OrdencaoNumeros() {
        this.numeros = new ArrayList<>();
    }


    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        if (numeros.isEmpty()) throw new RuntimeException("Lista vazia!");
        List<Integer> ordenar = new ArrayList<>(numeros);
        Collections.sort(ordenar);
        return ordenar;
    }

    public List<Integer> ordenarDescendente(){
        if (numeros.isEmpty()) throw new RuntimeException("Lista vazia!");
        List<Integer> ordenar = new ArrayList<>(numeros);
        ordenar.sort(Collections.reverseOrder());
        return ordenar;
    }

    public static void main(String[] args) {
        OrdencaoNumeros ordencaoNumeros = new OrdencaoNumeros();

        ordencaoNumeros.adicionarNumero(6);
        ordencaoNumeros.adicionarNumero(76);
        ordencaoNumeros.adicionarNumero(45);
        ordencaoNumeros.adicionarNumero(634);
        ordencaoNumeros.adicionarNumero(8);

        System.out.println(ordencaoNumeros.ordenarAscendente());
        System.out.println(ordencaoNumeros.ordenarDescendente());
    }

}
