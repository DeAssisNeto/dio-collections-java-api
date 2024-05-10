package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }


    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
            System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        if (contatos.isEmpty()) throw new RuntimeException("A lista de contatos está vazia!");

        Set<Contato> pesquisa = new HashSet<>();
        for (Contato contato: contatos){
            if (contato.getNome().startsWith(nome)) pesquisa.add(contato);
        }
        return pesquisa;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato contato: contatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                return;
            }
        }
        throw new RuntimeException(String.format("Não há contato registrado com o nome: %s", nome));
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Immanuelle", 1243134);
        agendaContatos.adicionarContato("Immanuelle Leite", 1243134);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Immanuell"));
        agendaContatos.atualizarNumeroContato("Immanuelle",23421);
        agendaContatos.exibirContatos();

    }

}
