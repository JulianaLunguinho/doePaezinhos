package com.doePaezinhos.repositorys;

import com.doePaezinhos.models.entities.Baby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyRepository extends JpaRepository<Long, Baby> {
}
