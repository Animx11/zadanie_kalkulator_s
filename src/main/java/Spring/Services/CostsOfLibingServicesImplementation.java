package Spring.Services;

import Spring.Entities.CostsOfLiving;
import Spring.Repositories.CostsOfLivingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CostsOfLibingServicesImplementation implements CostsOfLivingService {

    @Autowired
    private CostsOfLivingRepository costsOfLivingRepository;

    @Override
    public CostsOfLiving save(CostsOfLiving costsOfLiving){
        return costsOfLivingRepository.save(costsOfLiving);
    }

    @Override
    public void delete(String countryName){
        costsOfLivingRepository.delete(countryName);
    }


    @Override
    public Iterable<CostsOfLiving> getByCountryName(String countryName){
        return costsOfLivingRepository.findByCountryName(countryName);
    }


}
