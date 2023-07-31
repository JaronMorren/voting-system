package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Principal class contains the main method to start the voting system.
 */
public class Principal {

  /**
   * Main method to start the vote management system.
   */
  public static void main(String[] args) {
    // Initializes vote management and scanner objects for user input
    GerenciamentoVotacao voteManagement = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    // Starts the candidate registration process
    candidateMenu(scanner, voteManagement);

    // Starts the voter registration process
    voterMenu(scanner, voteManagement);

    // Starts the voting process and display results
    votingMenu(scanner, voteManagement);
  }

  /**
   * Template method for displaying a generic menu with options.
   */
  public static void menuTemplate() {
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");
  }

  /**
   * Displays the menu for registering candidates and processes the input.
   *
   * @param scanner        Scanner object to read user input.
   * @param voteManagement Vote management object to handle candidate registration.
   */
  public static void candidateMenu(Scanner scanner, GerenciamentoVotacao voteManagement) {
    int input = 0;
    do {
      System.out.println("Cadastrar pessoa candidata?");
      menuTemplate();
      input = Integer.parseInt(scanner.nextLine());

      if (input == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String candidateName = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candidateNumber = Integer.parseInt(scanner.nextLine());

        // Registers the candidate with the provided name and number
        voteManagement.cadastrarPessoaCandidata(candidateName, candidateNumber);
      }
    } while (input != 2);
  }

  /**
   * Displays the menu for registering voters and processes the input.
   *
   * @param scanner        Scanner object to read user input.
   * @param voteManagement Vote management object to handle voter registration.
   */
  public static void voterMenu(Scanner scanner, GerenciamentoVotacao voteManagement) {
    int input = 0;
    do {
      System.out.println("Cadastrar pessoa eleitora?");
      menuTemplate();
      input = Integer.parseInt(scanner.nextLine());

      if (input == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String voterName = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();

        // Registers the voter with the provided name and cpf
        voteManagement.cadastrarPessoaEleitora(voterName, cpf);
      }
    } while (input != 2);
  }

  /**
   * Displays the menu for voting, counting votes, and showing results.
   *
   * @param scanner        Scanner object to read user input.
   * @param voteManagement Vote management object to handle voting and result display.
   */
  public static void votingMenu(Scanner scanner, GerenciamentoVotacao voteManagement) {
    int input = 0;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      input = Integer.parseInt(scanner.nextLine());

      if (input == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int candidateNumber = Integer.parseInt(scanner.nextLine());
        // Registers the vote from the voter with the provided cpf
        // for the candidate with the given number
        voteManagement.votar(cpf, candidateNumber);
      } else {
        // Displays the partial or final voting result, depending on the input
        voteManagement.mostrarResultado();
      }
    } while (input != 3);
    scanner.close();
  }
}

