package com.testspring.moneyapi.repository;

import com.testspring.moneyapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
