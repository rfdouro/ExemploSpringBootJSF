/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.persistencia;

import java.util.Collection;
import java.util.Optional;

/**
 *
 * @author romulo.douro
 */
public interface DAO<T> {

 Optional<T> get(int id);

 Collection<T> getAll();

 int save(T t);

 void update(T t);

 void delete(T t);
}
