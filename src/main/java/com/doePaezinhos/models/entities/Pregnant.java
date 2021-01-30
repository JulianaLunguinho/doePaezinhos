package com.doePaezinhos.models.entities;

import javax.persistence.Entity;

@Entity
public class Pregnant {
    private Long id;
    private Person person;
    private Long babyId;
    private Long volunterId;

    public Pregnant() {
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

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    public Long getVolunterId() {
        return volunterId;
    }

    public void setVolunterId(Long volunterId) {
        this.volunterId = volunterId;
    }
}
