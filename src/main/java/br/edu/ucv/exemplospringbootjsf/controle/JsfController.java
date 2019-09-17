/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.controle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author romulo.douro
 */
@Scope(value = "session")
@Component(value = "jsfController")
public class JsfController {

 public String loadTodoPage() {
  checkPermission();
  return "/todo.xhtml";
 }
 
 public String loadTodoPage2() {
  checkPermission();
  return "/todo2.xhtml";
 }

 private void checkPermission() {
  // Details omitted
 }
}
