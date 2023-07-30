package com.betrybe.sistemadevotacao;

/**
 * Abstract class representing persons.
 */
public abstract class Pessoa {

  protected String nome;

  /**
   * Constructor for creating a person.
   *
   * @param nome The name of the person.
   */
  public Pessoa(String nome) {
    this.nome = nome;
  }

  /**
   * Get the name of the person.
   *
   * @return The name of the person.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Set the name of the person.
   *
   * @param nome The name of the person to set.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
