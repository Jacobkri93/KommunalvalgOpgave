package com.kea.kommunalvalgopgave.entity;

import javax.persistence.*;



@Entity
@Table(name = "candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @OneToOne
    @JoinColumn(name = "party_id", referencedColumnName = "id")
    private Party party;

    public Candidate(String first_name, String last_name, Party party) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.party = party;
    }

    public Candidate() {
    }

    public int getId() {
        return id;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", party=" + party +
                '}';
    }
}
