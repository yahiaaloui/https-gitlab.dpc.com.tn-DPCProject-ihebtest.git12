package com.dpc.repository;

import com.dpc.entities.Namespaces;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NameSpaceRepository extends JpaRepository<Namespaces, Long> {

    List<Namespaces> findByZnameId(Long id);

}
