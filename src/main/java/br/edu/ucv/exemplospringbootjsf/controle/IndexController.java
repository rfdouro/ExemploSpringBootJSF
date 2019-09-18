/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.controle;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author romulo.douro
 */
@Controller
public class IndexController {
 
 @Autowired
 HttpServletRequest req;

 @RequestMapping("/")
 public String index() {
  System.out.println("chamou index");
  System.out.println(req);
  System.out.println(""+req.getServletContext());
  System.out.println(""+req.getServletContext().getInitParameter("primefaces.THEME"));
  return "index.html";
 }
 
 @RequestMapping("/exlayout01")
 public String exlayout01() {
  return "exlayout.html";
 }
}
