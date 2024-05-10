package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefas.remove(tarefa);
                return;
            }
        }
        throw new RuntimeException("Tarefa inexistente!");
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConluidas = new HashSet<>();

        for (Tarefa tarefa: tarefas){
            if (tarefa.isConcluida()) tarefasConluidas.add(tarefa);
        }
        return tarefasConluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasConluidas = new HashSet<>();

        for (Tarefa tarefa: tarefas){
            if (!tarefa.isConcluida()) tarefasConluidas.add(tarefa);
        }
        return tarefasConluidas;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(true);
                return;
            }
        }
        throw new RuntimeException("Tarefa inexistente!");
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluida(false);
                return;
            }
        }
        throw new RuntimeException("Tarefa inexistente!");
    }

    public  void limparListaTarefas(){
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.adicionarTarefa("Fazer o bolo");
        listaTarefas.adicionarTarefa("Lavar roupa");
        listaTarefas.adicionarTarefa("Cortar o cabelo");
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.marcarTarefaConcluida("Fazer o bolo");
        listaTarefas.marcarTarefaConcluida("Lavar roupa");
        listaTarefas.marcarTarefaPendente("Lavar roupa");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Cortar o cabelo");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();



    }
}
