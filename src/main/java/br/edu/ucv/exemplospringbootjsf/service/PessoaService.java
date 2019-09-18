/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.service;

import br.edu.ucv.exemplospringbootjsf.modelo.Pessoa;
import br.edu.ucv.exemplospringbootjsf.persistencia.PessoaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author romulo.douro
 */
@Scope(value = "request")
@Component(value = "pessoaService")
public class PessoaService {

 @Autowired
 private PessoaRepositorio repositorio;

 private Pessoa pessoa = new Pessoa();

 public Pessoa getPessoa() {
  return pessoa;
 }

 public void setPessoa(Pessoa pessoa) {
  this.pessoa = pessoa;
 }

 public List<Pessoa> getTodas() {
  return repositorio.findAllByOrderByNome();
 }

 public void salva() {
  repositorio.save(pessoa);
  this.pessoa = new Pessoa();
 }
 
 public void exclui(long id){
  this.pessoa = this.repositorio.findById(id).get();
  if(this.pessoa!=null){
   repositorio.delete(pessoa);
  }
  this.pessoa = new Pessoa();
 }
}
