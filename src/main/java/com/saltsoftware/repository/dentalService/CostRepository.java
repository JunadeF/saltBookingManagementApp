package com.saltsoftware.repository.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.dentalService.CostRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CostRepository extends JpaRepository<Cost, String> {

    void update(Cost updated);

    Cost create(Cost cost);

    Cost read(String costID);

    void delete(String costID);

    boolean getAll();
}
