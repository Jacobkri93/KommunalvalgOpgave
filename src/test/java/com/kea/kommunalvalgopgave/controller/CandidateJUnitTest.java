package com.kea.kommunalvalgopgave.controller;

import com.kea.kommunalvalgopgave.entity.Candidate;
import com.kea.kommunalvalgopgave.entity.Party;
import com.kea.kommunalvalgopgave.repositories.CandidateRepository;
import com.kea.kommunalvalgopgave.repositories.PartyRepository;
import com.kea.kommunalvalgopgave.service.CandidateService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CandidateJUnitTest {


    //Autowire
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private PartyRepository partyRepository;


    //JUnit testing on the getAllCandidates method
    @Test
    public void getAllCandidates(){
        //Arrange - to setup the data and objects we want to test our methods with
        Candidate candidate = new Candidate();
        List<Candidate> CandidateListForTest = new ArrayList<>();
        candidateRepository.findAll().forEach(CandidateListForTest::add);
        candidate.setFirstName("Test_first_name");
        candidate.setLastName("Test_last_name");
        candidate.setParty(new Party());
        candidate.getParty().setId(1);

        //Act - we save the object from the .save
        candidateRepository.save(candidate);
        System.out.println(CandidateListForTest);

        List<Candidate> CandidateListAfterTest = new ArrayList<>();
        candidateRepository.findAll().forEach(CandidateListAfterTest::add);

        //Assert - Here we check the results is as we expect it to be
        Assertions.assertEquals(CandidateListForTest.size()+1,CandidateListAfterTest.size());

    }


}
