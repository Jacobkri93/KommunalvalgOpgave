package com.kea.kommunalvalgopgave.service;

import com.kea.kommunalvalgopgave.entity.Candidate;
import com.kea.kommunalvalgopgave.repositories.CandidateRepository;
import com.kea.kommunalvalgopgave.repositories.PartyRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {

    CandidateRepository candidateRepository;
    PartyRepository partyRepository;


    public CandidateService(CandidateRepository candidateRepository, PartyRepository partyRepository) {
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    //GET all
    public List<Candidate> getAllCandidates() {
        List<Candidate> allCandidates = new ArrayList<>();
        candidateRepository.findAll().forEach(allCandidates::add);
        return allCandidates;
    }

    //POST
    public void addCandidate(Candidate candidate) {
        Candidate canTemp = candidateRepository.save(candidate);
    }

    //GET
    public Candidate getSpecificCandidate(Integer i) {
        return candidateRepository.findById(i).get();
    }



    //PUT
    public void editTheCandidate(Candidate editedCandidate) {
        Candidate CandidateToEdit = candidateRepository.findById(editedCandidate.getId()).get();

        CandidateToEdit = editedCandidate;
        candidateRepository.save(CandidateToEdit);
    }

    //DELETE
    public void deleteCandidate (int id){
        candidateRepository.deleteById(id);
    }



}



