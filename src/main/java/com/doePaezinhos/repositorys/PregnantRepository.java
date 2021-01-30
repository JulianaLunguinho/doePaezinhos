package com.doePaezinhos.repositorys;

import com.doePaezinhos.models.entities.Pregnant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PregnantRepository extends JpaRepository<Long, Pregnant> {
}
