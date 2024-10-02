package com.praksix.clairdelune.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.praksix.clairdelune.models.Etablissement;

@Repository
public interface EtablissementRepository extends CrudRepository<Etablissement, Long>{

}