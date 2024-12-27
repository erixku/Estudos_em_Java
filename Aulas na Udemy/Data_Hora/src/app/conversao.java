package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/*
Classe para a demonstração de conversão de datas globais para datas locais
Autor: Erick Gomes Barbosa
 */

public class conversao {
    public static void main(String[] args) {

        LocalDate data01 = LocalDate.parse("2024-12-27");
        LocalDateTime data02 = LocalDateTime.parse("2024-12-27T02:18:54");
        Instant data03 = Instant.parse("2024-12-27T02:18:54Z");

        //Para que possamos converter um Instant para um LocalDate, devemos utilizar o método ".ofInstant()", que exige a data Instant e o fuso-horário desejado
        LocalDate result01 = LocalDate.ofInstant(data03, ZoneId.systemDefault());
        LocalDate result02 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));

        //O mesmo se aplica a LocalDateTime:
        LocalDateTime result03 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
        LocalDateTime result04 = LocalDateTime.ofInstant(data03, ZoneId.of("Portugal"));

        System.out.println("Resultado 01: " + result01);
        System.out.println("Resultado 02: " + result02);
        System.out.println("Resultado 03: " + result03);
        System.out.println("Resultado 04: " + result04);

        //Para que possamos extrair informações de um LocalDate ou LocalDateTime, devemos utilizar um método que possui o prefixo "get", para colhetarmos o que quisermos
        System.out.println("Dia de data01: " + data01.getDayOfMonth());
        System.out.println("Mês de data01: " + data01.getMonth());
        System.out.println("Ano de data01: " + data01.getYear());

    }
}
