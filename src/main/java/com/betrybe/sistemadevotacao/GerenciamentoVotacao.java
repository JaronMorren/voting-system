package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * A class representing vote management. This class implements the GerenciamentoVotacaoInterface for
 * managing the voting process.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   * Constructor for creating a new instance of GerenciamentoVotacao. Initializes the lists for
   * candidates, voters, and processed CPFs.
   */
  public GerenciamentoVotacao() {
    pessoasCandidatas = new ArrayList<>();
    pessoasEleitoras = new ArrayList<>();
    cpfsComputados = new ArrayList<>();
  }

  /**
   * Registers a new candidate for the election.
   *
   * @param nome   The name of the candidate.
   * @param numero The candidate's identification number.
   */
  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    // Implementation of candidate registration.
  }

  /**
   * Registers a new voter for the election.
   *
   * @param nome The name of the voter.
   * @param cpf  The voter's unique identification number (CPF).
   */
  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    // Implementation of voter registration.
  }

  /**
   * Casts a vote for a specific candidate.
   *
   * @param cpfPessoaEleitora     The CPF of the voter casting the vote.
   * @param numeroPessoaCandidata The identification number of the candidate receiving the vote.
   */
  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    // Implementation of the voting process.
  }

  /**
   * Displays the election results. This method will show the outcome of the voting process.
   */
  @Override
  public void mostrarResultado() {
    // Implementation to display the election results.
  }
}

