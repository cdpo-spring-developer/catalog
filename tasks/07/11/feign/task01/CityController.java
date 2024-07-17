@Controller
public class CityController {
    @RequestHeader
    HttpHeader header;

    @GetMapping
            ("/city")
    public getCituClient(Client client, Model model) {
        model.addAttribute("city", ClientService.getClents()
                .filterByName);
        return List<Client> client;
    }
}