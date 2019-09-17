/*
 * ................
 */
package br.edu.ucv.exemplospringbootjsf.service;

import br.edu.ucv.exemplospringbootjsf.modelo.Todo;
import br.edu.ucv.exemplospringbootjsf.persistencia.DAO;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author romulo.douro
 */
@Scope(value = "session")
@Component(value = "todoService")
public class TodoService {

 @Autowired
 private DAO<Todo> todoDao;
 private Todo todo = new Todo();

 public void save() {
  todoDao.save(todo);
  todo = new Todo();
 }

 public Collection<Todo> getAllTodo() {
  return todoDao.getAll();
 }

 public int saveTodo(Todo todo) {
  validate(todo);
  return todoDao.save(todo);
 }

 private void validate(Todo todo) {
  // Details omitted
 }

 public Todo getTodo() {
  return todo;
 }
}
