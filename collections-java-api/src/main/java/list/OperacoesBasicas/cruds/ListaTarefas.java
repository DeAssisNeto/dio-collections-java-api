package main.java.list.OperacoesBasicas.cruds;

import main.java.list.OperacoesBasicas.modelos.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;


    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removerTarefas = new ArrayList<>();
        for (Tarefa tarefa: tarefaList){
            if (tarefa.getDescricao().equals(descricao))
                removerTarefas.add(tarefa);
        }
        tarefaList.removeAll(removerTarefas);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa tarefa: tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
    }
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa 0");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("Tarefa 0");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();

    }

}
