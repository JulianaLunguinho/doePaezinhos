package com.doePaezinhos.repositorys;

import com.doePaezinhos.models.entities.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Long, Family> {
}
