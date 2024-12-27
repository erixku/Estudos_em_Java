package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculos {
    public static void main(String[] args) {

        LocalDate data01 = LocalDate.parse("2024-12-27");
        LocalDateTime data02 = LocalDateTime.parse("2024-12-27T02:18:54");
        Instant data03 = Instant.parse("2024-12-27T02:18:54Z");

        /*
        • Para que possamos realizar alterações nas datas já existentes, nós criamos novos objetos com as datas alteradas, e não alteramos os objetos originais
        • Para realizar acréscimos e deduções de datas, utilizamos os métodos com prefixos (respectivamente) "plus" e "minus" e o prefixo especifica qual unidade temporal será utlizada
         */
        LocalDate semanaPassada = data01.minusWeeks(1);
        LocalDate semanaSeguinte = data01.plusWeeks(1);

        //O mesmo se aplica à LocalDateTime, porém, o mesmo possui outras medidas de tempo que podem ser utlizadas
        LocalDateTime horaPassada = data02.minusHours(1);
        LocalDateTime horaSeguinte = data02.plusHours(1);

        /*
        Para o Instant, o acréscimo e dedução é realizado pelos métodos "plus" e "minus" apenas, porém, é necessário a que a unidade de tempo seja colocada como
        parâmetro junto do tempo que será utilizado, e a unidade de tempo é obtida por meio da classe "ChronoUnit" que possui métodos para cada unidade de tempo
        existente
         */
        //Instant mesPassado = data03.minus(1, ChronoUnit.YEARS);
        //Instant mesSeguinte = data03.plus(1, ChronoUnit.YEARS);

        System.out.println("Data Local: \nSemana Passada: " + semanaPassada + "\nSemana Seguinte: " + semanaSeguinte);
        System.out.println("Data e Hora Local: \nHora Passada: " + horaPassada + "\nHora Seguinte: " + horaSeguinte);
        //System.out.println("Instante: \nMês Passado: " + mesPassado + "\nMês Seguinte: " + mesSeguinte);

        /*
        Para que possamos calcular a duração de tempo entre duas datas, criamos um objeto "Duration" com o método "between" de sua própria classe, passando duas datas como parâmetro,
        porém, o duration funciona apenas com LocalDateTime, e para utilizar um LocalDate, é necessário uma adaptação, definindo um horário padrão para as duas datas:
         */
        Duration duracao = Duration.between(semanaPassada.atTime(0,0), data01.atTime(0,0));
        Duration duracao02 = Duration.between(horaPassada, data02);

        System.out.println("Duração em dias: " + duracao.toDays());
        System.out.println("Duração em horas: " + duracao02.toHours());
    }
}
