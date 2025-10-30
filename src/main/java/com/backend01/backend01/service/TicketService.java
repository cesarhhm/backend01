package com.backend01.backend01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend01.backend01.model.TicketModel;
import com.backend01.backend01.repository.TicketRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;

	public List<TicketModel> findAll() {
		return ticketRepository.findAll();
	}
	
    public Optional<TicketModel> findById(Integer id) {
        return ticketRepository.findById(id);
    }
    
    public Page<TicketModel> findAll(Pageable pageable) {
        return ticketRepository.findAll(pageable);
    }

}
