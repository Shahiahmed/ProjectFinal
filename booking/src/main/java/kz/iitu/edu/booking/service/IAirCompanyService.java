package kz.iitu.edu.booking.service;

import kz.iitu.edu.booking.model.AirCompany;

import java.net.Inet4Address;
import java.util.List;

public interface IAirCompanyService {
    void createAirCompany(AirCompany airCompany);
    void deleteAirCompany(Integer id);
    List<AirCompany> getAllAirCompanies();
    AirCompany getAirCompanyByName(String name);
}
