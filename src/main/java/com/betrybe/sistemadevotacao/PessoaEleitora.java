package com.betrybe.sistemadevotacao;

/**
 * Class representing voters.
 */
public class PessoaEleitora extends Pessoa {

  private String cpf;

  /**
   * Constructor for creating a voter.
   *
   * @param nome The name of the voter.
   * @param cpf  The cpf of the voter.
   */
  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
