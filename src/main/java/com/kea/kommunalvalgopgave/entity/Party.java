package com.kea.kommunalvalgopgave.entity;

import javax.persistence.*;

@Entity
@Table(name = "party")
public class Party {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     int id;

     String party;

     public Party() {
     }
     public Party(String party) {
          this.party = party;
     }


     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getParty() {
          return party;
     }

     public void setParty(String parti) {
          this.party = parti;
     }

     @Override
     public String toString() {
          return "Party{" +
                  "id=" + id +
                  ", party='" + party + '\'' +
                  '}';
     }
}




