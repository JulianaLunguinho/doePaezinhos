package com.doePaezinhos.models.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Family {
    private Long id;
    private Person principalPerson;
    private List<Person> otherPersons;
    private Long volunterId;
    private Long babyId;

    public Family() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPrincipalPerson() {
        return principalPerson;
    }

    public void setPrincipalPerson(Person principalPerson) {
        this.principalPerson = principalPerson;
    }

    public List<Person> getOtherPersons() {
        return otherPersons;
    }

    public void setOtherPersons(List<Person> otherPersons) {
        this.otherPersons = otherPersons;
    }

    public Long getVolunterId() {
        return volunterId;
    }

    public void setVolunterId(Long volunterId) {
        this.volunterId = volunterId;
    }

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }
}
