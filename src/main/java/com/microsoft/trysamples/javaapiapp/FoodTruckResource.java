package com.microsoft.trysamples.javaapiapp;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.*;

/**
 * HelloWorld JaxRS resource.
 */
@Path("/")
@Api
public class FoodTruckResource {

private ArrayList<FoodTruck> list = new ArrayList<FoodTruck>();

	public FoodTruckResource() {
		list.add(new FoodTruck(1, "Foodtruck 1", "Address 1", 15, true, false, true, false));
		list.add(new FoodTruck(2, "Foodtruck 2", "Address 2", 20, false, false, true, true));
	}

  
    @GET
    @Path("foodtrucks/")
    @Produces("application/json")
    @ApiOperation("Retrieves all the food trucks available")
    public ArrayList<FoodTruck> getFoodTrucks(){
        return list;
    }
}
