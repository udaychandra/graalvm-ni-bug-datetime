package com.example.starter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

  public static void main(String... args) {
    LocalDateTime myDate = LocalDateTime.parse("4714-11-24 00:00:00 BC",
      DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss G", Locale.ROOT));
    System.out.println(myDate);
  }
}
