package pl.code.academy;

import org.springframework.web.client.RestTemplate;
import pl.code.academy.model.GetCountriesRequest;
import pl.code.academy.model.GetCountriesResponse;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        GetCountriesRequest getCountriesRequest = new GetCountriesRequest();
        getCountriesRequest.setName("Poland");

        String url = "http://localhost:8888/getCountryByName";

        RestTemplate restTemplate = new RestTemplate();
        GetCountriesResponse response = restTemplate.postForObject(url,
                getCountriesRequest,
                GetCountriesResponse.class,
                new HashMap<>());

        System.out.println(response.getCountry().getName());
        System.out.println(response.getCountry().getCapital());
        System.out.println(response.getCountry().getPopulation());
    }
}
