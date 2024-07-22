package com.example.EtapStage.Repository;

import com.example.EtapStage.Entity.Commenatire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Commenatire,Long> {
}
