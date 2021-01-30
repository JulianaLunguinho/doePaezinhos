package com.doePaezinhos.models.entities;

import com.doePaezinhos.models.enums.Genders;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Baby {
    private Long id;
    private Date approximateDateOfBirth;
    private Genders gender;
    private String specialConditions;
    private Long pregnantId;
    private Long familyId;

    public Baby() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getApproximateDateOfBirth() {
        return approximateDateOfBirth;
    }

    public void setApproximateDateOfBirth(Date approximateDateOfBirth) {
        this.approximateDateOfBirth = approximateDateOfBirth;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public String getSpecialConditions() {
        return specialConditions;
    }

    public void setSpecialConditions(String specialConditions) {
        this.specialConditions = specialConditions;
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
