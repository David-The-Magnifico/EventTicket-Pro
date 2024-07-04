package africa.semicolon.EventTicket.Data.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "discounts")
public class Discount {
    @Id
    private Long id;
    private Ticket ticket;
    private double percentage;

}
