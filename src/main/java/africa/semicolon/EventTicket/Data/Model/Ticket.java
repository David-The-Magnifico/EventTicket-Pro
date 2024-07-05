package africa.semicolon.EventTicket.Data.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
public class Ticket {
    @Id
    private Long id;
    private Long userId;
    private Event event;
    private int quantity;
    private double price;
    private Discount discount;
    private TicketCategory ticketCategory;

}
