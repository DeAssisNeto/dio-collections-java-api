package main.java.list.Ordenacao;

import java.util.Comparator;


public class Pessoa implements Comparable<Pessoa> {
    private String name;
    private int idade;
    private double altura;

    public Pessoa(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}