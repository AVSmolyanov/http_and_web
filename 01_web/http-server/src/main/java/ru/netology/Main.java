package ru.netology;


import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) throws IOException {
    ExecutorService executor = Executors.newFixedThreadPool(64);
    executor.execute(Server.start());
    for (int i = 1; i < 64; i++) {
      executor.execute(Server.work());
    }
  }
}


