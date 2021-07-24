package kz.iitu.edu.booking.model;

import kz.iitu.edu.booking.model.enumtypes.TicketType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tickets")
@Component
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fromA;
    private String toB;
    private Integer price;
    private Boolean status;
    private String time;
    private TicketType type;
    private Integer company_id;

    @ManyToOne
    @JoinColumn(name = "company_id",insertable = false, updatable = false)
    @Getter(AccessLevel.NONE)
    private AirCompany airCompany;

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", fromA='" + fromA + '\'' +
                ", toB='" + toB + '\'' +
                ", price=" + price +
                ", time='" + time + '\'' +
                ", type=" + type +
                ", company_id=" + company_id +
                '}';
    }
}
