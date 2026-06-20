package Curso3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    static void main() {
        String tarefa = "Enviar relatório semanal";
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);

        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Data formatada: " + dataFormatada.format(data));
        System.out.println("Hora formatada: " + horaFormatada.format(hora));

        LocalTime inicioDaAtividade = LocalTime.of(10, 30,0);
        LocalTime fimDaAtividade = LocalTime.of(15, 45,30);

        Duration duracao = Duration.between(inicioDaAtividade, fimDaAtividade);

        System.out.printf("Diferença de tempo: %d horas e %d minutos \n",  duracao.toHours(), duracao.toMinutesPart());

        LocalDate dataDeInicio = LocalDate.now();
        int prazoDeDias = 3;
        LocalDate dataEntrega = dataDeInicio.plusDays(prazoDeDias);
        String dataEntregaFormatada = dataFormatada.format(dataEntrega);
        System.out.println("Data de entrega: " + dataEntregaFormatada);
    }
}
