package com.saltsoftware.controller.dentalService;

import com.saltsoftware.entity.dentalService.Cost;
import com.saltsoftware.factory.dentalService.CostFactory;
import com.saltsoftware.service.dentalService.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

/*
 *
 * @author Junade Frizlar
 * Student#: 208046402
 * Class desc: CostController
 *
 */
    @CrossOrigin(origins = "http://localhost:4200")
    @RestController
    @RequestMapping("/cost")
    public class CostController {
    //injecting the constructor, calling cost type service
    @Autowired

    private CostService costService;


    @PostMapping("/create")
    @ResponseBody
    public Cost create(@RequestBody Cost cost){
        Cost newCost = CostFactory.createCost(cost.getCostID(), cost.getAmount());
        return costService.create(newCost);
    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public Cost read(@PathVariable String id){
        return costService.read(id);
    }

    //getall
    @GetMapping("/all")
    @ResponseBody
    public Set<Cost> getAll(){
        return costService.getAll();
    }

    //update
    @PostMapping("/update")
    @ResponseBody
    public Cost update(@RequestBody Cost cost){
        return costService.update(cost);
    }

    //delete
    @DeleteMapping ("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        costService.delete(id);
    }

}
