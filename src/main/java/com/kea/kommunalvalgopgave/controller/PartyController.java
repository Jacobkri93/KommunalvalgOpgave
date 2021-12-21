package com.kea.kommunalvalgopgave.controller;

import com.kea.kommunalvalgopgave.entity.Party;
import com.kea.kommunalvalgopgave.errors.NotFoundException;
import com.kea.kommunalvalgopgave.repositories.PartyRepository;
import org.springframework.web.bind.annotation.*;



@RestController
//used for the session storages in the frontend and added as URLS to fetch from
@RequestMapping("api/party")
public class PartyController {

    PartyRepository partyRepository;

    public PartyController(PartyRepository partyRepository){
        this.partyRepository = partyRepository;
    }

    @GetMapping
    Iterable<Party> getAll() {
        return partyRepository.findAll();
    }



    //Not functioning yet :-(
    @GetMapping("party/{id}")
    Party FindByPartyId(@PathVariable ("id") int id){
        return partyRepository.findById(id).orElseThrow(() -> new NotFoundException("Party not found"));
    }


}
