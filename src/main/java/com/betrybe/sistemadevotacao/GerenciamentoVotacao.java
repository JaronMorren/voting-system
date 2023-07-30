package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

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
    for (PessoaCandidata candidate : pessoasCandidatas) {
      if (candidate.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata newCandidate = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(newCandidate);
  }

  /**
   * Registers a new voter for the election.
   *
   * @param nome The name of the voter.
   * @param cpf  The voter's unique identification number (CPF).
   */
  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora voter : pessoasEleitoras) {
      if (Objects.equals(voter.getCpf(), cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora newVoter = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(newVoter);
  }

  /**
   * Casts a vote for a specific candidate.
   *
   * @param cpfPessoaEleitora     The CPF of the voter casting the vote.
   * @param numeroPessoaCandidata The identification number of the candidate receiving the vote.
   */
  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }
    for (PessoaCandidata candidate : pessoasCandidatas) {
      if (candidate.getNumero() == numeroPessoaCandidata) {
        candidate.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        return;
      }
    }
  }

  /**
   * Displays the election results. This method will show the outcome of the voting process.
   */
  @Override
  public void mostrarResultado() {
    int totalVotes = cpfsComputados.size();

    if (totalVotes == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    for (PessoaCandidata candidate : pessoasCandidatas) {
      int candidateVotes = candidate.getVotos();
      double votingPercentage = ((double) candidateVotes / totalVotes) * 100;
      System.out.println("Nome: " + candidate.getNome() + " - " + candidateVotes + " votos ( "
          + Math.round(votingPercentage) + "% )");
    }

    System.out.println("Total de votos: " + totalVotes);
  }
}


