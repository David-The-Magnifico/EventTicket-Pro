package africa.semicolon.EventTicket.Data.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "organizers")
public class Organizer {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

}
