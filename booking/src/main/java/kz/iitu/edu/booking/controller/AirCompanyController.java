package kz.iitu.edu.booking.controller;

import kz.iitu.edu.booking.model.AirCompany;
import kz.iitu.edu.booking.service.IAirCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/air-companies")
public class AirCompanyController {

    @Autowired
    IAirCompanyService iAirCompanyService;

    @RequestMapping(method = RequestMethod.POST)
    public void createAirCompany(@RequestBody AirCompany airCompany){
        iAirCompanyService.createAirCompany(airCompany);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteAirCompany(@PathVariable("id") Integer id){
        iAirCompanyService.deleteAirCompany(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<AirCompany> getAllAirCompanies(){
        return iAirCompanyService.getAllAirCompanies();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    public AirCompany getAirCompanyByName(@RequestParam(name = "name") String name){
        return iAirCompanyService.getAirCompanyByName(name);
    }

}
