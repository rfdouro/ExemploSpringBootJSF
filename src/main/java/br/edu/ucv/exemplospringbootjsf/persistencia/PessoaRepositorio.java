/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.persistencia;

import br.edu.ucv.exemplospringbootjsf.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author romulo.douro
 */
@Component
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long>  {

 public List<Pessoa> findAllByOrderByNome();

}
