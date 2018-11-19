package Spring.Controllers;

import Spring.Entities.CostsOfLiving;
import Spring.Services.CostsOfLivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api")
public class CostsOfLivingController {

    @Autowired
    private CostsOfLivingService costsOfLivingService;

    @RequestMapping(value = "/costsOfLiving/countryName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<CostsOfLiving> getByCountryName(@RequestParam("countryName") String countryName) {
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
