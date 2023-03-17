package data_ex_web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
  public static void main(String... args) {
    try (final Scanner scan = new Scanner(System.in)) {
      exemplo1(scan);
      exemplo2(scan);
    }
  }

  private static void exemplo1(final Scanner scan) {
    System.out.println("Entre com a data do seu nascimento: (dd/mm/yyyy) ");
    final String str = scan.nextLine();

    /**************************************
     * Usando Date
     **************************************/
    try {
      final Date data = new SimpleDateFormat("dd/MM/yyyy").parse(str);
      System.out.printf("Saída com Date: %s\n", data);
    } catch (final ParseException e) {
      System.out.println("O formato da data está errado");
    }

    /**************************************
     * Usando LocalDate
     **************************************/
    final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    final LocalDate data = LocalDate.parse(str, fmt);
    System.out.printf("Saída com LocalDate: %s\n", data);
  }

  private static void exemplo2(final Scanner scan) {
    System.out.println("\nEntre com o dia do seu nascimento: ");
    final int dia = scan.nextInt();
    System.out.println("Entre com o mês do seu nascimento: ");
    final int mes = scan.nextInt();
    System.out.println("Entre com o ano do seu nascimento: ");
    final int ano = scan.nextInt();

    final Calendar data1 = new GregorianCalendar(ano, mes - 1, dia);
    final LocalDate data2 = LocalDate.of(ano, mes, dia);
    System.out.printf("Saída com Date: %s\n", data1.getTime());
    System.out.printf("Saída com LocalDate: %s\n", data2);
  }
}