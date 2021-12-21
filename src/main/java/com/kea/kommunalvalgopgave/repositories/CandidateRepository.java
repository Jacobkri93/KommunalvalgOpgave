package com.kea.kommunalvalgopgave.repositories;

import com.kea.kommunalvalgopgave.entity.Candidate;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
@Configuration
@EnableEncryptableProperties
public interface CandidateRepository extends CrudRepository<Candidate,Integer> {
}
