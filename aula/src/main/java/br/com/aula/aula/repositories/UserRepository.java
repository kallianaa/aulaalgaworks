package br.com.aula.aula.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
