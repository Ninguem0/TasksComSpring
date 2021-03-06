package com.exemplo.gestao.repository;

import com.exemplo.gestao.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByConcluded(Boolean concluded, Pageable pageable);
    Page<Task> findByDescriptionContaining(String description, Pageable pageable);
    Page<Task> findByDescriptionContainingAndConcluded(String description, Boolean concluded, Pageable pageable);

}
