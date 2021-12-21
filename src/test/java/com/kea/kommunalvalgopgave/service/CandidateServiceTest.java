package com.kea.kommunalvalgopgave.service;

import com.kea.kommunalvalgopgave.entity.Candidate;
import com.kea.kommunalvalgopgave.entity.Party;
import com.kea.kommunalvalgopgave.repositories.CandidateRepository;
import com.kea.kommunalvalgopgave.repositories.PartyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

class CandidateServiceTest {


    @Mock
    CandidateRepository candidateRepository;

    @Mock
    PartyRepository partyRepository;

    @InjectMocks
    CandidateService candidateService;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        Party party = new Party();

        Candidate candidateTest = new Candidate("Jacob1","Kamstrup", party);
        Candidate candidateTest2 = new Candidate("Jacob2","Kamstrup", party);
        Candidate candidateTest3 = new Candidate("Jacob3","Kamstrup", party);
        Candidate candidateTest4 = new Candidate("Jacob4","Kamstrup", party);
        Candidate candidateTest5 = new Candidate("Jacob5","Kamstrup", party);




        List<Candidate> testCandidateList = new ArrayList<>();
        testCandidateList.add(candidateTest);
        testCandidateList.add(candidateTest2);
        testCandidateList.add(candidateTest3);
        testCandidateList.add(candidateTest4);
        testCandidateList.add(candidateTest5);

        Mockito.when(candidateRepository.findById(1)).thenReturn(java.util.Optional.of(candidateTest));

        Mockito.when(candidateRepository.save(candidateTest)).thenReturn(candidateTest);

        Mockito.when(candidateRepository.findAll()).thenReturn(testCandidateList);
    }



    @Test
    void getAllCandidatesTest() {
        List<Candidate> testList = candidateService.getAllCandidates();

        assertEquals(5, testList.size());
        Mockito.verify(candidateRepository, times(1)).findAll();
    }

    @Test
    void addCandidateTest() {

        Party party = new Party();

        Candidate candidateTest = new Candidate("JayToTheK", "KayToTheJ", party);
        candidateTest.setParty(candidateTest.getParty());
        candidateService.addCandidate(candidateTest);

        Mockito.verify(candidateRepository, times(1)).save(Mockito.any(Candidate.class));
    }

    @Test
    public Candidate getSpecificCandidateTest(Integer i) {
        return candidateRepository.findById(i).get();
    }

//    @Test
//    void editTheCandidateTest() {
//        Candidate candidateToEdit = candidateService.getSpecificCandidate(1);
//        candidateToEdit.setParty(candidateToEdit.getParty());
//
//
//        candidateToEdit.setFirstName("Laaaaaarssagne");
//
//        candidateService.editTheCandidate(candidateToEdit);
//
//
//        assertEquals("Laaaaaarssagne", candidateService.getSpecificCandidate(1).getFirstName());
//        Mockito.verify(candidateRepository, times(1)).save(candidateToEdit);
//
//    }

    @Test
    void deleteCandidateTest() {
        Party party = new Party();
        Candidate test = new Candidate("Jakeboi",  "TheChamp", party);

        candidateService.deleteCandidate(test.getId());

        Mockito.verify(candidateRepository).deleteById(test.getId());
    }
}