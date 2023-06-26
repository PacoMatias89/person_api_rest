package com.pacomolina.person_api_rest.repository;

import com.pacomolina.person_api_rest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Esta clase nos va ayudar a realizar las operaciones sobre la base de datos
 * así evitamos crear más código, las operaciones pueden ser DELETE, SAVE, FINDALL, etc.
 * De forma automática
 */


@Repository
public interface PersonRespository extends JpaRepository<Person, Long> {


    List<Person> findByName(@Param("name") String name);


}
