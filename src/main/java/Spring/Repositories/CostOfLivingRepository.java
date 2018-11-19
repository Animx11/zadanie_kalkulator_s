package Spring.Repositories;

import Spring.Entities.CostsOfLiving;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CostOfLivingRepository extends CrudRepository<CostsOfLiving, String> {

    //CostsOfLiving findById(String countryName);

    @Query("select c from CostsOfLiving c where c.countryName like ?1")
    Iterable<CostsOfLiving> findByCountryName(String countryName);


}
