package com.backend01.backend01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend01.backend01.model.TicketModel;

public interface TicketRepository extends JpaRepository<TicketModel, Integer> {

}
