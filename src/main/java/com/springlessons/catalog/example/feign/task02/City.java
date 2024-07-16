import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {
  @Id
    private String id;
  private String name;
  private long code;
  private double lat;
  private double lon;


}
