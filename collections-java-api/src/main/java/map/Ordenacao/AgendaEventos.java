package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println(new TreeMap<>(eventos));
    }

    public Evento obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        for (LocalDate data: eventosOrdenados.keySet()){
            if (data.isEqual(dataAtual) || data.isAfter(dataAtual)){
                return eventos.get(data);
            }
        }
        throw new RuntimeException("Não há nenhum evento proximo registrado!");
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 11),
                "Parque de diversões", "Parque de diverções Noite Feliz");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 4, 5),
                "Circo", "Circo do palhaço Cheirozinho");

        System.out.println(agendaEventos.obterProximoEvento());

        agendaEventos.exibirAgenda();
    }
}
