package Spring.RestClientForNbpApi;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;


public class RestTemplateGetCurrencyValue {

    public static float getCurrencyValue(char table, String currencyCode) throws IOException
    {
        final String uri = "http://api.nbp.pl/api/exchangerates/rates/";
        float currencyValue;

        Deserialization deserialization = new Deserialization();
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(uri + table + "/" + currencyCode, String.class);

        String responseBody = response.getBody();

        return currencyValue = deserialization.getCurrency(responseBody);


    }

}
