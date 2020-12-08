package com.saltsoftware.repository.dentalService.impl;
import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.repository.dentalService.CostRepository;

import java.util.HashMap;
import java.util.Set;

///**
// * Created by :Junade Frizlar
// * Student no: 208046402
// * Description: Cost Repository
// */

    public class CostRepositoryImpl {

    private Set<Cost>CostDB;
    public  static CostRepository costRepository = null;

    ///Constructor
    public CostRepositoryImpl(){
    this.CostDB = new HashMap<>();
}

    public static CostRepository getCostRepository(){
    if (costRepository == null)
        costRepository = (CostRepository) new CostRepositoryImpl();
        return costRepository;
}

///create Cost
    public Cost create(Cost cost) {
        this.CostDB.add(cost);
        return cost;
    }

///read from Cost database

    public Cost read(String costID){
        Cost cost = null;
        for (Cost c : this.CostDB){
            if (c.getCostID().equalsIgnoreCase(costID)){
                cost = c;
                break;
            }
        }
        return cost;
    }

///updates existing cost

    public Cost update(Cost cost){
        Cost oldCost = read(cost.getCostID());
        if (oldCost != null){
            this.CostDB.remove(oldCost);
            this.CostDB.add(cost);
        }
        return cost;
    }

///removes a cost

    public boolean delete(String costID){
        Cost cost = read(String costID); {
            if (cost != null);
            this.CostDB.remove(cost);

            return false;
        }
    }
}
