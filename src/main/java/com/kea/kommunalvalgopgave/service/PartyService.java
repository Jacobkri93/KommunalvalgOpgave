package com.kea.kommunalvalgopgave.service;

import com.kea.kommunalvalgopgave.entity.Candidate;
import com.kea.kommunalvalgopgave.entity.Party;
import com.kea.kommunalvalgopgave.repositories.CandidateRepository;
import com.kea.kommunalvalgopgave.repositories.PartyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartyService {

    CandidateRepository candidateRepository;
    PartyRepository partyRepository;

    public PartyService(CandidateRepository candidateRepository, PartyRepository partyRepository) {
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    public List<Party> getAllParties() {
        List<Party> allTheParties = new ArrayList<>();
        partyRepository.findAll().forEach(allTheParties::add);
        return allTheParties;
    }

    public Party findByPartyid (Integer i){
        return partyRepository.findById(i).get();
    }
}
