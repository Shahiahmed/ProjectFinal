package kz.iitu.edu.booking.service.impl;

import kz.iitu.edu.booking.model.AirCompany;
import kz.iitu.edu.booking.model.Ticket;
import kz.iitu.edu.booking.repository.AirCompanyRepository;
import kz.iitu.edu.booking.service.IAirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirCompanyImpl implements IAirCompanyService {

    @Autowired
    private AirCompanyRepository repository;

    @Override
    public void createAirCompany(AirCompany airCompany) {
        repository.save(airCompany);
    }

    @Override
    public void deleteAirCompany(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<AirCompany> getAllAirCompanies() {
        return repository.getAllBy();
    }

    @Override
    public AirCompany getAirCompanyByName(String name) {
        return repository.findByName(name);
    }

}
