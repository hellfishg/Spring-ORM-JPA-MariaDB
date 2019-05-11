package com.hellfishg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellfishg.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
   