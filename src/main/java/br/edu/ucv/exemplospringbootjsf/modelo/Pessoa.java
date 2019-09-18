/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author romulo.douro
 */
@Entity
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
 @Column(name = "nome", length = 250)
 private String nome;

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }
 
 
}
