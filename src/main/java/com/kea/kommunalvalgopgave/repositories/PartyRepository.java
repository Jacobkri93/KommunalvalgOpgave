package com.kea.kommunalvalgopgave.repositories;

import com.kea.kommunalvalgopgave.entity.Party;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//@Repository
@Configuration
@EnableEncryptableProperties
public interface PartyRepository extends CrudRepository<Party,Integer> {
}
