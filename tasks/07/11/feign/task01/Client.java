@Data
@Entity
@Table(name = "client") // user group
public class Client {
    @Id
    private int id;
    private String name;
    private String description;
    @OneToOne
    private String city;
