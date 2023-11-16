package com.morada.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.morada.todosimple.models.User;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

    //List<Task> findByUser_id(long id);

    @Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")
    List<Task> findByUser_Id(@Param("id") Long id);

}
