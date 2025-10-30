package com.backend01.backend01.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend01.backend01.model.TicketModel;
import com.backend01.backend01.service.TicketService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/ticket")

public class TicketRest {

	@Autowired
	private TicketService ticketService;
    
    @GetMapping
    public ResponseEntity<List<TicketModel>> getAllBuses() {
        return ResponseEntity.ok(ticketService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TicketModel> getTicketById(@PathVariable Integer id) {
        return ticketService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping("/page")
    public ResponseEntity<Page<TicketModel>> getTicketsPage(
            @RequestParam(defaultValue = "0") int page, 
            @RequestParam(defaultValue = "5") int size    
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(ticketService.findAll(pageable));
    }
	

	
}
