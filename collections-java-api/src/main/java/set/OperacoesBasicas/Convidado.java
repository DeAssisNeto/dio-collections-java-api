package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int condigoConvite;

    public Convidado(String nome, int condigoConvite) {
        this.nome = nome;
        this.condigoConvite = condigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", condigoConvite=" + condigoConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return condigoConvite == convidado.condigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(condigoConvite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCondigoConvite() {
        return condigoConvite;
    }

    public void setCondigoConvite(int condigoConvite) {
        this.condigoConvite = condigoConvite;
    }
}
