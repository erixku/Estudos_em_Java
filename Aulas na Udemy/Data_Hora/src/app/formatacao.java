package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatacao {
    public static void main(String[] args) {
        //Para que formatemos as datas a serem utlizadas, devemos instanciar objetos do tipo DateTimeFormater para especificarmos o formato que queremos
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Para a formatação de uma data global, devemos utilizar um método do DateTimeFormatter que indica que haverá uma zona de fuso horário
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate data01 = LocalDate.parse("2024-12-27");
        LocalDateTime data02 = LocalDateTime.parse("2024-12-27T02:18:54");
        Instant data03 = Instant.parse("2024-12-27T02:18:54Z");

        //Podemos utilizar tanto o ".format" do objeto da data quanto da formatação, da seguinte forma:
        System.out.println("Data 01: " + data01.format(fmt01));
        System.out.println("Data 01: " + fmt01.format(data01));

        //Também, podemos chamar toda a formatação diretamente:
        System.out.println("Data 01: " + data01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //Podemos utilizar outras formatações para em outros tipos de data:
        System.out.println("Data 02: " + data02.format(fmt02));
        //Aqui, utilizaremos uma formatação sem as Horas e Minutos, ou seja, a "frm01" ao invés da "frm02":
        System.out.println("Data 02: " + data02.format(fmt01));

        //E para a foratação de uma data global, devemos utilizar o método do objeto de formatação, já que um objeto Instant não possui um método de formatação
        System.out.println("Data 03: " + fmt03.format(data03));
    }
}
