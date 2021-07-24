package kz.iitu.edu.booking.service.impl;

import kz.iitu.edu.booking.model.Ticket;
import kz.iitu.edu.booking.repository.TicketRepository;
import kz.iitu.edu.booking.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements ITicketService {

    @Autowired
    private TicketRepository repository;

    @Override
    public void create(Ticket ticket) {
        repository.save(ticket);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return repository.getAllBy();
    }

    @Override
    public Ticket getById(Integer id) {
        return repository.getTicketById(id);
    }

    @Override
    public List<Ticket> getByFrom(String from) {
        return repository.getAllByFromA(from);
    }

    @Override
    public List<Ticket> getByTo(String to) {
        return repository.getAllByToB(to);
    }

    @Override
    public List<Ticket> getByFromAndTo(String from, String to) {
        return repository.getAllByFromAAndToB(from, to);
    }

    @Override
    public List<Ticket> findTicketsByAirCompany_Name(String name) {
        return  repository.findTicketsByAirCompany_Name(name);
    }

    @Override
    public void update(Integer id, Boolean status) {
        Ticket ticket = repository.findById(id).get();
        if(ticket != null){
            ticket.setStatus(status);
            repository.save(ticket);
        }
    }
}
