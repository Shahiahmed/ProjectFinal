package kz.iitu.edu.booking.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Component
@Table(name = "air_company")
public class AirCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer company_id;

    private String name;
    private String country;

    @OneToMany(mappedBy = "airCompany")
    private List<Ticket> tickets;

    @Override
    public String toString() {
        return "AirCompany{" +
                "company_id=" + company_id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
