package com.br.morita.ToDoList.repository;

import com.br.morita.ToDoList.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
