package com.kea.kommunalvalgopgave.configuration;

import com.kea.kommunalvalgopgave.repositories.CandidateRepository;
import com.kea.kommunalvalgopgave.repositories.PartyRepository;
import org.springframework.boot.CommandLineRunner;

//Configurates data into the mySQL DB for testing of the view
//Can be altered if needed for difference results

//@Configuration
public class DataSetup implements CommandLineRunner {

    CandidateRepository candidateRepository;
    PartyRepository partyRepository;

    public DataSetup(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public void run(String... args) throws Exception {


//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", "Te"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName"));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));
//        kandidatRepository.save(new Kandidat("Test_FirstName", "Test_LastName", 'A'));


//        partiRepository.save(new Parti("A - Socialdemokratiet"));


    }
}