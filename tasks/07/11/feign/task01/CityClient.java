@EnableFeignClients
@FeignClient(value = "city", url = "http://ip:port/city")
public interface CityClient {



}
