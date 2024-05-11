package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatos=" + contatos +
                '}';
    }

    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!contatos.isEmpty()) contatos.remove(nome);

    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome){
        return  contatos.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Tamiris", 1234);
        System.out.println(agendaContatos.pesquisarPorNome("Tamiris"));
        agendaContatos.removerContato("Tamiris");
        agendaContatos.removerContato("Tamiris");
        agendaContatos.exibirContatos();
    }
}
