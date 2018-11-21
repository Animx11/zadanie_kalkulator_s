package Spring.RestClientForNbpApi;

import Spring.RestClientForNbpApi.NbpEntities.Currency;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Deserialization {

    public static float getCurrency(String responseBody) throws IOException{

        ObjectMapper mapper = new ObjectMapper();
        Currency currency = mapper.readValue(responseBody, Currency.class);

        return currency.getRates().get(0).getMid();

    }

}
