/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.controle;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author romulo.douro
 */
@Scope(value = "session")
@Component(value = "jsfController")
public class JsfController {
 
 @Autowired
 HttpServletRequest req;

 public String loadTodoPage() {
  checkPermission();
  return "/todo.xhtml";
 }
 
 public String loadTodoPage2() {
  checkPermission();
  System.out.println(req);
  System.out.println(""+req.getServletContext());
  System.out.println(""+req.getServletContext().getInitParameter("primefaces.THEME"));
  return "/todo2.xhtml";
 }

 private void checkPermission() {
  // Details omitted
 }
}
