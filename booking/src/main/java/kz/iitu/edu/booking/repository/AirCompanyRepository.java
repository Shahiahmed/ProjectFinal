package kz.iitu.edu.booking.repository;

import kz.iitu.edu.booking.model.AirCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AirCompanyRepository extends JpaRepository<AirCompany, Integer> {
    List<AirCompany> getAllBy();
    AirCompany findByName(String name);
}
