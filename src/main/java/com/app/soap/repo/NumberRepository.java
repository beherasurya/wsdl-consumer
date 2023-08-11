package com.app.soap.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.soap.model.Number;

public interface NumberRepository extends JpaRepository<Number, Integer>{

}
