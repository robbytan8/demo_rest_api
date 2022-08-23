package com.robby.demo_rest_api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import org.json.JSONObject;

/**
 * @author Robby Tan
 */
@Path("/hello-rest01")
public class HelloResource2 {

    @GET
    @Produces("application/json")
    public String hello(@QueryParam("name") String name) {
        String message = "{\"name\":" + name + "}";
        JSONObject jsonObject = new JSONObject(message);
        return jsonObject.toString();
    }
}
