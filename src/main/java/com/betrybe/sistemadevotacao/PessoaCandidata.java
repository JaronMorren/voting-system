package com.betrybe.sistemadevotacao;

/**
 * Class representing candidates.
 */
public class PessoaCandidata extends Pessoa {

  private int numero;
  private int votos;

  /**
   * Constructor for creating a candidate.
   *
   * @param nome   The name of the candidate.
   * @param numero The candidate's number.
   */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }

  /**
   * Get the candidate's number.
   *
   * @return The candidate's number.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Get the number of votes received by the candidate.
   *
   * @return The number of votes received.
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Set the candidate's number.
   *
   * @param numero The candidate's number to set.
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Set the number of votes received by the candidate.
   *
   * @param votos The number of votes received to set.
   */
  public void setVotos(int votos) {
    this.votos = votos;
  }

  /**
   * Increment the number of votes received by one.
   */
  public void receberVoto() {
    this.votos += 1;
  }
}
