package com.doePaezinhos.models.entities;

import javax.persistence.Entity;

@Entity
public class Volunter {
    private Long id;
    private Person person;
    private Long pregnantId;
    private Long familyId;

    public Volunter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getPregnantId() {
        return pregnantId;
    }

    public void setPregnantId(Long pregnantId) {
        this.pregnantId = pregnantId;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }
}
