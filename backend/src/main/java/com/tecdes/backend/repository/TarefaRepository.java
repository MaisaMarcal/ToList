package com.tecdes.backend.repository;

import com.tecdes.backend.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository
        extends JpaRepository<Tarefa, Long> {

}