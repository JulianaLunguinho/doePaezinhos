package com.doePaezinhos.repositorys;

import com.doePaezinhos.models.entities.Volunter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunterRepository extends JpaRepository<Long, Volunter> {
}
