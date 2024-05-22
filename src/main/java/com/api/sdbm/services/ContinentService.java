package com.api.sdbm.services;

import com.api.sdbm.model.entity.Continent;
import com.api.sdbm.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ContinentService {

    private final com.api.sdbm.repository.ContinentRepository ContinentRepository;

    @Autowired
    public ContinentService(ContinentRepository ContinentRepository) {
        this.ContinentRepository = ContinentRepository;
    }

    public List<Continent>

    getAllContinents() {
        return ContinentRepository.findAll();
    }

    public Continent getContinentById(Integer id) {
        Optional<Continent> optionalContinent = ContinentRepository.findById(id);
        return optionalContinent.orElse(null);
    }

    public Continent createContinent(Continent Continent) {
        return ContinentRepository.save(Continent);
    }

    public Continent updateContinent(Integer id, Continent updatedContinent) {
        Optional<Continent> optionalContinent = ContinentRepository.findById(id);
        if (optionalContinent.isPresent()) {
            Continent Continent = optionalContinent.get();
            // Mise à jour des propriétés de l'Continent avec les nouvelles valeurs
            Continent.setNomContinent(updatedContinent.getNomContinent());
            return ContinentRepository.save(Continent);
        } else {
            // Continent non trouvé, retourner null ou lever une exception selon votre logique métier
            return null;
        }
    }

    public void deleteContinent(Integer id) {
        ContinentRepository.deleteById(id);
    }
}
