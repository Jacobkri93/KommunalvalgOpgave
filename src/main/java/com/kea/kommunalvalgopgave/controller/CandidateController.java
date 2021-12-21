package com.kea.kommunalvalgopgave.controller;


import com.kea.kommunalvalgopgave.entity.Candidate;
import com.kea.kommunalvalgopgave.errors.NotFoundException;
import com.kea.kommunalvalgopgave.repositories.CandidateRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
//used for the session storages in the frontend and added as URLS to fetch from
@RequestMapping("api/candidate")
public class CandidateController {

    CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("getAll/{id}")
    Iterable<Candidate> getAll(@PathVariable("id") int id) {
        Iterable<Candidate> allCandidates = candidateRepository.findAll();
        if (id == 0) {
            return allCandidates;
        }else{
            ArrayList<Candidate> tempCand = new ArrayList<>();

            allCandidates.forEach(candidate -> {
                if (candidate.getParty().getId()== id)
                {
                    tempCand.add(candidate);
                }
            });
        return tempCand;
    }}

//    @GetMapping
//    Iterable<Candidate> getAll() {
//        return candidateRepository.findAll();
//    }

    @GetMapping("/{id}")
    Candidate getOne(@PathVariable("id") int id) {
        return candidateRepository.findById(id).orElseThrow(() -> new NotFoundException("User not found"));
    }

    @PostMapping()
    Candidate addOne(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @PutMapping("/{id}")
    Candidate editOne(@RequestBody Candidate candidate, @PathVariable("id") int id) {
        Candidate can = candidateRepository.findById(id).get();
        can.setFirstName(candidate.getFirstName());
        can.setLastName(candidate.getLastName());
        can.setParty(candidate.getParty());

        return candidateRepository.save(can);
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable("id") int id) {
        candidateRepository.deleteById(id);
    }

}
