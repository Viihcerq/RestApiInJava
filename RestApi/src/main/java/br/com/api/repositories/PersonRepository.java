package br.com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
