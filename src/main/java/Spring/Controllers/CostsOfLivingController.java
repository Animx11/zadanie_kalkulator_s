package Spring.Controllers;

import Spring.Entities.CostsOfLiving;
import Spring.Services.CostsOfLivingService;
import Spring.RestClientForNbpApi.RestTemplateGetCurrencyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class CostsOfLivingController {

    @Autowired
    private CostsOfLivingService costsOfLivingService;

    private RestTemplateGetCurrencyValue restTemplateGetCurrencyValue;

    @RequestMapping(value = "/costsOfLiving/countryName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<CostsOfLiving> getByCountryName(@RequestParam("countryName") String countryName) throws IOException {
        restTemplateGetCurrencyValue.getCurrencyValue('A', "USD");
        return costsOfLivingService.getByCountryName(countryName);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/costsOfLiving/countryName", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CostsOfLiving> delete(@RequestParam("countryName") String countryName) {
        costsOfLivingService.delete(countryName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/costsOfLiving", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CostsOfLiving> create(@RequestBody @Valid @NotNull CostsOfLiving costsOfLiving) {
        costsOfLivingService.save(costsOfLiving);
        return ResponseEntity.ok().body(costsOfLiving);
    }
}
