package Spring.Repositories;

import Spring.Entities.CostsOfLiving;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CostsOfLivingRepository extends CrudRepository<CostsOfLiving, String> {


    @Query("select c from CostsOfLiving c where c.countryName like ?1")
    Iterable<CostsOfLiving> findByCountryName(String countryName);

    @Query("select currencyTable from CostsOfLiving c where c.countryName like ?1")
    char findCurrencyTableForCountry(String countryName);

    @Query("select currencyCode from CostsOfLiving c where c.countryName like ?1")
    String findCurrencyCodeForCountry(String countryName);

    @Query("select incomeTax from CostsOfLiving c where c.countryName like ?1")
    float findIncomeTaxForCountry(String countryName);

    @Query("select fixedCosts from CostsOfLiving c where c.countryName like ?1")
    int findFixedCostsForCountry(String countryName);


}
