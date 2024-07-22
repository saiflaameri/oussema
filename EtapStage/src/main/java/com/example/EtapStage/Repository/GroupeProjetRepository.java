package com.example.EtapStage.Repository;

import com.example.EtapStage.Entity.GroupeProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeProjetRepository extends JpaRepository<GroupeProjet,Long> {
}
