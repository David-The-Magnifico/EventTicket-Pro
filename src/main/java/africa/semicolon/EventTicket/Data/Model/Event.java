package africa.semicolon.EventTicket.Data.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "events")
public class Event {
    @Id
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private EventCategory eventCategory;
}
