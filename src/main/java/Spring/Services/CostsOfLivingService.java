package Spring.Services;

import Spring.Entities.CostsOfLiving;

public interface CostsOfLivingService {

    CostsOfLiving save(CostsOfLiving costsOfLiving);
    void delete(String countryName);

    Iterable<CostsOfLiving> getByCountryName(String countryName);
}
