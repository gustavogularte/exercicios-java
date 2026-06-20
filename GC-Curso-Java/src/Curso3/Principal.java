package Curso3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    static void main() {
        String tarefa = "Enviar relatório semanal";
        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();
        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);

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

        LocalDate dataDeVencimento = LocalDate.of(2026, 4, 25);
        LocalDate novaDataDeVencimento = dataDeVencimento.plusMonths(2);
        System.out.println("Nova data de vencimento: " + dataFormatada.format(novaDataDeVencimento));

        LocalDate dataDoEvento = LocalDate.of(2026, 6, 19);
        if (dataDoEvento.isAfter(data)) {
            System.out.println("Evento está por vir");
        } else if (dataDoEvento.isBefore(data)) {
            System.out.println("O evento já ocorreu");
        } else if (dataDoEvento.isEqual(data)) {
            System.out.println("O evento é hoje");
        }

        LocalDate vencimento = LocalDate.of(2026, 7, 25);
        int diasDeAntecedencia = 5;
        String avisoDeVencimento = dataFormatada.format(vencimento.minusDays(diasDeAntecedencia)) ;
        System.out.println("Data do lembrete: " + avisoDeVencimento);

        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter horasFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioTokyoFormatado = horarioTokyo.format(horasFormatada);
        System.out.println(horarioTokyoFormatado);

        ZonedDateTime horarioAtual = ZonedDateTime.now();
        ZonedDateTime horarioAtualSydney = horarioAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println("Horário atual no sistema: " + horarioAtual.format(horaFormatada));
        System.out.println("Horário atual em Sydney: " + horarioAtualSydney.format(horaFormatada));

        LocalTime horarioDeEntrada = LocalTime.of(12, 30,0);
        int cargaHorario = 8;
        LocalTime horarioDeSaidaPrevisto = horarioDeEntrada.plusHours(cargaHorario);
        LocalTime horarioDeSaida = LocalTime.of(17, 29,0);
        Duration horasTrabalhadas = Duration.between(horarioDeSaidaPrevisto, horarioDeSaida);

        System.out.printf("Saldo de horas: %dh %dmin", horasTrabalhadas.toHours(), horasTrabalhadas.toMinutesPart());
    }
}
