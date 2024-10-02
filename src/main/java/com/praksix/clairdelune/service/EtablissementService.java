package com.praksix.clairdelune.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.praksix.clairdelune.models.Etablissement;
import com.praksix.clairdelune.repository.EtablissementRepository;

import lombok.Data;

@Data
@Service
public class EtablissementService {
	
	@Autowired
	private EtablissementRepository etablissementRepository;
	
	public Optional<Etablissement> getEtablissement(final Long id) {
		return etablissementRepository.findById(id);
	}
	
	public Iterable<Etablissement> getEtablissements() {
		return etablissementRepository.findAll();
	}
	
	public void deleteetablissement(final Long id) {
		etablissementRepository.deleteById(id);
	}
	
	public Etablissement saveEtablissement(Etablissement etablissement) {
		Etablissement savedEtablissement = etablissementRepository.save(etablissement);
		return savedEtablissement;
	}

}
