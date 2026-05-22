package com.tecdes.backend.service;

import com.tecdes.backend.model.Tarefa;
import com.tecdes.backend.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa criar(Tarefa tarefa) {

        tarefa.setStatus("PENDENTE");

        return repository.save(tarefa);
    }

    public Tarefa atualizar(Long id, Tarefa tarefaAtualizada) {

        Tarefa tarefa = repository.findById(id)
                .orElseThrow();

        tarefa.setText(tarefaAtualizada.getText());
        tarefa.setStatus(tarefaAtualizada.getStatus());

        return repository.save(tarefa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}