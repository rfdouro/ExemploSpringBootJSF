/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author romulo.douro
 */
@Controller
public class IndexController {

 @RequestMapping("/")
 public String index() {
  return "index.jsf";
 }
}
