/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.controle.pessoa;

import br.edu.ucv.exemplospringbootjsf.persistencia.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author romulo.douro
 */
@Controller
@RequestMapping("/pessoa/")
public class PessoaController {
  
 @RequestMapping({"", "index", "lista"})
 public String index(){ 
  return "index.html";
 }
 
 @RequestMapping("ver")
 public String get(Model model, @RequestParam(name = "id") Long id){
  model.addAttribute("IDENT", id);
  return "ver.html";
 }
 
 @RequestMapping("teste")
 public String teste(){
  return "ver.html";
 }
}
