package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void obterProximoEvento() {
    // Set<LocalDate> dateSet = eventosMap.keySet();
    // Collection<Evento> values = eventosMap.values();
    // eventosMap.get(); esse metodo nao funciona pois a proxima data do evento nao
    // é conhecida

    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();
        System.out.println("O proximo evento: " + proximoEvento + "acontecera na data " + proximaData);
        break;
      }
    }

    System.out.println(LocalDate.now());
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 19), "Evento 1", "Atracao 1");
    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");

    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 10), "Evento 3", "Atracao 3");

    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 10), "Evento 4", "Atracao 4");
    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 18), "Evento 5", "Atracao 5");
    agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();
  }

}
