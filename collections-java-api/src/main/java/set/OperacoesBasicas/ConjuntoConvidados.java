package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int condigoConvite){
        convidados.add(new Convidado(nome, condigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int condigoConvite){
        for (Convidado convidado: convidados){
            if (convidado.getCondigoConvite() == condigoConvite){
                convidados.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        for (Convidado convidado: convidados){
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


        conjuntoConvidados.adicionarConvidado("Alberto", 123);
        conjuntoConvidados.adicionarConvidado("Jurandir", 123);
        conjuntoConvidados.adicionarConvidado("Tamiris", 12243);
        conjuntoConvidados.adicionarConvidado("Alberto", 343);
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
        System.out.println("+=================================");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
        conjuntoConvidados.exibirConvidados();
    }
}
