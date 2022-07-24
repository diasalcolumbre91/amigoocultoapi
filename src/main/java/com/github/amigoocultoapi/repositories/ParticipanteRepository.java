package com.github.amigoocultoapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.github.amigoocultoapi.models.Participante;

public interface ParticipanteRepository extends JpaRepository <Participante, Integer> {
    
}
