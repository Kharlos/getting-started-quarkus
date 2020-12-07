package org.acme.getting.started.getting.started

import org.acme.getting.started.getting.started.model.Cost
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CostServices {


    fun fetchCosts(): ArrayList<Cost> {
        var costs = ArrayList<Cost>()
        costs.add(Cost("1", "Costo 1"))
        costs.add(Cost("2", "Costo 2"))
        costs.add(Cost("3", "Costo 3"))
        costs.add(Cost("4", "Costo 4"))


        return costs
    }
}